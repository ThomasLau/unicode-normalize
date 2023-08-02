package xyz.thomaslau.unicode;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

public class UnicodeTest {
    SensitiveFilter sensitiveFilter = new SensitiveFilter();
    // @Test
    public void test() {
        String srcTxt = "𐌴123ƁƇƦDNDֲ ץf中国世界ᕩ૦fᑕ123ᑥ123𐁙𐃌123𐊆𐅕𐐽g𐊎𐌑I𐌍𐌼𝐄𝑤𝓡𝚨𝚷无聊的文字𑴍𑲯𑲯𑲯𑲯 𑲂𑲓𑲏𑲯𑲯 𑲯  ";
        srcTxt+="请进入【γ--γ--⑼--⑻ . ℃℃】老司机都是在旁边没人TUiwen❼⑥⑥\n  ww wd@jd z້໌ᮨ7້໌ᮨs້໌ᮨ.້໌ᮨc້໌ᮨ້໌ᮨ c້໌ᮨ12";
        srcTxt+="刘̶懒̶弃̶打开̶Ⓩ⑦Ⓢ. ⓒⓒ日̶、̶韩̶、̶欧̶、̶美̶ ̶都̶有̶\nⒸⒼ书22t4.̶ᥴoꪔ\n̶释̶放̶你̶的̶ ̶谷̶欠̶ ̶望̶\n̶你̶手机进【уу⑨⑧ .ⒸⒸ】";
        srcTxt+="\n\t©ᥴoꪔ уу⑨⑧ .ⒸⒸꤜꪉꪑꪔꪗꪕꦒꫧ꧶ꤜꫀ꧑꧟꧔꧒ꪇꪝ\uAB35\uAB36\uAB46\uAB5A궶";
        srcTxt+="ʱʲʸтмᎩᱛΒAA©®ⒶУ У ⑨ ⑧ . с~сУ__У__⑨ __⑧ . С__СУΕЕΕ․ССУ у⑨&nbsp; ⑧ . С с";
        srcTxt+="\n\tＣｗ₴$₰¢₤₳₲₪₵₣₱฿¤₡₮₭₩ރ₢₥₫₦zł﷼₠₧₯₨Kčर₹ƒ₸￠℉γ--γ--⑼--⑻ . ℃℃旬君羊У-У-⑻-⑼ . C-С У--У-- ⑨-- ⑧ . С~-СУ у⑨&nbsp; уу⑧⑨ . С с";
        System.out.println(sensitiveFilter.nomalize(srcTxt));
    }
    @Test
    public void testLongTxt() {
        String srcTxt = "уу⑨⑧ .ⒸⒸ𐌴123ƁƇƦDNDֲ ץf̶懒̶弃̶打开̶Ⓩ⑦Ⓢ. ⓒⓒ日ᕩ૦fᑕ123ᑥ123𐁙𐃌123𐊆𐅕𐐽g𐊎𐌑I𐌍𐌼𝐄𝑤𝓡𝚨𝚷";
        // String srcTxt = "𐅕𐌍𝚷";
        // System.out.println(CodeUtil.encodeHexString(CodeUtil.strToUTF16BEByte("𐅕0𐌍0𝚷")));
        assertEquals("testSimple", "yy98ccc123bcrdndf懒弃打开z7scc日eofc123c123123emcgmminmewraii", sensitiveFilter.nomalize(srcTxt));
    }
    @Test
    public void testR2LPunctuation202E() {
        String dirtyTxt = "𐌼‮abcde";
        assertEquals("Ooops, this false!!!", false, dirtyTxt.contains("edc"));
        assertEquals("Ooops, this false!!!", false, dirtyTxt.replaceAll("[^a-z]", "").contains("edc"));
        assertEquals("Ooops, this true!!!", true, dirtyTxt.replaceAll("[^a-z]", "").equals("abcde"));
        assertEquals("Ooops, this true!!!", true, dirtyTxt.contains("cde"));
        assertEquals("yeees, this true!!!", true, sensitiveFilter.nomalize(dirtyTxt).contains("edc"));
        System.out.println(CodeUtil.encodeHexString(CodeUtil.strToUTF16BEByte(dirtyTxt)));
    }
    @Test
    public void testShort() {
        String srcTxt = "Ⓩ⑦Ⓢ. ⓒⓒУ__У__⑨ __⑧ . С__СУΕЕΕ․ССγ--γ--⑼--⑻ . ℃℃У-У-⑻-⑼ . C-С";
        assertEquals("testSimple", "z7sccyy98ccyeeeccyy98ccyy89cc", sensitiveFilter.nomalize(srcTxt));
    }
    @Test
    public void pinyin() throws Exception {
        Set<String> hset = new HashSet<>();
        hset.add("dou yin");
        hset.add("nabula");
        String dirtyWords = "好的段评豆殷na不拉给家人们安利下9̶s̶2̶c̶.̶com⑧⑨.ⒸⒸ";
        String fpinyin = sensitiveFilter.filterPinyin(dirtyWords, hset);
        assertEquals("filter pinyin success.", "nabula", fpinyin);
    }

    @Before
    public void setUp(){
        sensitiveFilter.initUnCode();
        sensitiveFilter.initPinyin();
    }
}
