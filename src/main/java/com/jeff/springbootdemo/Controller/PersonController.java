package com.jeff.springbootdemo.Controller;

import com.jeff.springbootdemo.Domain.Person;
import com.jeff.springbootdemo.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by Administrator on 2017/7/1 0001.
 */
@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/now")
    String retuenDate() {
        return "现在时间：" + (new Date()).toLocaleString();
    }

    @RequestMapping("/persontest")
    Person personTest() {
        return personService.returnPerson(1);
    }

}


