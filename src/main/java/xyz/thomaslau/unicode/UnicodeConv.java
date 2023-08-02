package xyz.thomaslau.unicode;

import java.lang.Character.UnicodeBlock;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vdurmont.emoji.EmojiParser;

public class UnicodeConv {
    private Logger logger = LoggerFactory.getLogger(UnicodeConv.class);

    protected CharMappingFilter charMappingFilter;
    // 纯汉字/标点符号的CJK 可以剔除
    public static final Pattern PATTERN_CJK = Pattern.compile("[\\u3000-\\u321F\\u3230-\\u327F\\u3290-\\u33AF\\u33E0-\\u9FA5\\pP‘’“” |]");
    // 纯英文、标点、数字
    public static final Pattern PATTERN_EN = Pattern.compile("[a-zA-Z0-9\\pP‘’“” |]");
    // 全部
    public static final Pattern PATTERN_UCS4_All = Pattern.compile("[\\x{00010000}-\\x{00101fff}]");
    // 部分，即安全无表义字符
    public static final Pattern PATTERN_UCS4_Part = Pattern.compile("[\\x{00010000}-\\x{000101ff}\\x{00010350}-\\x{00101fff}]");
    // \\pP \p{Punct} 标点符号：!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
    // 韩语字符/Surrogates/private即几乎不能表意或不兼容展示的字符集
    public static final Pattern PATTERN_KOREA = Pattern.compile("[\\uAC00—\\uD7AF\\uE000-\\uF8FF]");
    public static final Pattern PATTERN_CHINESE_EN = Pattern.compile("[a-zA-Z0-9\\u4E00-\\u9FA5\\pP‘’“” |]");
    // 以下正则用于文本处理，非标准化逻辑
    public static final Pattern SELF_EMOJI = Pattern.compile("\\[fn=[^]]+\\]|\\[emo[^]]*\\]");
    public static final String CHINESE_COMMA = "。？！，、；：“”‘'（）《》〈〉【】『』「」﹃﹄〔〕…—～~﹏￥";
    public static final Pattern PATTERN_CHINESE_COMMA = Pattern.compile("[" + CHINESE_COMMA + "]");
    // 用于字符处理，～--#*= 一些干扰符号
    public static final Pattern PATTERN_RISKABLESOL = Pattern.compile("[-——～_#*=]");
    public static final Pattern PATTERN_CLEAN = Pattern.compile("[^a-zA-Z0-9\\u4E00-\\u9FA5]");
    public static final Pattern PATTERN_PY = Pattern.compile("[^a-zA-Z0-9\\u4E00-\\u9FA5\\pP‘’“” |]");

    public static String RighToLeft = new String(CodeUtil.decodeHexString("202E"), StandardCharsets.UTF_16BE);

    /**
     * 1. 去除表情、ucs4即四位编码的UTF字符集
     * 2. 返回过滤表情、干扰线、控制符等无用字符【即支持的语言(中文/英文/标点等)】
     * 3. 除了包含镜像符，尽量保证原来的字符顺序
     * 4. TODO 待加上繁简转换
     * @param source
     * @return
     */
    public String nomalize(String source) {
//        // String fmsrc = filterKOREA(filterPartUCS4(filterEmoji(source)));
//        String fmsrc = filterKOREA(filterEmoji(source));
//        String step_CJK = PATTERN_CJK.matcher(fmsrc).replaceAll("");
//        if ("".equals(step_CJK)) { // 高性能处理仅含 中文/表情/标点 等场景，线上大多数场景
//            return doNoNorm(fmsrc);
//        } else if ("".equals(PATTERN_EN.matcher(step_CJK).replaceAll(""))) {     // 高性能处理仅含 中文/表情/标点/英文 等场景，线上次大多数场景
//            return doSimpleNorm(fmsrc);
//        } else {
//            // fmsrc = filterKOREA(filterAllUCS4(filterEmoji(preFilter(source))));
//            fmsrc = filterKOREA(filterEmoji(preFilter(source)));
//        }
        String fmsrc = filterKOREA(filterEmoji(preFilter(source)));
        if (fmsrc.length() < 4) {
            return fmsrc;
        }
        int idx = fmsrc.indexOf(RighToLeft);
        if (idx >= 0) {
            fmsrc = fmsrc.substring(0, idx) + new StringBuilder(fmsrc.substring(idx + 1, fmsrc.length())).reverse();
        }
        logger.debug("text prefiltered: {}.", fmsrc);
        StringBuilder sb = new StringBuilder();
        char[] bchars = new char[4];
        for (int i = 0; i < fmsrc.length(); i++) {
            ASCIIFolding.filter(fmsrc.charAt(i), bchars);
            for (char c : bchars) {
                if (c != 0) {
                    sb.append(c);
                }
            }
        }
        fmsrc = sb.toString();
        logger.debug("text ASCIIFoldinged: {}.", fmsrc);
        // logger.debug("before byUnicodeBlock:{}", CodeUtil.encodeHexString(fmsrc.getBytes(StandardCharsets.UTF_16BE)));
        fmsrc = byUnicodeBlock(fmsrc);
        return fmsrc;
    }

