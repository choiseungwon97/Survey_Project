package com.mis.survey.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("user/choice/*")
public class ChoiceController {


	private static Logger logger = LoggerFactory.getLogger(BigFiveController.class);
		

	// 1. 설문자 :: choice 폼으로 이동
	@RequestMapping(value = "/choice", method = RequestMethod.GET)
	protected void choiceGET(RedirectAttributes rttr, Model model,  HttpSession session, HttpServletRequest request) throws Exception {

		logger.info("choice GET.,...........");
		
	}

	// 1. 설문자 :: 설문 선택
	@RequestMapping(value = "/choice", method = RequestMethod.POST)
	protected String choicePOST(RedirectAttributes rttr, Model model,  HttpSession session, HttpServletRequest request) throws Exception {

		logger.info("choice POST.,...........");
		return null;

	}

}
