package com.mis.survey.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.survey.persistence.HomeDAO;

@Service
public class HomeServiceImpl implements HomeService {

	
	@Inject
	private HomeDAO dao;
	

	@Override
	public String check(String sessionId) throws Exception {
		return dao.check(sessionId);
	}

}
