package com.mis.survey.service;

import com.mis.survey.domain.DemographicVO;

public interface DemographicService {

	// 1. 설문 등록 (SV_DEMOGRAOHIC 테이블)
	public void register(DemographicVO gVo) throws Exception;

	// 2. 리스트 
}
