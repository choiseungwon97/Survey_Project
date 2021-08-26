package com.mis.survey.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.survey.domain.DemographicVO;
import com.mis.survey.persistence.ResultDAO;

@Service
public class UserResultServiceImpl implements UserResultService {

	
	@Inject
	private ResultDAO dao;
	
	@Override
	public int[] readBigFive(String sessionId) throws Exception {
		return dao.readBigFive(sessionId);
	}

	@Override
	public int[] readCareer(String sessionId) throws Exception {
		return dao.readCareer(sessionId);
	}

	@Override
	public int[] readJob(String sessionId) throws Exception {
		return dao.readJob(sessionId);
	}

	@Override
	public DemographicVO readDemographic(String sessionId) throws Exception {
		return dao.readDemographic(sessionId);
	}

	@Override
	public String readJobMPS(String sessionId) throws Exception {
		String MPS = dao.readJobMPS(sessionId);
		return MPS;
	}

}
