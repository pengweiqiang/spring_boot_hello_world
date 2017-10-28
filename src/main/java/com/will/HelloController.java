package com.will;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pengweiqiang on 2017/10/28.
 */
@RestController
public class HelloController {

    @Value("${name}")
    private String name ;//获取application.yml中name单个参数
    @Value("${age}")
    private Integer age;
    @Value("${content}")
    private String content;
    //获取application.yml中person对象参数
    @Autowired
    private PersonProperties personProperties;


    @RequestMapping(value = {"/hello","/hi"},method = RequestMethod.GET)
    public String say(){
        return "Hello Spring Boot";
    }

    /**
     * 获取application.yml中的配置参数
     * @return
     */
    @RequestMapping(value = "/getConfig",method = RequestMethod.GET)
    public String getConfigParams(){
        return name +" "+age +" "+ content;
    }

    /**
     * 获取yml配置文件中的person配置项
     * @return
     */
    @RequestMapping(value = "/getPersonInfo",method = RequestMethod.GET)
    public String getPersonConfig(){
        return personProperties.toString();
    }
}
