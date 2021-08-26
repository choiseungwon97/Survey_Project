package com.mis.survey.persistence;

import java.util.List;

import com.mis.survey.domain.DemographicVO;

public interface AdminResultDAO {
	
	//1. 회원 조회
	public DemographicVO read(String sessionId) throws Exception;
	
	
	//2. 회원 검색처리(페이징 버전)
	//public List<DemographicVO> listSearch(SearchCriteria cri) throws Exception;
	
	//public int listSearchCount(SearchCriteria cri) throws Exception;
	
	
	//페이징 없는 버전
	public List<DemographicVO> DemographicList() throws Exception;

	
	
	//admin_result에 나와야하는 설문
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
