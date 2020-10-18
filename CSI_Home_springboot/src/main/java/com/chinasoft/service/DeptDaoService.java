package com.chinasoft.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasoft.pojo.Dept;


public interface DeptDaoService {
	
	
	//User  login(String username,String password);
	
	List<Dept> selectalldept();
	List<Dept> selectdept(String name);
	long updatedept(Dept dept);
	long deletedept(String[] ids);
	void insertdept(Dept dept);
}
