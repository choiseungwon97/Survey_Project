package com.mis.survey.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.survey.domain.JobVO;

@Repository
public class JobDAOImpl implements JobDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.mis.mapper.JobMapper";
	
	//1. 설문 등록 (SV_JOB 테이블)
	@Override
	public void insert(JobVO jVo) throws Exception {
		session.insert(namespace + ".insert", jVo);

	}

	//2. 설문 업데이트
	@Override
	public void update(JobVO jVo) throws Exception {
		session.update(namespace + ".update", jVo);
		
	}

}
