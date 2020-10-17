package com.chinasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.chinasoft.mapper.noticeMapper;
import com.chinasoft.pojo.notice;
import com.chinasoft.service.NoticeMapperService;

@Service
public class NoticeMapperServiceImpl implements  NoticeMapperService{
	
	@Autowired
	noticeMapper mapper;

	public void addNoticeByNotice(notice notice) {
		// TODO Auto-generated method stub
		mapper.addNoticeByNotice(notice);
		System.out.println("impl addnotice ="+notice);
	}

	@Override
	public java.util.List<notice> selectAllNoticeNoParam() {
		// TODO Auto-generated method stub
		return mapper.selectAllNoticeNoParam();
	}
	
	@Override
	public List<notice> selectAllNoticeByTitle(String TITLE) {
		// TODO Auto-generated method stub
		return mapper.selectAllNoticeByTitle(TITLE);
	}

	@Override
	public List<notice> selectAllNoticeByContent(String cONTENT) {
		// TODO Auto-generated method stub
		return mapper.selectAllNoticeByContent(cONTENT);
	}
	
	@Override
	public List<notice> selectAllNoticeByNotice(notice notice) {
		// TODO Auto-generated method stub
		return mapper.selectAllNoticeByNotice(notice);
	}

	@Override
	public long updateNoticeByNotice(notice notice) {
		// TODO Auto-generated method stub
		System.out.println("impl updatenotice ="+notice);
		return mapper.updateNoticeByNotice(notice);
	}

	@Override
	public long deleteNoticeByNotice(notice notice) {
		// TODO Auto-generated method stub
		return mapper.deleteNoticeByNotice(notice);
	}

	@Override
	public long batchDeleteNotices(String[] iDs) {
		// TODO Auto-generated method stub
		System.out.println("impl batchDeleteNotices ="+iDs);
		return mapper.batchDeleteNotices(iDs);
	}

}
