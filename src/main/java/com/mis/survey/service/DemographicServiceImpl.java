package com.mis.survey.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.survey.domain.DemographicVO;
import com.mis.survey.persistence.DemographicDAO;

@Service
public class DemographicServiceImpl implements DemographicService {

	@Inject
	private DemographicDAO dao;
		
	@Override
	public void register(DemographicVO gVo) throws Exception {
		dao.insert(gVo);

	}

}