    // 这里实际已经排除UCS4，即PATTERN_UCS4_All，即 HIGH/Low Surrogates，
    // 但这里codePoints预留处理 HIGH/Low Surrogates 场景
    // 按block如果删除则替换空，如果mmap存在则替换，否则相应处理。后续优化可去掉mmap get操作
    private String byUnicodeBlock(String fmsrc) {
        StringBuilder sb = new StringBuilder();
        for (int codePoint : fmsrc.codePoints().toArray()) {
            processByCodePoint(sb, codePoint);
        }
        // fmsrc.codePoints().forEach(is->System.out.println(Integer.toHexString(is)));
        return sb.toString();
    }

    // 按codepoint处理，目前版本不传入上下文
    private void processByCodePoint(StringBuilder sb, int codePoint) {
        UnicodeBlock cpt = Character.UnicodeBlock.of(codePoint);
        // 这里尽量不用cpt即UnicodeBlock判断，因为比如：codePoint=0x10330时，在有的JDK版本(如1.8)是unassigned，但其实现在是有效的
        // java.lang.Character.UnicodeBlock.blockStarts
        if (null != cpt && cpt.equals(UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS)) { // 4E00—9FFF
            sb.append(Character.toChars(codePoint));
        } else if (null != cpt && cpt.equals(UnicodeBlock.BASIC_LATIN)) { // 0000-007f
            doBASIC_LATIN(sb, codePoint);
        } else if (null != cpt && cpt.equals(UnicodeBlock.LATIN_1_SUPPLEMENT)) {// 0080-00ff
            sb.append(Character.toChars(codePoint));
        } else if (codePoint >= 0x0100 && codePoint < 0x02B0) { // 0100-02B0
            // !!!
            // asciifoldinged donothing. Latin Extended-A/Latin Extended-B/IPA Extensions
        } else if ((null != cpt && cpt.equals(UnicodeBlock.COMBINING_DIACRITICAL_MARKS)) // 02B0-0370
                || (null != cpt && cpt.equals(UnicodeBlock.SPACING_MODIFIER_LETTERS))) {
            do0370_3000(sb, codePoint);
        } else if (codePoint >= 0x0370 && codePoint < 0x31FF) {
            do0370_3000(sb, codePoint);
        } else if (codePoint >= 0x3000 && codePoint < 0x31FF) {
            // TODO Kanbun 3190—319F 可以做些处理
            // 其他中英韩文字母/音标/偏旁部首等可忽略
        } else if (codePoint >= 0x3200 && codePoint < 0x3400) {
            do3200_3400(sb, codePoint);
        } else if ((null != cpt && cpt.equals(UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A))// 3400—4DBF
                || (null != cpt && cpt.equals(UnicodeBlock.YIJING_HEXAGRAM_SYMBOLS))) {// 4DC0—4DFF
            // 这里的中文/经易不处理
        } else if (codePoint >= 0xA000 && codePoint < 0x10140) {
            if ((codePoint >= 0xA000 && codePoint < 0xA490) // Yi Syllables
                    || (codePoint >= 0xA500 && codePoint < 0xA640) 
                    || (codePoint >= 0xA700 && codePoint < 0xA720) 
                    || (codePoint >= 0xA800 && codePoint < 0xA900)
                    || (codePoint >= 0xAAE0 && codePoint < 0xAB30)
                    // Hangul Jamo Extended-B,High/Low/HighPrivateUse Surrogates,privateusearea
                    || (codePoint >= 0xABC0 && codePoint < 0xF900)
                    // CJK Compatibility Ideographs(其实部分可匹配), Arabicxxx, variation,Vertical,
                    // Combining Half Marks,CJK Compatibility Forms
                    || (codePoint >= 0xF900 && codePoint < 0xFE50)
                    // Arabic Presentation Forms-B
                    || (codePoint >= 0xFE70 && codePoint < 0xFF00) 
                    || (codePoint >= 0xFF00 && codePoint < 0x10140)) {
                // 可以nothing todo，也可以过一遍 do0370_3000，不影响，除了性能
            } else {
                // 其他余留处理：FF00—FFEF已经ASCIIFolding处理
                do0370_3000(sb, codePoint);
            }
        } else if (codePoint >= 0x10140 && codePoint < 0x31350) {
            do1WAsciiFlt(sb, codePoint);
        } else {
            // 1. 3134F后直接E0000-10FFFF，后者目前未使用. 2. Halfwidth and Fullwidth Forms/Specials 范围ASCIIFolding做过
            // sb.append(Character.toChars(codePoint));
            String replaced = charMappingFilter.codeToString(codePoint);
            if (null != replaced) {
                sb.append(replaced);
            }
        }
    }

