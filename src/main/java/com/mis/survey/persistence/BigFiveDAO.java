package com.mis.survey.persistence;

import com.mis.survey.domain.BigFiveVO;

public interface BigFiveDAO {
	
	//1. 설문 등록 (SV_BIGFIVE 테이블)
	public void insertSV(BigFiveVO bVo) throws Exception;
	
}
