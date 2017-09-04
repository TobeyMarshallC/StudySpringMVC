package com.springmvc.test.redis;

import redis.clients.jedis.Jedis;

import java.util.Set;

/**
 * Set（无序，不重复集合） 类型实例
 * Created by Administrator on 2017/9/4.
 */
public class RedisSet {

    public static void main(String[] args) {
        try{
            Jedis jedis = new Jedis("127.0.0.1",6379);
            System.out.println("连接成功");

//            jedis.sadd("mycar2","haval");
//            jedis.sadd("mycar2","brand");
//            jedis.sadd("mycar2","suv");

            Set<String> set = jedis.smembers("mycar2");
            for (String ss : set){
                System.out.println(ss);
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
