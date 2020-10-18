package com.chinasoft.pojo;

public class Dept {
	long id;
	String name;
	String remark;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Dept(String name, String remark) {
		super();
		this.name = name;
		this.remark = remark;
	}
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", name=" + name + ", remark=" + remark + "]";
	}
	public Dept(long id, String name, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.remark = remark;
	}


}
