package com.jeff.springbootdemo.Controller;

import com.jeff.springbootdemo.Domain.Person;
import com.jeff.springbootdemo.Service.PersonService;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.session.SessionProperties;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/1 0001.
 */
@RestController
public class PersonController {

    private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    PersonService personService;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @RequestMapping("/")
    String home() {
        System.out.println("你啊你");
        return "Hello World!";
    }

    @RequestMapping("/now")
    String retuenDate() {
        return "现在时间：" + new Date();
    }

    @RequestMapping("/persontest")
    public Person personTest() {
        System.out.println(logger);
        logger.info("测试log4j的使用");
        return personService.returnPerson(1);
    }

    @RequestMapping("insertperson")
    public int insertperson() {
        System.out.println("插入一条人员信息");
        return personService.insertPersonMapper();
    }




}


