package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasoft.pojo.Department;
import com.chinasoft.pojo.User;

public interface UserMapper {
	
	List<User> selectAllUser(User user);
	
	List<User> selectPreUser();
	
	void addUser(User user);
	
	void updateUser(User user);
	
	void deleteUser(long id);
	
	User login(@Param("loginname")String loginname,@Param("password")String password);
}
