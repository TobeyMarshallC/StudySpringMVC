package com.springmvc.test.redis;

import redis.clients.jedis.Jedis;

import java.util.List;

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

        //存储List缓存数据
        jedis.lpush("booklist","你是对的");
        jedis.lpush("booklist","哈哈");
        jedis.lpush("booklist","嘿嘿");

        //获取list缓存数据
        List<String> listCache = jedis.lrange("booklist",0,3);
        for (int i = 0;i<listCache.size();i++){
            System.out.println("缓存输出："+listCache.get(i));
        }





















    }
}
