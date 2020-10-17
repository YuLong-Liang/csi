package com.chinasoft.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.chinasoft.pojo.Department;
import com.chinasoft.pojo.User;

public interface UserMapperService {

	User getUserById(int id);
	
	List getAllUser();
	
	//实现插入返回int
	void insertUser(User user);
	
	void deleteUserById(int id);
	
	void updateUserById(User user, int id);
	
	List<User> selectAllOne(int c_id);
	
	public Department selectDepartmentUser(int id);
}
