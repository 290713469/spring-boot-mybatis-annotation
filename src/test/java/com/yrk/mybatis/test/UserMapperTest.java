package com.yrk.mybatis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yrk.mybatis.enums.Gender;
import com.yrk.mybatis.mapper.UserMapper;
import com.yrk.mybatis.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testInsert() {
		User u = new User();
		u.setGender(Gender.MAN);
		u.setNickName("test");
		u.setPassWord("xxx");
		u.setUserName("tttttt");
		userMapper.insert(u);
	}
}
