//package com.chinasoft.controller;
//
//import java.util.List;
//import java.util.Map;
//
//import org.apache.ibatis.annotations.Param;
//import org.apache.logging.log4j.LogManager;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.chinasoft.pojo.User;
//import com.chinasoft.service.impl.UserMapperServiceImpl;
//
//@Controller
//@RequestMapping("/user")
//public class UserMapperController {
//	
//	@Autowired
//	UserMapperServiceImpl service;
//	
//	//ת��URL��user_main.jsp 
//	@RequestMapping("/main")
//	public String Intent(Map map) {
//		return "user_main";
//	}
//	
//	@PostMapping("/pre_insert")
//	public ModelAndView toBeUser(@Param("id")int id
//			,@Param("username")String username
//			,@Param("password")String password
//			,@Param("phone")String phone
//			,@Param("address")String address
//			,@Param("email")String email
//			,@Param("c_id")int c_id){
//		System.out.println("���뵽pre_insert!");
//		User user = new User(id,username,password,phone,address,email,c_id);
//		System.out.println(user);
//		ModelAndView mov = new ModelAndView();
//		mov.setViewName("forward:/user/insertUser");
//		mov.addObject("user", user);
//		return mov;
//	}
//	
//	@PostMapping("/pre_update")
//	public ModelAndView pre_update(@Param("id")int id
//			,@Param("username")String username
//			,@Param("password")String password
//			,@Param("phone")String phone
//			,@Param("address")String address
//			,@Param("email")String email
//			,@Param("c_id")int c_id
//			,@Param("updatingId")int updatingId){
//		System.out.println("���뵽pre_update!updatingId="+updatingId);
//		User user = new User(id,username,password,phone,address,email,c_id);
//		System.out.println(user);
//		ModelAndView mov = new ModelAndView();
//		mov.setViewName("forward:/user/updateUserById");
//		mov.addObject("user", user);
//		mov.getModel().put("updatingId", updatingId);
//		return mov;
//	}
//	
//	
//	@PostMapping("/getUserById")
//	@ResponseBody
//	public User getUserById(@Param("id")int id) {
////		System.out.println("getUserById������");
//		User user = service.getUserById(id);
////		System.out.println("user="+user);
////		map.put("message", "Id����һ���û�"+user);
//		return user;
//	}
//	
//	@RequestMapping("/getAllUser")
//	@ResponseBody
//	public List<User> getAllUser(Map map) {
////		System.out.println("getAllUser������");
//		List<User> users = service.getAllUser();
////		System.out.println("users="+users);
////		map.put("message", "���������û�"+users);
//		return users;
//	}
//	
//	@RequestMapping("/insertUser")
//	public String InsertUser(Map map,User user) {
////		System.out.println("insertUser������");
////		User user = new User(6,"4","44","44","44@qq.com","444",1);
//		service.insertUser(user);
//		map.put("message", "�ɹ�����һ���û�"+user);
//		return "user_main";
//	}
//	
//	@RequestMapping("/deleteUserById")
//	@ResponseBody
//	public List<User> DeleteUserById(Map map,int id) {
////		int id = 6;
////		System.out.println("insertUser������");
//		service.deleteUserById(id);
//		map.put("message", "�ɹ�ɾ��IdΪ"+id+"���û�");
//		List<User> users = service.getAllUser();
//		return users;
//	}
//	
//
//	@RequestMapping("/updateUserById")
//	public String UpdateUserById(Map map,User user,int updatingId) {
////		int id = 4;
////		User user = new User(6,"4","44","44","44@qq.com","444",1);
////		System.out.println("updating������updatingId="+updatingId);
//		service.updateUserById(user,updatingId);
//		map.put("message", "�ɹ���IdΪ"+updatingId+"��user����Ϊ="+user);
//		return "user_main";
//	}
//	
////	����û���Ӧһ������
//	@PostMapping("/selectAllUserOneDepartment")
//	@ResponseBody
//	public List<User> SelectAllOne(Map map,@Param("id")Integer c_id){
////		int c_id=1;
//		System.out.println("SelectAllOne������c_id="+c_id);
//		List<User> users = service.selectAllOne(c_id.intValue());
//		System.out.println(users);
//		map.put("message", "SelectAllOne"+users);
//		return users;
//	}
//	
////	һ�����Ű�������û�
//	@RequestMapping("/selectDepartmentAllUser")
//	@ResponseBody
//	public Department SelectDepartmentAllUser(Map map,int id){
////		int id=1;
////		System.out.println("SelectDepartmentAllUser������id="+id);
//		Department department = service.selectDepartmentUser(id);
////		System.out.println(department);
////		map.put("message", "SelectDepartmentAllUser"+department);
//		return department;
//	}
//}
