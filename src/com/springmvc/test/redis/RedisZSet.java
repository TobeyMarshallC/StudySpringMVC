package com.springmvc.test.redis;

import redis.clients.jedis.Jedis;

import java.util.Set;
import java.util.concurrent.Executors;

/**
 *  ZSet（有序，不重复集合） 类型实例
 * Created by Administrator on 2017/9/4.
 */
public class RedisZSet {

    public static void main(String[] args) {
        try{
            Jedis jedis = new Jedis("127.0.0.1",6379);
            System.out.println("连接成功");

            jedis.zadd("mycarz",1,"1、haval");
            jedis.zadd("mycarz",3,"2、black");
            jedis.zadd("mycarz",2,"3、suv");

            Set<String> mySet = jedis.zrange("mycarz",0,10);

            for(String str:mySet){
                System.out.println(str);
            }


        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
