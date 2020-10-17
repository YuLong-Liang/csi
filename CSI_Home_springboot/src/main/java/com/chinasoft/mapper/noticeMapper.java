package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinasoft.pojo.notice;

public interface noticeMapper {
	
	public List<notice> selectAllNoticeNoParam();
	
	public List<notice> selectAllNoticeByTitle(@Param("TITLE")String TITLE);
	
	public List<notice> selectAllNoticeByContent(@Param("CONTENT")String CONTENT);
	
	public List<notice> selectAllNoticeByNotice(@Param("notice")notice notice);
	
//	返回值从ID取
	public void addNoticeByNotice(@Param("notice")notice notice);
//	返回默认返回行数
	public long updateNoticeByNotice(@Param("notice")notice notice);
//	返回被影响条数
	public long deleteNoticeByNotice(@Param("notice")notice notice);
	
	public long batchDeleteNotices(String[] IDs);
}
