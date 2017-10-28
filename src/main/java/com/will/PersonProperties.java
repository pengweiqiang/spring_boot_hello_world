package com.will;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by pengweiqiang on 2017/10/28.
 * 获取application.yml中person对象的配置
 */
@Component
@ConfigurationProperties(prefix = "person")
public class PersonProperties {

    private String name;
    private Integer age;
    private String address;


    public String getName() {
        return name;
    }

    public void setNamel(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "PersonProperties{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}


