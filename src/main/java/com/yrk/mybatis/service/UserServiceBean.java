/**
 * 
 */
package com.yrk.mybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yrk.mybatis.mapper.UserMapper;
import com.yrk.mybatis.model.User;

/**
 * @author runkaiyang
 *
 */
@Service
public class UserServiceBean implements UserService {
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public List<User> getUsers() {
		return userMapper.getAll();
	}

	@Override
	public User getUser(Long userId) {
		return userMapper.getOne(userId);
	}

	@Override
	public void insert(User user) {
		userMapper.insert(user);
	}

	@Override
	public void update(User user) {
		userMapper.update(user);
	}

	@Override
	public void delete(Long id) {
		userMapper.delete(id);
	}

}
