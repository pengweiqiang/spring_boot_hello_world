package com.will;

import org.springframework.web.bind.annotation.*;

/**
 * 获取参数示例
 * Created by pengweiqiang on 2017/10/28.
 */
@RestController
@RequestMapping("/user")
public class RequestMappingController {

    /**
     * PathVariable用法
     * 示例：http://localhost:8082/will/user/login/admin/123
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value="/login/{userName}/{password}",method = RequestMethod.GET)
    public String login(@PathVariable("userName")String userName,@PathVariable("password")String password){
        return userName+"  "+password;
    }

    /**
     * RequestParam用法
     * 示例：http://localhost:8082/will/user/login2?userName=admin&password=123
     * @param userName
     * @param password
     * @return
     */
    @RequestMapping(value="/login2",method = RequestMethod.GET)
//    @GetMapping("/login2") 等同于上面
    public String login2(@RequestParam(value = "userName",required = false,defaultValue = "")String userName, @RequestParam("password")String password){
        return userName+"  "+password;
    }



}
