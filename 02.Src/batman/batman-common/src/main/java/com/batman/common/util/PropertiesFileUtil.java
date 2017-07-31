package com.batman.common.util;

import java.util.Date;
import java.util.HashMap;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class PropertiesFileUtil {

    //当打开多个资源文件时，缓存资源文件
    private static HashMap<String, PropertiesFileUtil> configMap = new HashMap<>();
    // 打开文件时间，超时判断使用
    private Date loadTime = null;
    //资源文件
    private ResourceBundle resourceBundle = null;
    //默认资源文件名称
    private static final String NAME = "config";
    //缓存时间
    private static final Integer TIME_OUT = 60 * 1000;

    //私有构造函数，单例模式
    private PropertiesFileUtil(String name) {
        this.loadTime = new Date();
        this.resourceBundle = ResourceBundle.getBundle(name);
    }

    public  static synchronized PropertiesFileUtil getInstance() {
        return getInstance(NAME);
    }

    public static synchronized PropertiesFileUtil getInstance(String name) {
        PropertiesFileUtil conf = configMap.get(name);
        if (null == conf) {
            conf = new PropertiesFileUtil(name);
            configMap.put(name, conf);
        }

        //判断是否打开资源文件超时1分钟
        if ((new Date().getTime() - conf.getLoadTime().getTime()) > TIME_OUT) {
            conf = new PropertiesFileUtil(name);
            configMap.put(name, conf);
        }
        return conf;
    }

    /**
     * 根据key读取value
     * @param key
     * @return
     */
    public String get(String key) {
        try {
            String value = resourceBundle.getString(key);
            return value;
        } catch (MissingResourceException ex) {
            return "";
        }
    }

    public Date getLoadTime() {
        return loadTime;
    }
}
