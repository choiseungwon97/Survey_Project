package com.mis.survey.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.survey.domain.DemographicVO;

@Repository
public class DemographicDAOImpl implements DemographicDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.mis.mapper.DemographicMapper";
	
	//1. 설문 등록 (SV_DEMOGRAPHIC 테이블)
	@Override
	public void insert(DemographicVO gVo) throws Exception {
		session.insert(namespace + ".insert", gVo);

	}

}
