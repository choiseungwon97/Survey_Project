package com.mis.survey.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class HomeDAOImpl implements HomeDAO {

	@Inject
	private SqlSession session;

	private static String namespace = "com.mis.mapper.HomeMapper";

	@Override
	public String check(String sessionId) throws Exception {
		return session.selectOne(namespace + ".checkSessionId", sessionId);
	}


}
