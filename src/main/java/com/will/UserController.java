package com.will;

import com.will.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by pengweiqiang on 2017/10/28.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private UserService userService;

    /**
     * 查询所有用户列表
     * @return
     */
    @GetMapping(value = "/getUsers")
    public List<User> getUserList(){

        List<User> userList = userRepository.findAll();

        return userList;
    }

    /**
     * 添加一个用户
     * @param name
     * @param age
     * @return
     */
    @PostMapping(value = "/addUser")
    public User addUser(@RequestParam("name")String name,@RequestParam("age")Integer age){
        User user = new User();
        user.setAge(age);
        user.setName(name);
        return userRepository.save(user);
    }

    /**
     * 查询一个用户
     * @param id
     * @return
     */
    @GetMapping(value = "/getUserById/{id}")
    public User getUserById(@PathVariable("id")Integer id){
        User user = userRepository.findOne(id);
        return user;
    }

    @GetMapping(value = "/getUserByAge/{age}")
    public List<User> getUserByAge(@PathVariable("age")Integer age){
        List<User> users = userRepository.findByAge(age);
        return users;
    }

    /**
     * 删除某个用户
     * @param id
     */
    @DeleteMapping(value = "/deleteUser/{id}")
    public void deleteUser(@PathVariable("id")Integer id){
        userRepository.delete(id);
    }

    /**
     * 更新用户
     * @param id
     * @param name
     * @param age
     * @return
     */
    @PutMapping(value = "/updateUser/{id}",produces = "text/html;charset=UTF-8")
    public User updateUser(@PathVariable("id")Integer id,@RequestParam("name")String name,@RequestParam("age")Integer age){
        User user  = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        User newUser = userRepository.save(user);
        System.out.println(newUser);
        return newUser;
    }


    /**
     * 添加两个User
     */
    @PostMapping(value = "/addTwoUser")
    public void addTwoUser(){
        userService.insertTwoUser();
    }
}
