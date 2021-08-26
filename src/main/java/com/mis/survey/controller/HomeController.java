package com.mis.survey.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

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

import com.mis.survey.service.HomeService;


@Controller
public class HomeController {
	
	@Inject
	private HomeService service;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	// 2. 설문자 :: 설문 참여 여부 확인
	@RequestMapping(value = "/", method = RequestMethod.POST)
	protected String choicePOST(RedirectAttributes rttr, Model model,  HttpSession session, HttpServletRequest request) throws Exception {

		String sessionId = session.getId();
		
		String url = service.check(sessionId);
		
		if (url != null) {
			url = "result/result";
		} else {
			url = "choice/choice";
		}
		
		return "redirect:/user/" + url;

		
		
		
		
		
		
		
		
		
		
	}
	
}
