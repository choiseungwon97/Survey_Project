package com.mis.survey.service;

import com.mis.survey.domain.JobVO;

public interface JobService {

	// 1. 설문 등록 (SV_JOB 테이블)
	public void register(JobVO jVo) throws Exception;
	
	// 2. 설문 업데이트
	public void modify(JobVO jVo) throws Exception;
}
