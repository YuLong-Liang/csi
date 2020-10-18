package com.chinasoft.controller;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.pojo.User;
import com.chinasoft.pojo.notice;
import com.chinasoft.pojo.Job;
import com.chinasoft.service.JobMapperService;
import com.chinasoft.service.impl.JobMapperServiceImpl;
import com.chinasoft.service.impl.UserMapperServiceImpl;

import ch.qos.logback.core.status.Status;

@Controller
@RequestMapping("/job")
public class JobController {
	@Autowired
	JobMapperServiceImpl service;
	

	@RequestMapping("/selectalljob")
	@ResponseBody
	public List<Job> selectalljob() {
		List<Job> job = service.selectalljob();
		return job;
	}
	
	@RequestMapping("/selectjob")
	@ResponseBody
	public List<Job> selectjob(@Param("name") String name) {
		
		List<Job> job = service.selectjob(name);
		return job;
	}

	@RequestMapping("/insertjob")
	@ResponseBody
	public int insertjob(@Param("name") String name,@Param("remark")String remark) {
		
		
		Job job=new Job(0,name,remark);
		System.out.println("insertjob ="+job);
		service.insertjob(job);
		System.out.println("insertjob ="+job.getId());
		return job.getId();
	}
	
	@RequestMapping("/updatejob")
	@ResponseBody
	public long updatejob(@Param("id") int id,@Param("name") String name,@Param("remark")String remark) {
	
		Job job=new Job(id,name,remark);
		return service.updatejob(job);
	}
	
	@RequestMapping("/deletejob")
	@ResponseBody
	public long deletejob(@Param("name") String name) {
	
		return service.deletejob(name);
	}
}
