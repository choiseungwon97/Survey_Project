package com.mis.survey.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.survey.domain.AdminVO;
import com.mis.survey.dto.LoginDTO;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.mis.mapper.AdminMapper";

	// 0. 기업/슈퍼 관리자 :: 로그인
	@Override
	public AdminVO login(LoginDTO dto) throws Exception {
		return session.selectOne(namespace + ".login", dto);
	}
	
	// 1. 기업 :: 정보 불러오기
	@Override
	public AdminVO adread(String id) throws Exception {
		return session.selectOne(namespace + ".adread", id);
	}
	
	// 2. 기업 :: 정보 수정
	@Override
	public void adupdate(AdminVO aVo) throws Exception {
		session.update(namespace + ".adupdate", aVo);
	}

	// 3. 기업 :: 가입
	@Override
	public void adcreate(AdminVO aVo) throws Exception {
		session.insert(namespace + ".adcreate", aVo);		
	}

}
