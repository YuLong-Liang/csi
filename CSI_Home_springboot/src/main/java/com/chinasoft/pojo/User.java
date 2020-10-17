package com.chinasoft.pojo;

public class User {
    private long id;
    private String loginname;
    private String password;
    private String status;
    private String createdate;
    private String username;
    private String faceurl;
    private String facepath;
    
    public String getCreatedate() {
		return createdate;
	}
    public String getFacepath() {
		return facepath;
	}
    public String getFaceurl() {
		return faceurl;
	}
    public long getId() {
		return id;
	}
    public String getLoginname() {
		return loginname;
	}
    public String getPassword() {
		return password;
	}
    public String getStatus() {
		return status;
	}
    public String getUsername() {
		return username;
	}
    public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
    public void setFacepath(String facepath) {
		this.facepath = facepath;
	}
    public void setFaceurl(String faceurl) {
		this.faceurl = faceurl;
	}
    public void setId(long id) {
		this.id = id;
	}
    public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
    public void setPassword(String password) {
		this.password = password;
	}
    public void setStatus(String status) {
		this.status = status;
	}
    public void setUsername(String username) {
		this.username = username;
	}
    
   @Override
  public String toString() {
	// TODO Auto-generated method stub
	return id+loginname+password;
   }
    
}
