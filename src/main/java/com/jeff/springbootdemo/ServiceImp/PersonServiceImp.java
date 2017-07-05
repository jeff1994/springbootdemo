package com.jeff.springbootdemo.ServiceImp;

import com.jeff.springbootdemo.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/2 0002.
 */
@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    PersonDao personDao;

    public Person returnPerson(int id) {
        return  personDao.getPersonMapper(id);
    }
}
