package com.will.service;

import com.will.User;
import com.will.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by pengweiqiang on 2017/10/29.
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //事务管理
    @Transactional
    public void insertTwoUser(){
        User user = new User();
        user.setAge(11);
        user.setName("AA");
        userRepository.save(user);


        User user2 = new User();
        user2.setAge(21);
        user2.setName("ABCDEFGHIJKLMNsdfsdfsdfsdf");
        userRepository.save(user2);
    }

}
