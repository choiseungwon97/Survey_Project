package com.mis.survey.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mis.survey.domain.DemographicVO;
import com.mis.survey.service.AdminResultService;

@Controller
@RequestMapping("/admin/admin/*")
public class AdminResultController {


	@Inject
	private AdminResultService Aservice;

	private static final Logger logger = LoggerFactory.getLogger(AdminResultController.class);


	@RequestMapping(value = "/resultList", method = RequestMethod.GET)
	public void userList(Model model) throws Exception {


		model.addAttribute("DemographicList", Aservice.DemographicList());

	}

	// 2. 유저 결과 조회
	@RequestMapping("/admin_result")
	public void main(HttpServletRequest request, Model model, HttpSession session) throws Exception {
		logger.info("User Main........");

		//String sessionId = session.getID();
		
		String sessionId = request.getParameter("sessionId");
		logger.info("과연... :" + sessionId);
		
		
		model.addAttribute("bigfive", Aservice.readBigFive(sessionId));
		logger.info("big5");
		model.addAttribute("carreer", Aservice.readCareer(sessionId));
		logger.info("carreer");
		model.addAttribute("job", Aservice.readJob(sessionId));
		logger.info("job");
		DemographicVO gvo = Aservice.readDemographic(sessionId);
		model.addAttribute("gvo", gvo);
		logger.info("gvo ::  " + gvo);
		model.addAttribute("MPS", Aservice.readJobMPS(sessionId));
		logger.info("MPS");

	}
}
