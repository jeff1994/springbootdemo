package com.jeff.springbootdemo.dao;

import com.jeff.springbootdemo.Domain.Person;
import com.jeff.springbootdemo.Mapper.PersonMapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/7/2 0002.
 */
@Component
public class PersonDao {
    @Resource
    private PersonMapper PersonMapper;

    // private final SqlSession sqlSession;

   /* public PersonDao(SqlSession sqlSession){
        this.sqlSession=sqlSession;
    }*/

    public Person getPersonMapper(int id) {
        // return  this.sqlSession.selectOne("selectPersonById",id);
        return this.PersonMapper.selectByPrimaryKey(id);
    }

    public int insertPersonMapper() {
        Person person = new Person();
        person.setName("张三1");
        person.setAddress("深圳市");
        person.setAge(1);
        //  person.setId(2);
        return this.PersonMapper.insert(person);


    }
}
