package com.chinasoft.pojo;

import java.sql.Timestamp;

public class notice {
	
	private int ID;
	private String TITLE;
    private String CONTENT;
    private Timestamp CREATE_DATE;
    private int USER_ID;
    
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
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
	public int getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(int uSER_ID) {
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
	
	public notice(String tITLE, String cONTENT, Timestamp cREATE_DATE, int uSER_ID) {
		super();
		TITLE = tITLE;
		CONTENT = cONTENT;
		CREATE_DATE = cREATE_DATE;
		USER_ID = uSER_ID;
	}
	
	public notice(String tITLE, String cONTENT) {
		super();
		TITLE = tITLE;
		CONTENT = cONTENT;
	}
	public notice(int uSER_ID) {
		super();
		USER_ID = uSER_ID;
	}
	public notice(int iD, String tITLE, String cONTENT, Timestamp cREATE_DATE, int uSER_ID) {
		super();
		ID = iD;
		TITLE = tITLE;
		CONTENT = cONTENT;
		CREATE_DATE = cREATE_DATE;
		USER_ID = uSER_ID;
	}
		
	
	

    
    
}
