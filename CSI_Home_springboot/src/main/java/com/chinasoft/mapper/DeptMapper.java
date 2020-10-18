package com.chinasoft.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import com.chinasoft.pojo.Dept;

public interface DeptMapper {

	  //@Select("select * from user where id = #{id}")
	  //User selectUserByParameter(int id);
	
	  
	  //List<User>  selectUserOrder(@Param("column")String column);
	  
	  //User selectOnAll(int id);
	  
	  //User login(@Param("username") String username,@Param("password")String password);
	  
	  List<Dept> selectalldept();
	  List<Dept> selectdept(String name);
	  long updatedept(@Param("dept")Dept dept);
	  long deletedept(String[] ids);
	  void insertdept(@Param("dept")Dept dept);
	  
}
