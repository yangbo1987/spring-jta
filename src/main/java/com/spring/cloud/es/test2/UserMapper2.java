package com.spring.cloud.es.test2;

import org.springframework.stereotype.Repository;

import com.spring.cloud.es.entity.UserEntity;

@Repository
public interface UserMapper2{
	
	void addUser(UserEntity entity);
	
	void updateUser(UserEntity entity);

}