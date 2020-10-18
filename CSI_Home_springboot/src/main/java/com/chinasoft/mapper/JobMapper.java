package com.chinasoft.mapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.chinasoft.pojo.Job;
@Mapper
public interface JobMapper {
	
	List<Job> selectalljob();
	List<Job> selectjob(String name);
	long updatejob(@Param("job")Job job);
	  long deletejob(String name);
	  void insertjob(@Param("job")Job job);
	  
}
