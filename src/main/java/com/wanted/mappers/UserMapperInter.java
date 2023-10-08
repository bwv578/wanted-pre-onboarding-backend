package com.wanted.mappers;

import org.apache.ibatis.annotations.Insert;

import com.wanted.models.user.UserTO;

public interface UserMapperInter {
	
	// 신규유저 등록
	@Insert("insert into user values(0, #{name}, #{email})")
	public int insertUser(UserTO user);
	
}
