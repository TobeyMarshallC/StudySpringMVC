package com.springmvc.test.redis.pool;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.HashMap;
import java.util.Map;

/**
 * Redis工具类,用于获取RedisPool.
 * Created by Administrator on 2017/9/4.
 */
public class RedisTool {

    private RedisTool() {
    }

    private static Map<String, JedisPool> maps = new HashMap<String, JedisPool>();

    /**
     * 获取连接池.
     *
     * @return 连接池实例
     */
    private static JedisPool getPool(String ip, int port) {
        String key = ip + ":" + port;
        JedisPool pool = null;
        if (!maps.containsKey(key)) {
            JedisPoolConfig config = new JedisPoolConfig();

            return null;
        }


        return null;
    }
}