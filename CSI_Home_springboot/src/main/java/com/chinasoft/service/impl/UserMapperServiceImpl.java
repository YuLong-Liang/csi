package com.chinasoft.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.mapper.UserMapper;
import com.chinasoft.pojo.Department;
import com.chinasoft.pojo.User;
import com.chinasoft.service.UserMapperService;

@Service
public  class UserMapperServiceImpl implements UserMapperService {
	
	@Autowired
	UserMapper userMapper;


	@Override
	public List<User> selectAllUser(User user) {
	    
		List<User> users = userMapper.selectAllUser(user);

		return users;
	}
	@Override
	public List<User> selectPreUser() {
		// TODO Auto-generated method stub
	    List<User> users = userMapper.selectPreUser();

		return users;
	}
	
	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userMapper.addUser(user);
	}
	
	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userMapper.updateUser(user);
	}
	
	@Override
	public void deleteUser(long id) {
		// TODO Auto-generated method stub
		userMapper.deleteUser(id);
	}
	


	
	@Override
	public User login(String loginname, String password) {
		// TODO Auto-generated method stub
		User user = userMapper.login(loginname, password);
		return user;
		
	}
	
	

	
}
