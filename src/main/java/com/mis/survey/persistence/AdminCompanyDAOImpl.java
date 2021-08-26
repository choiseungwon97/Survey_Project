package com.mis.survey.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.mis.survey.domain.AdminVO;

@Repository
public class AdminCompanyDAOImpl implements AdminCompanyDAO {

	@Inject
	private SqlSession session;
	
	private static String namespace = "com.mis.mapper.AdminCompanyMapper";

	@Override
	public List<AdminVO> adminList() throws Exception {
		return session.selectList(namespace + ".adminList");
	}

	@Override
	public AdminVO adRead(String id) throws Exception {
		return session.selectOne(namespace + ".adRead", id);
	}

	@Override
	public void adUpdate(AdminVO aVo) throws Exception {
		session.update(namespace + ".adUpdate", aVo);
	}

	@Override
	public void adCreate(AdminVO aVo) throws Exception {
		session.insert(namespace + ".adCreate", aVo);
	}

	@Override
	public void adDelete(String id) throws Exception {
		session.delete(namespace + ".adDelete", id);
	}

	
}
