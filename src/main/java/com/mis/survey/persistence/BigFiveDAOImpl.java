package com.mis.survey.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.survey.domain.BigFiveVO;

@Repository
public class BigFiveDAOImpl implements BigFiveDAO{

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.mis.mapper.BigFiveMapper";
	
	//1. 설문 등록 (SV_BIGFIVE 테이블)
	@Override
	public void insertSV(BigFiveVO bVo) throws Exception {
		session.selectOne(namespace + ".insertSV", bVo);
	}



}
