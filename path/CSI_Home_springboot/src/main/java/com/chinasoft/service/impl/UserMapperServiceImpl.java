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
public class UserMapperServiceImpl implements UserMapperService {
	
	@Autowired
	UserMapper mapper;

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
//		System.out.println("����impl");
		User user = mapper.selectUserById(id);
//		System.out.println("impl_Selecteduser="+user);
		return user;
	}
	
	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
//		System.out.println("����impl");
		List<User> users = mapper.selectAllUser();
//		System.out.println("impl_Alluser="+users);
		return users;
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
//		System.out.println("����impl");
		mapper.addUserByParameter(user);
//		System.out.println("impl_InsertUser="+user);
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
//		System.out.println("����impl");
		mapper.deleteUserById(id);
//		System.out.println("impl_deleteUserId="+id);
	}

	public void updateUserById(User user, int id) {
		// TODO Auto-generated method stub
//		System.out.println("����impl");
		mapper.updateUserById(user, id);
//		System.out.println("impl_updateUserById = "+id);
	}


	@Override
	public List<User> selectAllOne(int c_id) {
		// TODO Auto-generated method stub
//		System.out.println("����impl");
		List<User> users = mapper.selectAllOne(c_id);
//		System.out.println("c_id="+c_id+"users="+users);
		return users;
	}

	public Department selectDepartmentUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("����impl");
		Department department = mapper.selectDepartmentUser(id); 
		System.out.println("id="+id+"department="+department);
		return department;
	}
	
	
	
	

	
}
