package com.springmvc.test.redis;

import redis.clients.jedis.Jedis;

/**
 * Created by Administrator on 2017/8/22.
 */
public class RedisExample {

    public static void main(String[] args) {
        //连接本地的Redis服务
        Jedis jedis = new Jedis("127.0.0.1", 6379);
        System.out.println("连接成功！");
        //密码验证
        //jedis.auth("123456");
        //查看服务是否运行
        System.out.println("服务是否运行：" + jedis.ping());
        System.out.println(jedis.get("username"));

    }
}
