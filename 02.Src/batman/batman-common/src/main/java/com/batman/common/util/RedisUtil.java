package com.batman.common.util;

import org.apache.ibatis.io.ResolverUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

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
    //控制一个pool最多有多少个状态为idle（空闲的）的jedis实例，默认值也是8
    private static int MAX_IDLE = PropertiesFileUtil.getInstance("redis").getInt("master.redis.max_idle");
    //等待可用连接最大时间
    private static int MAX_WAIT = PropertiesFileUtil.getInstance("redis").getInt("master.redis.max_wait");
    //超时时间
    private static int TIMEOUT = PropertiesFileUtil.getInstance("redis").getInt("master.redis.timeout");

    private static boolean TEST_ON_BORROW = false;

    private static JedisPool jedisPool = null;

    public final static int EXRP_HOUR = 60 * 60;    //一小时
    public final static int EXRP_DAY = 60 * 60 * 24;        //一天
    public final static int EXRP_MONTH = 60 * 60 * 24 * 30; //一个月

    private static void initialPool() {
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxTotal(MAX_ACTIVE);
            config.setMaxIdle(MAX_IDLE);
            config.setMaxWaitMillis(MAX_WAIT);
            config.setTestOnBorrow(TEST_ON_BORROW);
            jedisPool = new JedisPool(config, IP, PORT, TIMEOUT);
        } catch (Exception e) {
            _log.error("First create JedisPool error: " + e);
        }
    }

    private static synchronized void poolInit() {
        if (null == jedisPool) {
            initialPool();
        }
    }

    public synchronized static Jedis getJedis() {
        poolInit();
        Jedis jedis = null;
        try {
            if (null == jedisPool) {
                jedis = jedisPool.getResource();
                try {
                    jedis.auth(PASSWORD);
                } catch (Exception e) {

                }
            }
        } catch (Exception e) {
            _log.error("Get jedis error : " + e);
        }
        return jedis;
    }
}
