package com.jeff.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Created by Administrator on 2017/7/1 0001.
 */
@SpringBootApplication

public class Application   {


    public static void main(String[] args) {
        System.out.println("测试");
        System.out.println("测试忽略git提交文件");
        System.out.println("测试使用spring-boot-maven-plugin中fork强制重启的功能。");
        SpringApplication.run(Application.class, args);
    }


}