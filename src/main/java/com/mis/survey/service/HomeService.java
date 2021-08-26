package com.mis.survey.service;

import com.mis.survey.domain.DemographicVO;

public interface HomeService {

	// 1. 설문 참여 여부 확인
	public String check(String sessionId) throws Exception;

	
}
