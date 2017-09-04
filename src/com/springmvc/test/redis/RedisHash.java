package com.springmvc.test.redis;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

/**
 * Hash（哈希）类型实例
 * Created by Administrator on 2017/9/4.
 */
public class RedisHash {

    public static void main(String[] args) {
        try{
            Jedis jedis = new Jedis("localhost", 6379);
            System.out.println("连接成功");

            Map<String,String> myMap = new HashMap<String, String>();
            myMap.put("brand","haval");
            myMap.put("width","4385cm");
            myMap.put("color","black");

            //set
            jedis.hmset("mycar",myMap);

            //get
            Map<String,String> resMap = jedis.hgetAll("mycar");
            System.out.println(resMap);
            System.out.println(resMap.keySet());



        }catch(Exception ex){

        }
    }

}
