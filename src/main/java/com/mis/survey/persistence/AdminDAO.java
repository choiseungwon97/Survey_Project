package com.mis.survey.persistence;

import com.mis.survey.domain.AdminVO;
import com.mis.survey.dto.LoginDTO;

public interface AdminDAO {
	
	// 0. 기업/슈퍼 관리자 :: 로그인
	public AdminVO login(LoginDTO dto) throws Exception;
	
	// 1. 기업 :: 정보 불러오기
	public AdminVO adread(String id) throws Exception;
	
	// 2. 기업 :: 정보 수정
	public void adupdate(AdminVO aVo) throws Exception;
	
	// 3. 기업 :: 가입
	public void adcreate(AdminVO aVo) throws Exception;
	
}
