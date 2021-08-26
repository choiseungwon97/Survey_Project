package com.mis.survey.service;

import java.util.List;

import com.mis.survey.domain.DemographicVO;

public interface AdminResultService {

	// 1. 유저 조회
    public DemographicVO read(String sessionId) throws Exception;
			
	// 2. 유저 검색처리(페이징버전)
	//public List<DemographicVO> listSearch(SearchCriteria cri) throws Exception;

	//public int listSearchCount(SearchCriteria cri) throws Exception;
	
    
    public List< DemographicVO> DemographicList() throws Exception;

	
	// 3. 설문 결과 - BigFive
	public int[] readBigFive(String sessionId) throws Exception;
		   
	// 4. 설문 결과 - Career
	public int[] readCareer(String sessionId) throws Exception;
			
	// 5. 설문 결과 - Job
	public int[] readJob(String sessionId) throws Exception;
		
	// 6. 설문 결과 - Demographic
	public DemographicVO readDemographic(String sessionId) throws Exception;
		
	// 7. 설문 결과 - JobMPS
	public String readJobMPS(String sessionId) throws Exception;
}
