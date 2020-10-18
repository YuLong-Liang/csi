package com.chinasoft.pojo;

import java.sql.Timestamp;

public class notice {
	
	private long ID;
	private String TITLE;
    private String CONTENT;
    private Timestamp CREATE_DATE;
    private long USER_ID;
    
	
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}
	public String getCONTENT() {
		return CONTENT;
	}
	public void setCONTENT(String cONTENT) {
		CONTENT = cONTENT;
	}
	public Timestamp getCREATE_DATE() {
		return CREATE_DATE;
	}
	public void setCREATE_DATE(Timestamp cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}
	
	
	
	public long getID() {
		return ID;
	}
	public void setID(long iD) {
		ID = iD;
	}
	public long getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(long uSER_ID) {
		USER_ID = uSER_ID;
	}
	@Override
	public String toString() {
		return "notice [ID=" + ID + ", TITLE=" + TITLE + ", CONTENT=" + CONTENT + ", CREATE_DATE=" + CREATE_DATE
				+ ", USER_ID=" + USER_ID + "]";
	}
	public notice() {
		super();
	}
	
	
	public notice(String tITLE, String cONTENT) {
		super();
		TITLE = tITLE;
		CONTENT = cONTENT;
	}
	public notice(String tITLE, String cONTENT, Timestamp cREATE_DATE, long uSER_ID) {
		super();
		TITLE = tITLE;
		CONTENT = cONTENT;
		CREATE_DATE = cREATE_DATE;
		USER_ID = uSER_ID;
	}
	public notice(long iD, String tITLE, String cONTENT, Timestamp cREATE_DATE, long uSER_ID) {
		super();
		ID = iD;
		TITLE = tITLE;
		CONTENT = cONTENT;
		CREATE_DATE = cREATE_DATE;
		USER_ID = uSER_ID;
	}
	public notice(long iD) {
		super();
		ID = iD;
	}
	
	
	
		
	
	

    
    
}
