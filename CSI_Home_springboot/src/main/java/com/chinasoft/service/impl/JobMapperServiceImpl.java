package com.chinasoft.service.impl;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.chinasoft.mapper.JobMapper;
import com.chinasoft.mapper.UserMapper;
import com.chinasoft.pojo.Department;
import com.chinasoft.pojo.Job;
import com.chinasoft.service.JobMapperService;
@Component
@Mapper
public class JobMapperServiceImpl  implements JobMapperService{
	@Autowired
	JobMapper jobmapper;

	
	
	@Override
	public List<Job> selectalljob() {
		List<Job> job = jobmapper.selectalljob();
		return job;
	}
	@Override
	public List<Job> selectjob(String name) {
		List<Job> job = jobmapper.selectjob(name);
		return job;
	}
	@Override
	public long updatejob(Job job) {
		return jobmapper.updatejob(job);
	}
	@Override
	public long deletejob(String name) {
		return jobmapper.deletejob(name);
	}
	@Override
	public void insertjob(Job job) {
		System.out.println("impl insertjob ="+job);
		jobmapper.insertjob(job);
		
	}
}
