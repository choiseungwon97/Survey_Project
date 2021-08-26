package com.mis.survey.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.survey.domain.CareerVO;

@Repository
public class CareerDAOImpl implements CareerDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.mis.mapper.CareerMapper";
	
	//1. 설문 등록 (SV_CAREER 테이블) -- career_q
	@Override
	public void insert(CareerVO cVo) throws Exception {
		session.selectOne(namespace + ".insert", cVo);

	}

	// 2. 설문 수정1 (SV_Career 테이블) -- career_q2
	@Override
	public void update1(CareerVO cVo) throws Exception {
		session.update(namespace + ".update1", cVo);
	}

	// 3. 설문 수정2 (SV_Career 테이블) -- career_q3
	@Override
	public void update2(CareerVO cVo) throws Exception {
		session.update(namespace + ".update2", cVo);
	}

}
