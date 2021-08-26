package com.mis.survey.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.survey.domain.AdminVO;
import com.mis.survey.dto.LoginDTO;
import com.mis.survey.persistence.AdminDAO;

@Service
public class AdminServiceImpl implements AdminService {

	@Inject
	private AdminDAO dao;
	
	// 0. 기업/슈퍼 관리자 :: 로그인
	@Override
	public AdminVO login(LoginDTO dto) throws Exception {
		return dao.login(dto);
	}
	
	// 1. 기업 :: 정보 불러오기
	@Override
	public AdminVO adread(String id) throws Exception {
		return dao.adread(id);
	}

	// 2. 기업 :: 정보 수정
	@Override
	public void admodify(AdminVO aVo) throws Exception {
		dao.adupdate(aVo);
	}
	
	// 3. 기업 :: 가입
	@Override
	public void adregist(AdminVO aVo) throws Exception {
		dao.adcreate(aVo);
	}
	
}
