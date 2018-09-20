package com.spring.cloud.es.test1;

import org.springframework.stereotype.Repository;

import com.spring.cloud.es.entity.UserEntity;

@Repository
public interface UserMapper1{
	
	void addUser(UserEntity entity);
	
	void updateUser(UserEntity entity);

}