    private void do0370_3000(StringBuilder sb, int codePoint) {
        // 1. 2DE0—2DFF这些忽略(只不过边角)
        // 2. 中文ASCIIExtFolding不处理，比如3000-30ff,3190—319F CJK Strokes等等
        // 3. 如需中文可以前置FST替换，如日文的 ㄪ⻄㆙ 非中文万西甲
        char[] bchars = new char[2];
        ASCIIExtFolding.filter((char) codePoint, bchars);
        for (char c : bchars) {
            if (c != 0) {
                sb.append(c);
            }
        }
    }

    private void do1WAsciiFlt(StringBuilder sb, int codePoint) {
        // 10280-31350之间，1D400-1D7FF单独处理
        if (codePoint >= 0x1D400 && codePoint < 0x1D800) {
            String chars = ASCIIExtFolding.filter1D400_1D800(codePoint);
            sb.append(chars);
        } else {
            char[] bchars = new char[2];
            ASCIIExtFolding.filter1W(codePoint, bchars);
            for (char c : bchars) {
                if (c != 0) {
                    sb.append(c);
                }
            }
        }
    }

    private void do3200_3400(StringBuilder sb, int codePoint) {
        char[] bchars = new char[3];
        ASCIIExtFolding.filter3C((char) codePoint, bchars);
        for (char c : bchars) {
            if (c != 0) {
                sb.append(c);
            }
        }
    }

    private void doBASIC_LATIN(StringBuilder sb, int codePoint) {
        if (codePoint < 0x20 || codePoint == 0x7f) {
            sb.append(""); // 忽略制表
            return;
        }
        if (codePoint > 0x40 && codePoint < 0x5b) {
            // System.out.println(codePoint);
            sb.append(Character.toChars(codePoint + 0x20));
            return;
        }
        sb.append(Character.toChars(codePoint));
    }

    // 字符预处理
    private String preFilter(String source) {
        // 1. 暂时支持新增替换，
        // 2. 处理 D800-DFFF HIGH/Low Surrogates [和3结合起来，仅处理有意义字符做替换，其他直接过滤掉]
        // 3. 处理"[\\x{00010000}-\\x{000101ff}\\x{00010350}-\\x{00101fff}]"
        // 4. 以及被emojiparser过滤掉的的(因为第一步去表情，但00A9 © 是表情但也是c)
        return charMappingFilter.preFilter(source);
    }

    // PATTERN_CJK 支持的字符，几个特殊表意字符以及yy九八.com匹配即可
    private String doSimpleNorm(String fmsrc) {
        // 命中则替换，否则不变
        return charMappingFilter.normlizeChineseSentence(fmsrc);
    }

    // 纯中文，不处理
    private String doNoNorm(String fmsrc) {
        return fmsrc;
    }

    // 包括：韩语 Hangul Syllables之后的几类字符[基本不存在有效表象字符]
    public static String filterKOREA(String source) {
        return PATTERN_KOREA.matcher(source).replaceAll("");
    }

    public static String filterEmoji(String source) {
        return EmojiParser.removeAllEmojis(source);
    }

    public static String filterAllUCS4(String source) {
        return PATTERN_UCS4_All.matcher(source).replaceAll("");
    }

    public static String filterPartUCS4(String source) {
        return PATTERN_UCS4_Part.matcher(source).replaceAll("");
    }

    public void init() {
        charMappingFilter = new CharMappingFilter();
        charMappingFilter.init();
    }
}
