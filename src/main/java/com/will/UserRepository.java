package com.will;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by pengweiqiang on 2017/10/28.
 */
public interface UserRepository extends JpaRepository<User,Integer>{

    //通过年龄查询用户列表
    public List<User> findByAge(Integer age);
}
