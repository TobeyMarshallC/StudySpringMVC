package com.springmvc.test.redis;

import redis.clients.jedis.Jedis;

/**
 * Created by Administrator on 2017/8/22.
 */
public class TestRedis {
    public static void main(String[] args) {
        Jedis jedis = null;
        try{
            jedis = new Jedis("127.0.0.1",6379);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {

        }

    }
}
