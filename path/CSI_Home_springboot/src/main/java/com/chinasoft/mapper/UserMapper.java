package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasoft.pojo.Department;
import com.chinasoft.pojo.User;

public interface UserMapper {

	User selectUserById(@Param("id")int id);
	
	List<User> selectAllUser();
	
	void addUserByParameter(@Param("user")User user);
	
//	
	void deleteUserById(@Param("id")int id);
	
	void updateUserById(@Param("user")User user,@Param("id")int id);
	
	List<User> selectAllOne(@Param("c_id")int c_id);
	
	Department selectDepartmentUser(@Param("id")int id);
}
