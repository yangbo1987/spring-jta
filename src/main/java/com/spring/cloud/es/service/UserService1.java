package com.spring.cloud.es.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.cloud.es.entity.UserEntity;
import com.spring.cloud.es.test1.UserMapper1;
import com.spring.cloud.es.test2.UserMapper2;

@Service
public class UserService1 {
	@Autowired
	private UserMapper1 userMapper1;
	
	@Autowired
	private UserMapper2 userMapper2;
	
	@Transactional(rollbackFor=Exception.class)
	 public int addUser1 (UserEntity userEntity){ 
		 userMapper2.addUser(userEntity);
		 System.out.println("写入test02");
		 userMapper1.addUser(userEntity);
		 System.out.println("写入test01");
		 return 1;
	 }
	
	@Transactional(rollbackFor=Exception.class)
	 public int updateUser1 (UserEntity userEntity){ 
		 userMapper2.updateUser(userEntity);
		 System.out.println("更新test02");
		 userMapper1.updateUser(userEntity);
		 System.out.println("更新test01");
		 return 1;
	 }
	
	@Transactional(rollbackFor=Exception.class)
	 public int updateUser2 (UserEntity userEntity){ 
		 userMapper2.addUser(userEntity);
		 System.out.println("写入test02");
		 userMapper1.updateUser(userEntity);
		 System.out.println("更新test01");
		 return 1;
	 }
}