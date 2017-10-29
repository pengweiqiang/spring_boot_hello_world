package com.will;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloworldspringbootApplicationTests {

	@Test
	public void contextLoads() {
		RestTemplate restTemplate = new RestTemplate();
		String name = "小米";
		int age = 13;
//		User user = restTemplate.postForObject("http://localhost:8082/will/addUser?name="+name+"&age="+age,null,User.class);
//		System.out.println(user.toString());
	}

	@Test
	public void updateUser(){
		RestTemplate restTemplate = new RestTemplate();
		Integer id = 1;
		String name = "小12雅2你好3";
		Integer age = 16;

		restTemplate.put("http://localhost:8082/will/updateUser/"+id+"?name="+name+"&age="+age,null);
//		System.out.println("修改成功"+user.toString());
	}

	@Test
	public void deleteUser(){
//		RestTemplate restTemplate = new RestTemplate();
//		Integer id = 2;
//		restTemplate.delete("http://localhost:8082/will/deleteUser/"+id);
	}


	@Test
	public void getUserByid(){
//		RestTemplate restTemplate = new RestTemplate();
//		Integer id = 1;
//		ResponseEntity<User> userResponseEntity = restTemplate.getForEntity("http://localhost:8082/will/getUserById/"+id,User.class);
//		System.out.println(userResponseEntity.toString());
	}

}
