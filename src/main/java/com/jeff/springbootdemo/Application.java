package com.jeff.springbootdemo;

import com.jeff.springbootdemo.Mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2017/7/1 0001.
 */
@SpringBootApplication
public class Application   {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


}