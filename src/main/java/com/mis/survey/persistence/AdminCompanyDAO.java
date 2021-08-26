package com.mis.survey.persistence;

import java.util.List;

import com.mis.survey.domain.AdminVO;

public interface AdminCompanyDAO {

	public List<AdminVO> adminList() throws Exception;
	
	public AdminVO adRead(String id) throws Exception;
	
	public void adUpdate(AdminVO aVo) throws Exception;
	
	public void adCreate(AdminVO aVo) throws Exception;
	
	public void adDelete(String id) throws Exception;
	
}
