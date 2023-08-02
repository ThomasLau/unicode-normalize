package xyz.thomaslau.unicode;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CharMappingFilter {
    private static Logger logger = LoggerFactory.getLogger(CharMappingFilter.class);
    // 简单映射实现，可替换 1）为数组+二分查找 2）分段-segment匹配(保证两次比较)或skiplist
    // value是string，因为某些字符可表示多个/双字符含义， key应为char，但暂为string
    private Map<Integer, String> mmap = new ConcurrentHashMap<>();
    // 用于前置过滤，快速替换，不宜size过大。用于通过暴力替换方式处理新的表意字符，或ucs4字节
    private Map<String, String> mmap_pre = new ConcurrentHashMap<>();

    private Map<String, String> mmap_chinese = new ConcurrentHashMap<>();
    
    private String PATH_DEFT = "./normalize.txt";
    private String mappingFilePath;

    public String normlize(String input) {
        return mmap.get(input.codePointAt(0));
    }

    public String codeToString(int input) {
        return mmap.get(input);
    }

    public String preFilter(String source) {
        if (isEmpty(source)) {
            return source;
        }
        for (Entry<String, String> entry : mmap_pre.entrySet()) {
            source = source.replaceAll(entry.getKey(), entry.getValue());
        }
        return source;
    }

    
    public void init() {
        String filePath = PATH_DEFT;
        if (!isEmpty(mappingFilePath)) {
            filePath = mappingFilePath;
        }
        BufferedReader br = null;
        try {
            InputStream stream = CharMappingFilter.class.getClassLoader().getResourceAsStream(filePath);
            InputStreamReader isr = new InputStreamReader(stream, "UTF-8");
            br = new BufferedReader(isr);
            String read;
            int type = 0;
            while ((read = br.readLine()) != null) {
                if (isEmpty(read)) {
                    continue;
                }
                if (read.startsWith("# post")) { // 几乎不用，除漏掉的
                    type = 2;
                } else if (read.startsWith("# chinese")) {
                    type = 3;
                } else if (read.startsWith("# pre")) {
                    type = 1;
                }
                String[] arr = read.split("=");
                if (arr.length != 2) {
                    continue;
                }
                String src = arr[0].trim();
                if (type == 1 || type == 3) {
                    String key = src;
                    if (src.length() > 1) { // 超过1则转化，TODO 处理4字节后，这里统一一下
                        try {
                            if(key.startsWith("0x") || key.startsWith("\\u")) {
                                key = key.substring(2);
                            }else {
                                key = Integer.toHexString(Integer.parseInt(key));
                            }
                            key = CodeUtil.hexStringToStr(key);
                        } catch (Exception e) {
                            logger.error("err decode hex: " + src, e);
                            key = "";
                        }
                    }
                    if (type == 1) {
                        mmap_pre.put(key, arr[1]);
                    } else if (type == 3) {
                        mmap_chinese.put(key, arr[1]);
                    }
                } else if (type == 2) {
                    int key = 0;
                    if (src.length() > 1) {
                        try {
                            key = Integer.parseInt(src, 16);
                        } catch (Exception e) {
                            logger.error("err parseInt: " + src, e);
                            key = 0;
                        }
                    } else {
                        key = src.codePointAt(0);
                    }
                    if (key != 0) {
                        mmap.put(key, arr[1]);
                    }
                }
            }
            stream.close();
        } catch (Exception e) {
            logger.error("err_read initFile", e);
        } finally {
            closeQuitely(br);
        }
        // log.info("init succed:{},{},{}", mmap, mmap_chinese, mmap_pre);
        info();
    }

    public String normlizeChineseSentence(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            String rep = mmap_chinese.get("" + input.charAt(i));
            if (null != rep) {
                sb.append(rep);
            } else {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }

    public static boolean isEmpty(String source) {
        return null == source || "".equals(source.trim());
    }

    public static void closeQuitely(Closeable br) {
        if (null == br) {
            return;
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void info() {
        logger.info("Normal:pre-{},che-{},post-{}", mmap_pre, mmap_chinese, mmap);
    }

    public String getMappingFilePath() {
        return mappingFilePath;
    }

    public void setMappingFilePath(String mappingFilePath) {
        this.mappingFilePath = mappingFilePath;
    }
}
