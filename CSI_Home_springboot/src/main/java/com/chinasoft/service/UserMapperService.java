package com.chinasoft.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.chinasoft.pojo.Department;
import com.chinasoft.pojo.User;

public interface UserMapperService {
	
	List<User> selectAllUser(User user);
	
	List<User> selectPreUser();
	
	void addUser(User user);
	
	void updateUser(User user);
	
    void deleteUser(long id);
    
    User login(String loginname,String password);
	
}
