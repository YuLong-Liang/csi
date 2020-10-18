package com.chinasoft.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.chinasoft.pojo.User;
import com.chinasoft.pojo.Dept;
import com.chinasoft.service.impl.DeptDaoServiceImpl;

@Controller
@RequestMapping("/dept")
public class DeptController {

	@Autowired
	DeptDaoServiceImpl  service;
	
	//@RequestMapping("login")
	//public String login(String username,String password,Model model){
	//			User user = service.login(username, password);
	//			System.out.println(user);
	//			if (user!=null) {	
	//				model.addAttribute("user", user);
	//				return "main";
	//			}else {
	//				model.addAttribute("message", "HELLO");
	//				return "forward:/login.jsp";
	//			}		 
	//}
	
	//@RequestMapping("test")
	//@ResponseBody
	//public User login1(){
	//	User user = service.login("admin", "123456");
	//	return user;			 
	//}
	

	
	@RequestMapping("/selectalldept")
	@ResponseBody
	public List<Dept> selectalldept() {
		List<Dept> dept = service.selectalldept();
		return dept;
	}
	
	@RequestMapping("/selectdept")
	@ResponseBody
	public List<Dept> selectdept(@Param("name") String name) {
		List<Dept> dept = service.selectdept(name);
		System.out.println("selectdept ="+dept);
		return dept;
	}
	
	@RequestMapping("/insertdept")
	@ResponseBody
	public long insertdept(@Param("name") String name,@Param("remark")String remark) {
		
		
		Dept dept=new Dept(name,remark);
		System.out.println("insertdept ="+dept);
		service.insertdept(dept);
		System.out.println("insertdept ="+dept.getId());
		return dept.getId();
	}
	
	@RequestMapping("/updatedept")
	@ResponseBody
	public long updatedept(@Param("id") long id,@Param("name") String name,@Param("remark")String remark) {
		Dept dept=new Dept(id,name,remark);
		return service.updatedept(dept);
	}
	
	@RequestMapping("/deletedept")
	@ResponseBody
	public long deletedept(@Param("ids")String[] ids) {

		return service.deletedept(ids);
	}
	
	
}
