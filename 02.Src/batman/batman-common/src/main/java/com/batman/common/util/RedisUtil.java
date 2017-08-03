package com.batman.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.ReentrantLock;

public class RedisUtil {

    protected static ReentrantLock lockPool = new ReentrantLock();
    protected static ReentrantLock lockJedis = new ReentrantLock();

    private static Logger _log = LoggerFactory.getLogger(RedisUtil.class);

    //Redis服务器IP
    private static String IP = PropertiesFileUtil.getInstance("redis").get("master.redis.ip");
    // Redis端口号
    private static int PORT =  PropertiesFileUtil.getInstance("redis").getInt("master.redis.port");
    //访问密码
    private static String PASSWORD = PropertiesFileUtil.getInstance("redis").get("master.redis.password");
    //可用连接实例最大数目，默认值为8
    private static int MAX_ACTIVE = PropertiesFileUtil.getInstance("redis").getInt("master.redis.max_active");
}
