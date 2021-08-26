package com.mis.survey.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.survey.domain.DemographicVO;
import com.mis.survey.persistence.AdminResultDAO;

@Service
public class AdminResultServiceImpl implements AdminResultService {

	@Inject
	private AdminResultDAO dao;

	//1. 유저 조회
	@Override
	public DemographicVO read(String sessionId) throws Exception {
		return dao.read(sessionId);

	}

	//2. 유저 검색리스트
	/*
	 * @Override public List<DemographicVO> listSearch(SearchCriteria cri) throws
	 * Exception { return dao.listSearch(cri);
	 * 
	 * }
	 * 
	 * @Override public int listSearchCount(SearchCriteria cri) throws Exception {
	 * return dao.listSearchCount(cri); }
	 */

	
	@Override
	public List<DemographicVO> DemographicList() throws Exception {
		
		return dao.DemographicList();
	}
	
	
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
