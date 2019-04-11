/**
 * 
 */
package com.yrk.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.yrk.mybatis.enums.Gender;
import com.yrk.mybatis.model.User;

/**
 * @author runkaiyang
 *
 */
public interface UserMapper {
	
	@Select("SELECT * FROM USER")
	@Results({
		@Result(property = "gender", column = "gender", javaType = Gender.class),
		@Result(property = "nickName", column = "nick_name")
	})
	List<User> getAll();
	
	@Select("SELECT * FROM USER WHERE id = #{id}")
	@Results({
		@Result(property = "gender", column = "gender", javaType = Gender.class),
		@Result(property = "nickName", column = "nick_name")
	})
	User getOne(Long id);
	
	@Insert("INSERT INTO users(userName,passWord,gender) VALUES(#{userName}, #{passWord}, #{gender})")
	void insert(User user);
	
	@Update("UPDATE users SET userName=#{userName},nick_name=#{nickName} WHERE id =#{id}")
	void update(User user);
	
	@Delete("DELETE FROM users WHERE id =#{id}")
	void delete(Long id);
}
