package com.chinasoft.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.chinasoft.pojo.User;
import com.chinasoft.pojo.notice;
import com.chinasoft.service.impl.NoticeMapperServiceImpl;
import com.chinasoft.service.impl.UserMapperServiceImpl;

@Controller
@RequestMapping("/notice")
public class NoticeMapperController {
	
	@Autowired
	NoticeMapperServiceImpl service;
	
	@RequestMapping("/selectAllNoticeNoParam")
	@ResponseBody
	public List<notice> selectAllNoticeNoParam() {
		List<notice> notices = service.selectAllNoticeNoParam();
		return notices;
	}
	
	@RequestMapping("/selectAllNoticeByTitle")
	@ResponseBody
	public List<notice> selectAllNoticeByTitle() {
		String TITLE = "1";
		List<notice> notices = service.selectAllNoticeByTitle(TITLE);
		return notices;
	}
	
	
	@RequestMapping("/selectAllNoticeByContent")
	@ResponseBody 
	public List<notice> selectAllNoticeByContent() { 
		String CONTENT = "1";
		List<notice> notices = service.selectAllNoticeByContent(CONTENT); 
		return notices; 
	}
	
	  
	@RequestMapping("/pre_selectAllNoticeByNotice")
	public ModelAndView pre_selectAllNoticeByNotice(@Param("TITLE")String TITLE
			,@Param("CONTENT")String CONTENT){
		System.out.println("进入pre_insert!");
		notice notice = new notice(TITLE,CONTENT);
		System.out.println(notice);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("forward:/notice/selectAllNoticeByNotice");
		mav.addObject("notice", notice);
		return mav;
	}
		
	@RequestMapping("/selectAllNoticeByNotice")
	@ResponseBody 
	public List<notice> selectAllNoticeByNotice(@Param("title")String title
			,@Param("content")String content) {
		System.out.println(title);
		System.out.println(content);
		notice notice = new notice(title,content);
		List<notice> notices = service.selectAllNoticeByNotice(notice); 
		return notices; 
	}
	
	@Override
	public String toString() {
		return "NoticeMapperController [service=" + service + "]";
	}

	@RequestMapping("/addNotice")
	@ResponseBody
	public long addNotice(@Param("TITLE")String TITLE
			,@Param("CONTENT")String CONTENT
			,@Param("USER_ID")long USER_ID) {
		Date data= new Date();
		Timestamp timestamp=new Timestamp(new Date().getTime()); 
		String timeStr= timestamp .toString() 
				.substring(0,timestamp.toString().indexOf("."));
		Timestamp ts= Timestamp.valueOf(timeStr);
		notice notice = new notice(TITLE,CONTENT,ts,USER_ID);
		service.addNoticeByNotice(notice);
		return notice.getID();
	}
	
	@RequestMapping("/updateNoticeByNotice")
	@ResponseBody
	public long updateNoticeByNotice(@Param("ID")int ID
			,@Param("TITLE")String TITLE
			,@Param("CONTENT")String CONTENT
			,@Param("USER_ID")int USER_ID) {
		Date data= new Date();
		Timestamp timestamp=new Timestamp(new Date().getTime()); 
		String timeStr= timestamp .toString() 
				.substring(0,timestamp.toString().indexOf("."));
		Timestamp ts= Timestamp.valueOf(timeStr);
		notice notice = new notice(ID,TITLE,CONTENT,ts,USER_ID);
		return service.updateNoticeByNotice(notice);
	}
	
	@RequestMapping("/deleteNoticeByNotice")
	@ResponseBody
	public long deleteNoticeByNotice(@Param("ID")long ID) {
		notice notice = new notice(ID,"2","1",Timestamp.valueOf("2020-10-14 22:54:25"),2);
		return service.deleteNoticeByNotice(notice);
	}

	@RequestMapping("/batchDeleteNotices")
	@ResponseBody
	public long batchDeleteNotices(@Param("IDs")String[] IDs) {
		System.out.println("ids="+IDs);
		return service.batchDeleteNotices(IDs);
	}
	
	
}
