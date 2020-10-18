
package com.chinasoft.controller;

import java.text.SimpleDateFormat;


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.chinasoft.pojo.User;
import com.chinasoft.pojo.notice;
import com.chinasoft.service.impl.NoticeMapperServiceImpl;
import com.chinasoft.service.impl.UserMapperServiceImpl;


import ch.qos.logback.core.status.Status;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserMapperServiceImpl service;
	private String url = "url";
	private String path = "path";
	
	@RequestMapping("login")
	@ResponseBody
	public User login(HttpServletRequest request, HttpServletResponse response,
            HttpSession session, Model model) {
	
		String loginname = request.getParameter("loginname");
        String password = request.getParameter("password");
		User user = service.login(loginname, password);
		System.out.println(user);
		if (user != null) {
			session.setAttribute("user", user);
		}
		return user;
	}
	
	@RequestMapping("/selectAllUser")
	@ResponseBody
	public List<User> selectAllUser(@RequestParam("username")String username,@RequestParam("status")String status) {
		User user = new User();
		if(username != null) {
			user.setUsername(username);
		}
		if(!status.equals("0")) {
			user.setStatus(status);
		}
		List<User> users = service.selectAllUser(user);
		return users;
	}
	
	@RequestMapping("/selectPreUser")
	@ResponseBody
	public List<User> selectPreUser() {
		
		List<User> users = service.selectPreUser();
		return users;
	}
	
	@RequestMapping("/addUser")
	@ResponseBody
	public User addUser(@RequestParam("username")String username,@RequestParam("password")String password,@RequestParam("loginname")String loginname,@RequestParam("status")String status) {
		System.out.println("jjjjj");
		User user = new User();
		if(username!=null && password != null && loginname != null && status != null) {
			user.setUsername(username);
			user.setPassword(password);
			user.setLoginname(loginname);
			user.setStatus(status);
			user.setId(getUId());
			user.setFaceurl(url);
			user.setFacepath(path);
			user.setCreatedate(getDate());
			System.out.println(status);
			service.addUser(user);
		}else {
			System.out.println("请检查信息");
		}
		return user;
		
	}
	
	@RequestMapping("/updateUser")
	@ResponseBody
	public User updateUser(@RequestParam("username")String username,@RequestParam("id")long id,@RequestParam("loginname")String loginname,@RequestParam("status")String status) {
		User user = new User();
		user.setUsername(username);
		user.setId(id);
		user.setLoginname(loginname);
		System.out.println(status);
		if(status.equals("")) {
			status = status+"1";;
		}
		user.setStatus(status);
		service.updateUser(user);
		return user;
		
	}
	@RequestMapping("/deleteUser")
    public Map<String,Object> deleteUser(@RequestBody Long[] ids){ 
        Map<String,Object> param = new HashMap<String, Object>(); 
        for (Long id : ids) {
        	service.deleteUser(id);
		}
        System.out.println(ids);
        param.put("type","ids"); 
        return param; 
    } 
	
	public long getUId() {
		  long time = System.currentTimeMillis();
	      String s = String.valueOf(time);
	      s=s.substring(3,13);
	      long id = Long.valueOf(s);
	      System.out.println(s.length());
	      return id;
	}
	
	public String getDate() {
		Date dNow = new Date( );
        SimpleDateFormat ft =
                new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        return ft.format(dNow);
       
	}

}

