package com.mis.survey.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.survey.domain.BigFiveVO;
import com.mis.survey.persistence.BigFiveDAO;

@Service
public class BigFiveServiceImpl implements BigFiveService {

	@Inject
	private BigFiveDAO dao;
	
	
	@Override
	public void registerSv(BigFiveVO bVo) throws Exception {
		dao.insertSV(bVo);
	}


}
