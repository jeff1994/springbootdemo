package com.jeff.springbootdemo.dao;

import com.jeff.springbootdemo.Domain.Person;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/7/2 0002.
 */
@Component
public class PersonDao {
    private final SqlSession sqlSession;

    public PersonDao(SqlSession sqlSession){
        this.sqlSession=sqlSession;
    }

    public Person getPersonMapper(int id) {
        return  this.sqlSession.selectOne("selectPersonById",id);
    }
}
