package com.wanted.models.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wanted.mappers.UserMapperInter;

@Repository
public class UserDAO {

	@Autowired
	private UserMapperInter userMapper;
	
	public void insertUser(UserTO user) {
		userMapper.insertUser(user);
	}
	
}
