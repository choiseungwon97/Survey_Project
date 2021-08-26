package com.mis.survey.service;

import java.util.List;

import com.mis.survey.domain.AdminVO;

public interface AdminCompanyService {

	public List<AdminVO> adminList() throws Exception;
	
	public AdminVO adRead(String id) throws Exception;
	
	public void adModify(AdminVO aVo) throws Exception;
	
	public void adRegister(AdminVO aVo) throws Exception;
	
	public void adRemove(String id) throws Exception;
	
	
}
