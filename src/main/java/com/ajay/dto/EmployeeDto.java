package com.ajay.dto;

import java.io.Serializable;

public class EmployeeDto  implements Serializable{ //since it have to be share to another project
	private Integer eno;
	private String ename;
	private String desg;
	private float basicSalary;
	
	
	//alt+shit+s,r
	public Integer getEno() {
		return eno;
	}
	public void setEno(Integer eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(float basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	
	
	

}
