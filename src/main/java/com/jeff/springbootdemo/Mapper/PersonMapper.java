package com.jeff.springbootdemo.Mapper;

import com.jeff.springbootdemo.Domain.Person;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;


/**
 * Created by Administrator on 2017/7/2 0002.
 */
@Mapper
public interface PersonMapper {
    Person selectPersonById(int id);
}
