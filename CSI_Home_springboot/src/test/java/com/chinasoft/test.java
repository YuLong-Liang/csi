package com.chinasoft;

import java.sql.Timestamp;
import java.util.Date;

public class test {

	public static void main(String args[]) {
			Date data= new Date();
		  Timestamp timestamp=new Timestamp(new Date().getTime()); 
		  String timeStr=timestamp .toString() 
				  .substring(0,timestamp.toString().indexOf("."));
		  System.out.println(timeStr);
		  Timestamp ts= Timestamp.valueOf(timeStr);
	}
}
