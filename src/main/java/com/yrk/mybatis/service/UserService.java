package com.yrk.mybatis.service;

import java.util.List;

import com.yrk.mybatis.model.User;

public interface UserService {

	List<User> getUsers();
	
	User getUser(Long userId);
	
	void insert(User user);
	void update(User user);
	void delete(Long id);
}
