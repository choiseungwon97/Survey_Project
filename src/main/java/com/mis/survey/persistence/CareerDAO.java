package com.mis.survey.persistence;

import com.mis.survey.domain.CareerVO;

public interface CareerDAO {

	// 1. 설문 등록 (SV_Career 테이블) -- career_q
	public void insert(CareerVO cVo) throws Exception;
	
	// 2. 설문 수정1 (SV_Career 테이블) -- career_q2
	public void update1(CareerVO cVo) throws Exception;
	
	// 3. 설문 수정2 (SV_Career 테이블) -- career_q3
	public void update2(CareerVO cVo) throws Exception;
	
}
