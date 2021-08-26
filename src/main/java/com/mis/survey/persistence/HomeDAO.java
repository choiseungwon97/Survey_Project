package com.mis.survey.persistence;

public interface HomeDAO {
	
	// 1. 설문 참여 여부 확인
	public String check(String sessionId) throws Exception;
	   

			
}
