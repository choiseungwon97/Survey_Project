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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mis.survey.domain.DemographicVO;
import com.mis.survey.service.DemographicServiceImpl;

@Controller
@RequestMapping("/user/demo/*")
public class DemoController {

	@Inject
	private DemographicServiceImpl service;

	private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

	@RequestMapping(value = "/demographic_q", method = RequestMethod.GET)
	public void registGET(DemographicVO gVo, Model model) throws Exception {
		logger.info("register get.,...........");
	}

	@RequestMapping(value = "/demographic_q", method = RequestMethod.POST)
	public String registPOST(DemographicVO gVo, RedirectAttributes rttr, HttpServletRequest request,
			HttpSession session) throws Exception {
		logger.info("regist post...........");
		logger.info(gVo.toString());

		// SESSION ID 생성
		String sessionID = session.getId();
		session.setAttribute("sessionID", sessionID);

		gVo.setSessionId(sessionID);

		gVo.setAge(Integer.parseInt(request.getParameter("age")));
		gVo.setCareer(Integer.parseInt(request.getParameter("career")));
		gVo.setGender(request.getParameter("gender"));
		gVo.setId(request.getParameter("id"));
		gVo.setJob(request.getParameter("job"));
		gVo.setMajor(request.getParameter("major"));
		gVo.setMarital(request.getParameter("marital"));
		gVo.setName(request.getParameter("name"));
		gVo.setPosit(request.getParameter("position"));
		
		service.register(gVo);

		rttr.addFlashAttribute("msg", "SUCCESS");
		rttr.addFlashAttribute("demo", gVo);

		return "redirect:/user/result/result";

	}

}
