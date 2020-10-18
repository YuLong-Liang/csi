package com.chinasoft.service;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;


import com.chinasoft.pojo.Department;
import com.chinasoft.pojo.Job;
@Component
@Mapper
public interface JobMapperService {
	
	List<Job> selectalljob();
	List<Job> selectjob(String name);
	  long updatejob(Job job);
		long deletejob(String name);
		void insertjob(Job job);
}
