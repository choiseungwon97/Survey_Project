package com.mis.survey.domain;

import java.util.Date;

public class DemographicVO {

//	인구통계학적 설문

/*	CREATE TABLE SV_DEMOGRAOHIC
	(
		SESSION_ID           VARCHAR2(500) NOT NULL ,
		GENDER               CHAR(1) NOT NULL ,
		AGE                  NUMBER NOT NULL ,
		JOB                  CHAR(1) NOT NULL ,
		POSIT                VARCHAR2(100) NOT NULL ,
		CAREER               NUMBER NOT NULL ,
		MARITAL_STATUS       CHAR(1) NOT NULL ,
		MAJOR                VARCHAR2(200) NULL ,
		NAME                 VARCHAR2(50) NULL ,
		REGDATE              DATE DEFAULT  SYSDATE  NULL ,
		ID                   VARCHAR2(30) NULL 
	);*/

	private String sessionId;

	private String gender;
	private int age;
	private String job;
	private String posit;
	private int career;
	private String marital;
	private String major;
	private String id;
	private String name;
	private Date regdate;
	
	
	public String getPosit() {
		return posit;
	}
	public void setPosit(String posit) {
		this.posit = posit;
	}

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	
	
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	public int getCareer() {
		return career;
	}
	public void setCareer(int career) {
		this.career = career;
	}
	public String getMarital() {
		return marital;
	}
	public void setMarital(String marital) {
		this.marital = marital;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "DemographicVO [sessionId=" + sessionId + ", gender=" + gender + ", age=" + age + ", job=" + job
				+ ", posit=" + posit + ", career=" + career + ", marital=" + marital + ", major=" + major + ", id=" + id
				+ ", name=" + name + ", regdate=" + regdate + "]";
	}
	
	
	
	

}
