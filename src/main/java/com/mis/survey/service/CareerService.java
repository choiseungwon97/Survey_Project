package com.mis.survey.service;

import com.mis.survey.domain.CareerVO;

public interface CareerService {

	//1. 설문 등록 (SV_CAREER 테이블) -- career_q
	public void register(CareerVO cVo) throws Exception;
	
	// 2. 설문 수정1 (SV_Career 테이블) -- career_q2
	public void Modify1(CareerVO cVo) throws Exception;
	
	// 3. 설문 수정2 (SV_Career 테이블) -- career_q3
	public void Modify2(CareerVO cVo) throws Exception;
	
}
