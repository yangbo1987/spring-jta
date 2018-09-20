package com.spring.cloud.es.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.cloud.es.entity.UserEntity;
import com.spring.cloud.es.service.UserService1;

@RestController
public class HelloController {
	
	@Autowired
	private UserService1 service1;

	@RequestMapping("/add")
	public String hello() throws InterruptedException{
		UserEntity e1=new UserEntity();
		e1.setName("name2");
		e1.setAge(12);
		service1.addUser1(e1);
		return "success";
	}
	
	@RequestMapping("/update")
	public String hello2() throws InterruptedException{
		UserEntity e1=new UserEntity();
		e1.setId(1);
		e1.setName(null);
		e1.setAge(18);
		service1.updateUser1(e1);
		return "success";
	}
	
	@RequestMapping("/update2")
	public String hello3() throws InterruptedException{
		UserEntity e1=new UserEntity();
		e1.setId(1);
		e1.setName(null);
		e1.setAge(19);
		service1.updateUser2(e1);
		return "success";
	}

}
