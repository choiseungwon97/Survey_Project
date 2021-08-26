package com.mis.survey.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.survey.domain.AdminVO;
import com.mis.survey.persistence.AdminCompanyDAO;

@Service
public class AdminCompanyServiceImpl implements AdminCompanyService {

	@Inject
	private AdminCompanyDAO dao;

	@Override
	public List<AdminVO> adminList() throws Exception {
		return dao.adminList();
	}

	@Override
	public AdminVO adRead(String id) throws Exception {
		return dao.adRead(id);
	}

	@Override
	public void adModify(AdminVO aVo) throws Exception {
		dao.adUpdate(aVo);
	}

	@Override
	public void adRegister(AdminVO aVo) throws Exception {
		dao.adCreate(aVo);
	}

	@Override
	public void adRemove(String id) throws Exception {
		dao.adDelete(id);
	}
	
	
	
}
