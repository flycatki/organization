package com.batman.common.util;

import org.apache.commons.lang.StringUtils;
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

    /**
     * 设置String
     * @param key
     * @param value
     */
    public synchronized static void set(String key, String value) {
        try {
            value = StringUtils.isBlank(value) ? "" : value;
            Jedis jedis = getJedis();
            jedis.set(key, value);
            jedis.close();
        } catch (Exception e) {
            _log.error("Set key error : " + e);
        }
    }

    /**
     * 设置byte[]
     * @param key
     * @param value
     */
    public synchronized static void set(byte[] key, byte[] value) {
        try {
            Jedis jedis = getJedis();
            jedis.set(key, value);
            jedis.close();
        } catch (Exception e) {
            _log.error("Set key error : " + e);
        }
    }

    /**
     * 设置String过期时间
     * @param key
     * @param value
     * @param seconds 毫秒
     */
    public synchronized static void set(String key, String value, int seconds) {
        try {
            value = StringUtils.isBlank(value) ? "" : value;
            Jedis jedis = getJedis();
            jedis.setex(key, seconds, value);
            jedis.close();
        } catch (Exception e) {
            _log.error("Set key error : " + e);
        }
    }

    /**
     * 设置byte[]过期时间
     * @param key
     * @param value
     * @param seconds 毫秒
     */
    public synchronized static void set(byte[] key, byte[] value, int seconds) {
        try {
            Jedis jedis = getJedis();
            jedis.setex(key, seconds, value);
            jedis.close();
        } catch (Exception e) {
            _log.error("Set key error : " + e);
        }
    }

    /**
     * 获取String值
     * @param key
     * @return
     */
    public synchronized static String get(String key) {
        Jedis jedis = getJedis();
        if (null == jedis) {
            return null;
        }
        String value = jedis.get(key);
        jedis.close();
        return value;
    }

    /**
     * 获取byte[]值
     * @param key
     * @return
     */
    public synchronized static byte[] get(byte[] key) {
        Jedis jedis = getJedis();
        if (null == jedis) {
            return null;
        }
        byte[] value = jedis.get(key);
        jedis.close();
        return value;
    }

    /**
     * 删除值
     * @param key
     */
    public synchronized static void remove(String key) {
        try {
            Jedis jedis = getJedis();
            jedis.del(key);
            jedis.close();
        } catch (Exception e) {
            _log.error("Remove key error : " + e);
        }
    }

    /**
     * 删除值
     * @param key
     */
    public synchronized static void remove(byte[] key) {
        try {
            Jedis jedis = getJedis();
            jedis.del(key);
            jedis.close();
        } catch (Exception e) {
            _log.error("Remove key error : " + e);
        }
    }

    /**
     * lpush
     * @param key
     * @param strings
     */
    public synchronized static void lpush(String key, String... strings) {
        try {
            Jedis jedis = getJedis();
            jedis.lpush(key, strings);
            jedis.close();
        } catch (Exception e) {
            _log.error("lpush error : " + e);;
        }
    }

    /**
     * lrem
     * @param key
     * @param count
     * @param value
     */
    public synchronized static void lrem(String key, long count, String value) {
        try {
            Jedis jedis = getJedis();
            jedis.lrem(key, count, value);
            jedis.close();
        } catch (Exception e) {
            _log.error("lrem error : " + e);
        }
    }

    /**
     * sadd
     * @param key
     * @param value
     * @param seconds
     */
    public synchronized static void sadd(String key, String value, int seconds) {
        try {
            Jedis jedis = getJedis();
            jedis.sadd(key, value);
            jedis.expire(key, seconds);
            jedis.close();
        } catch (Exception e) {
            _log.error("sadd error : " + e);
        }
    }
}
