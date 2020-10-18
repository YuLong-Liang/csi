package com.chinasoft.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.mapper.DeptMapper;
import com.chinasoft.pojo.Dept;
import com.chinasoft.service.DeptDaoService;


@Service
public class DeptDaoServiceImpl implements DeptDaoService{
	
	@Autowired
	DeptMapper mapper;

	//@Override
	//public User login(String username, String password) {
	//	User user = mapper.login(username, password);
	//	return user;
	//}
	
	@Override
	public List<Dept> selectalldept() {
		List<Dept> dept = mapper.selectalldept();
		return dept;
	}
	@Override
	public List<Dept> selectdept(String name) {
		List<Dept> dept = mapper.selectdept(name);
		return dept;
	}
	@Override
	public long updatedept(Dept dept) {
		return mapper.updatedept(dept);
	}
	@Override
	public long deletedept(String[] ids) {
		return mapper.deletedept(ids);
	}
	@Override
	public void insertdept(Dept dept) {
		System.out.println("impl insertdept ="+dept);
		mapper.insertdept(dept);
		
	}
}
