/**
 * 
 */
package com.yrk.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yrk.mybatis.model.User;
import com.yrk.mybatis.service.UserService;

/**
 * @author runkaiyang
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/getUsers")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
	@RequestMapping("/getUser/{id}")
	public User getUser(@PathVariable("id") Long id) {
		return userService.getUser(id);
	}
	
	@RequestMapping("/add")
    public void save(User user) {
		userService.insert(user);
    }
    
    @RequestMapping(value="update")
    public void update(User user) {
    	userService.update(user);
    }
    
    @RequestMapping(value="/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
    	userService.delete(id);
    }
}
