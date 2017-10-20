package com.jeff.springbootdemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zyc on 2017/10/20 0020.
 */
@RestController
public class RedisDemo {
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @RequestMapping("getredisvalue")
    public String getRedisValue(String key) {
        String message = stringRedisTemplate.opsForValue().get(key);
        System.out.println(message);
        if (message == null) {
            message = "redis中没有你查找的key";
        }
        return message;

    }

    @RequestMapping("setredisvalue")
    public String setRedisValue(String key, String value) {


       /*

        HashMap hashMap=new HashMap();
        hashMap.put("1","1");
        hashMap.put("2","2");
        stringRedisTemplate.opsForValue().multiSet(hashMap);*/

        stringRedisTemplate.opsForValue().set(key, value);
        String getValue = stringRedisTemplate.opsForValue().get(key);
        System.out.println(getValue);
        System.out.println(value);
        if (value.equals(getValue)) {
            return "设置成功,key-value值是" + key + "--" + value;
        } else
            return "设置失败!";

    }

    @RequestMapping("redislisttest")
    public void redisListTestDemo() {
        LinkedList list1 = new LinkedList();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        LinkedList list2 = new LinkedList();
        list2.add("4");
        list2.add("5");
        list2.add("6");
        stringRedisTemplate.opsForList().rightPushAll("list", list2);
        stringRedisTemplate.opsForList().leftPushAll("list", list1);
        List listOut = stringRedisTemplate.opsForList().range("list", 0, stringRedisTemplate.opsForList().size("list"));
        System.out.println(listOut);
    }

    @RequestMapping("redishashtest")
    public void redisHashTestDemo() {
        HashMap hashMap = new HashMap();
        hashMap.put("1", "1");
        hashMap.put("2", "2");
        hashMap.put("3", "3");
        stringRedisTemplate.opsForHash().putAll("map", hashMap);
        Object value = stringRedisTemplate.opsForHash().get("map", "1");
        System.out.println(value);
        System.out.println(stringRedisTemplate.opsForHash().entries("map"));


    }

    @RequestMapping("redissettest")
    public void redisSetTestDemo() {
        String[] strarrays = new String[]{"strarr1", "sgtarr2"};
        stringRedisTemplate.opsForSet().add("set", strarrays);
        stringRedisTemplate.opsForSet().add("set", "sgtarr3");
        stringRedisTemplate.opsForSet().remove("set", "sgtarr3");
        System.out.println(stringRedisTemplate.opsForSet().members("set"));
        Cursor cursor = stringRedisTemplate.opsForSet().scan("set", ScanOptions.NONE);
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }

    }
}
