package xyz.thomaslau.unicode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

public class SensitiveFilter {
    private Logger logger = LoggerFactory.getLogger(SensitiveFilter.class);

    public String filterSensitive(String content, Set<String> keySet) {
        String normalTxt = nomalize(content);
        logger.debug("nomalized text:{}", normalTxt);
        for (String key : keySet) {
            if (CodeUtil.contains(normalTxt, key)) {
                return key;
            }
        }
        return "";
    }

    public String nomalize(String content) {
        // 字符标准化 [仅含中文、英文、数字、中文标点、英文标点、空格制表等、全角半角]
        String normalTxt = unicTextUtils.nomalize(content);
        logger.debug("nomalized text:{}", normalTxt);
        normalTxt = formatter(normalTxt);
        logger.debug("formatter text:{}", normalTxt);
        normalTxt = normalTxt.toLowerCase();
        return normalTxt;
    }

    private static String formatter(String input) {
        // 敏感词过滤策略，这里1）去除汉语标点符号 2）去除空格
        input = UnicodeConv.PATTERN_CHINESE_COMMA.matcher(input).replaceAll("");
        input = UnicodeConv.SELF_EMOJI.matcher(input).replaceAll("");
        // input = UnicTextUtils.PATTERN_RISKABLESOL.matcher(input).replaceAll("").replaceAll(" ", "");
        input = UnicodeConv.PATTERN_CLEAN.matcher(input).replaceAll("").replaceAll(" ", "");
        return input;
    }

    public String filterPinyin(String input, Set<String> pinyinSet) throws BadHanyuPinyinOutputFormatCombination {
        input = formaterNumbers(input);
        String pinyins = PinyinHelper.toHanYuPinyinString(input, pyFormat, "", true);
        logger.debug("pinyin text:{}", pinyins);
        for (String key : pinyinSet) {
            if (CodeUtil.contains(pinyins, key)) {
                return key;
            }
        }
        return "";
    }

    private String formaterNumbers(String input) {
        for (Entry<String, String> entry : NUM_CHI.entrySet()) {
            input = input.replace(entry.getKey(), entry.getValue());
        }
        return input;
    }

    private Map<String, String> NUM_CHI;
    private UnicodeConv unicTextUtils;
    private HanyuPinyinOutputFormat pyFormat;

    public void initUnCode() {
        unicTextUtils = new UnicodeConv();
        unicTextUtils.init();
        // unicTextUtils.charMappingFilter.info();
    }

    public void initPinyin() {
        HanyuPinyinOutputFormat format = new HanyuPinyinOutputFormat();
        format.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        format.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
        pyFormat = format;

        NUM_CHI = new HashMap<>();
        NUM_CHI.put("1", "一");
        NUM_CHI.put("2", "二");
        NUM_CHI.put("3", "三");
        NUM_CHI.put("4", "四");
        NUM_CHI.put("5", "五");
        NUM_CHI.put("6", "六");
        NUM_CHI.put("7", "七");
        NUM_CHI.put("8", "八");
        NUM_CHI.put("9", "九");
        NUM_CHI.put("0", "零");
    }

}
