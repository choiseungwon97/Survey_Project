package com.mis.survey.domain;

/*CREATE TABLE ADMIN
(
	ID		VARCHAR2(30) NOT NULL ,
	PASSWORD	VARCHAR2(30) NOT NULL ,
	COMPANY_NAME	VARCHAR2(100) NOT NULL ,
	EMPLOYEE_NAME	VARCHAR2(50) NOT NULL ,
	POST_CODE	NUMBER(5) NOT NULL,
	ADDRESS		VARCHAR2(500) NOT NULL,
	TEL		VARCHAR2(20) NOT NULL ,
	AUTHORITY	NUMBER(1) DEFAULT 1 NOT NULL 
);*/

public class AdminVO {

	private String id;
	private String password;
	private String companyName;
	private String employeeName;
	private int postCode;
	private String address;
	private String tel;
	private int authority;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAuthority() {
		return authority;
	}
	public void setAuthority(int authority) {
		this.authority = authority;
	}
	
	
	@Override
	public String toString() {
		return "AdminVO [id=" + id + ", password=" + password + ", companyName=" + companyName + ", employeeName="
				+ employeeName + ", postCode=" + postCode + ", address=" + address + ", tel=" + tel + ", authority="
				+ authority + "]";
	}
	
	
	
	
}
