package com.mis.survey.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mis.survey.domain.JobVO;
import com.mis.survey.persistence.JobDAO;

@Service
public class JobServiceImpl implements JobService {

	@Inject
	private JobDAO dao;
	
	@Override
	public void register(JobVO jVo) throws Exception {
		dao.insert(jVo);

	}

	@Override
	public void modify(JobVO jVo) throws Exception {
		dao.update(jVo);

		
	}

}
