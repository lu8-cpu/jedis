package com.qfedu.utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisUtils {
    private static JedisPool jedisPool =null;

    static {
        //jedis连接池的配置对象
        JedisPoolConfig config=new JedisPoolConfig();

        config.setMaxTotal(30);
        //最少几个空闲
        config.setMinIdle(5);
        config.setMaxIdle(10);

        jedisPool =new JedisPool(config,"118.31.2.64",6379,100);
    }
    //从池中获取jedis对象
    public static Jedis getJedis(){
        return jedisPool.getResource();
    }

    public static void closeJedis(Jedis jedis){
        jedis.close();
    }
}
