package com.chinasoft.service;

import java.util.List;

import com.chinasoft.pojo.notice;

public interface NoticeMapperService {

	public void addNoticeByNotice(notice notice);
	
	public List<notice> selectAllNoticeNoParam();
	
	public List<notice> selectAllNoticeByTitle(String TITLE);

	public List<notice> selectAllNoticeByContent(String cONTENT);
	
	public List<notice> selectAllNoticeByNotice(notice notice);
	
	public long updateNoticeByNotice(notice notice);

	long deleteNoticeByNotice(notice notice);

	long batchDeleteNotices(String[] iDs);
}
