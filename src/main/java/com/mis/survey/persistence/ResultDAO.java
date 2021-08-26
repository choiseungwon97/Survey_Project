package com.mis.survey.persistence;

import com.mis.survey.domain.DemographicVO;

public interface ResultDAO {
	
	// 1. 설문 결과 - BigFive
	public int[] readBigFive(String sessionId) throws Exception;
	   
	// 2. 설문 결과 - Career
	public int[] readCareer(String sessionId) throws Exception;
		
	// 3. 설문 결과 - Job
	public int[] readJob(String sessionId) throws Exception;
	
	// 4. 설문 결과 - Demographic
	public DemographicVO readDemographic(String sessionId) throws Exception;
	
	
	// 6. 설문 결과 - JobMPS
	public String readJobMPS(String sessionId) throws Exception;
			
}
