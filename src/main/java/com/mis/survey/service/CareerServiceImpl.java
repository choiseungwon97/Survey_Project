package com.mis.survey.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.survey.domain.CareerVO;
import com.mis.survey.persistence.CareerDAO;

@Service
public class CareerServiceImpl implements CareerService {

	@Inject
	private CareerDAO dao;
	
	//1. 설문 등록 (SV_CAREER 테이블) -- career_q
	@Override
	public void register(CareerVO cVo) throws Exception {
		dao.insert(cVo);

	}

	// 2. 설문 수정1 (SV_Career 테이블) -- career_q2
	@Override
	public void Modify1(CareerVO cVo) throws Exception {
		dao.update1(cVo);		
	}

	// 3. 설문 수정2 (SV_Career 테이블) -- career_q3
	@Override
	public void Modify2(CareerVO cVo) throws Exception {
		dao.update2(cVo);		
	}

}
