package com.mis.survey.service;

import com.mis.survey.domain.BigFiveVO;

public interface BigFiveService {

	// 1. 설문 등록 (SV_BIGFIVE 테이블)
	public void registerSv(BigFiveVO bVo) throws Exception;

}
