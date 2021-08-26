package com.mis.survey.persistence;

import com.mis.survey.domain.JobVO;

public interface JobDAO {
	
	//1. 설문 등록 (SV_Career 테이블)
	public void insert(JobVO jVo) throws Exception;
	
	// 2. 설문 업데이트
	public void update(JobVO jVo) throws Exception;
}
