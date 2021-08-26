package com.mis.survey.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mis.survey.domain.DemographicVO;
import com.mis.survey.service.UserResultService;

@Controller
@RequestMapping("/user/result/*")
public class ResultController {

	@Inject
	private UserResultService service;
	
	private static Logger logger = LoggerFactory.getLogger(ResultController.class);

	@RequestMapping("/result")
	public void main(HttpServletRequest request, Model model, HttpSession session) throws Exception {
		logger.info("User Main........");



		
		String sessionId = session.getId();
		logger.info("get SessionId");
		
		
		model.addAttribute("bigfive",service.readBigFive(sessionId));
		logger.info("big5 :: " + service.readBigFive(sessionId));
		
		model.addAttribute("carreer",service.readCareer(sessionId));
		logger.info("carreer :: " + service.readCareer(sessionId));
		
		model.addAttribute("job",service.readJob(sessionId));
		logger.info("job :: " + service.readJob(sessionId));
		
		DemographicVO gvo = service.readDemographic(sessionId);
		model.addAttribute("gvo", gvo);
		logger.info("gvo ::  " +  gvo);
		
		
		model.addAttribute("MPS",service.readJobMPS(sessionId));
		logger.info("MPS :::::::::: " + service.readJobMPS(sessionId));


	}
}
