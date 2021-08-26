package com.mis.survey.persistence;

import com.mis.survey.domain.DemographicVO;

public interface DemographicDAO {

	//1. 설문 등록 (SV_Career 테이블)
	public void insert(DemographicVO gVo) throws Exception;
	
}
