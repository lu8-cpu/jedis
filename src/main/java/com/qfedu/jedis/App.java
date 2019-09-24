package com.qfedu.jedis;

import com.qfedu.utils.JedisUtils;
import redis.clients.jedis.Jedis;

public class App {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("118.31.2.64", 6379, 1000);


//        String age = jedis.get("age");
//        System.out.println(age);
//
//        jedis.set("name","zhangsan");

//        jedis.hset("person","name","zhangsan");
//        //再次设置name值，会把上一个名字覆盖
//        jedis.hset("person","name","lisi");
//        jedis.hset("person","age","20");

        Jedis jedis1 = JedisUtils.getJedis();
        System.out.println(jedis1.get("name"));
        JedisUtils.closeJedis(jedis1);

    }
}
