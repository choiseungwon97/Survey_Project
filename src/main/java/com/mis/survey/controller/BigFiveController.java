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

import com.mis.survey.domain.BigFiveVO;
import com.mis.survey.service.BigFiveService;

@Controller
@RequestMapping("/user/big5/*")
public class BigFiveController {

	@Inject
	private BigFiveService service;

	private static Logger logger = LoggerFactory.getLogger(BigFiveController.class);
		


	// 1. 설문자 :: big5_q 설문 폼으로 이동
	@RequestMapping(value = "big5_q", method = RequestMethod.GET)
	public void registerSvGET(BigFiveVO bVo, Model model) throws Exception {
		
		logger.info("big5_q GET................");
		

	}

	// 2. 설문자 :: big5_q 설문 등록
	@RequestMapping(value = "big5_q", method = RequestMethod.POST)
	public String registerSvPOST( BigFiveVO bVo, RedirectAttributes rttr, Model model,  HttpSession session, HttpServletRequest request) throws Exception {

		logger.info("big5_q POST................");

		// SESSION ID 전달 받음
		String sessionId = session.getId();
		session.setAttribute("sessionID", sessionId);
		bVo.setSessionId(sessionId);
		
		//질문 첫번째 페이지 BQ1 - BQ20까지 처리
		//parameter null 초기화
		int BQ1 = request.getParameter("bq_1") == null ? 1 : Integer.parseInt(request.getParameter("bq_1"));
		int BQ2 = request.getParameter("bq_2") == null ? 1 : Integer.parseInt(request.getParameter("bq_2"));
		int BQ3 = request.getParameter("bq_3") == null ? 1 : Integer.parseInt(request.getParameter("bq_3"));
		int BQ4 = request.getParameter("bq_4") == null ? 1 : Integer.parseInt(request.getParameter("bq_4"));
		int BQ5 = request.getParameter("bq_5") == null ? 1 : Integer.parseInt(request.getParameter("bq_5"));
		int BQ6 = request.getParameter("bq_6") == null ? 1 : Integer.parseInt(request.getParameter("bq_6"));
		int BQ7 = request.getParameter("bq_7") == null ? 1 : Integer.parseInt(request.getParameter("bq_7"));
		int BQ8 = request.getParameter("bq_8") == null ? 1 : Integer.parseInt(request.getParameter("bq_8"));
		int BQ9 = request.getParameter("bq_9") == null ? 1 : Integer.parseInt(request.getParameter("bq_9"));
		int BQ10 = request.getParameter("bq_10") == null ? 1 : Integer.parseInt(request.getParameter("bq_10"));
		int BQ11 = request.getParameter("bq_11") == null ? 1 : Integer.parseInt(request.getParameter("bq_11"));
		int BQ12 = request.getParameter("bq_12") == null ? 1 : Integer.parseInt(request.getParameter("bq_12"));
		int BQ13 = request.getParameter("bq_13") == null ? 1 : Integer.parseInt(request.getParameter("bq_13"));
		int BQ14 = request.getParameter("bq_14") == null ? 1 : Integer.parseInt(request.getParameter("bq_14"));
		int BQ15 = request.getParameter("bq_15") == null ? 1 : Integer.parseInt(request.getParameter("bq_15"));
		int BQ16 = request.getParameter("bq_16") == null ? 1 : Integer.parseInt(request.getParameter("bq_16"));
		int BQ17 = request.getParameter("bq_17") == null ? 1 : Integer.parseInt(request.getParameter("bq_17"));
		int BQ18 = request.getParameter("bq_18") == null ? 1 : Integer.parseInt(request.getParameter("bq_18"));
		int BQ19 = request.getParameter("bq_19") == null ? 1 : Integer.parseInt(request.getParameter("bq_19"));
		int BQ20 = request.getParameter("bq_20") == null ? 1 : Integer.parseInt(request.getParameter("bq_20"));
		
		
		bVo.setSessionId(sessionId);
		bVo.setBQ1(BQ1);
		bVo.setBQ2(BQ2);
		bVo.setBQ3(BQ3);
		bVo.setBQ4(BQ4);
		bVo.setBQ5(BQ5);
		bVo.setBQ6(BQ6);
		bVo.setBQ7(BQ7);
		bVo.setBQ8(BQ8);
		bVo.setBQ9(BQ9);
		bVo.setBQ10(BQ10);
		
		bVo.setBQ11(BQ11);
		bVo.setBQ12(BQ12);
		bVo.setBQ13(BQ13);
		bVo.setBQ14(BQ14);
		bVo.setBQ15(BQ15);
		bVo.setBQ16(BQ16);
		bVo.setBQ17(BQ17);
		bVo.setBQ18(BQ18);
		bVo.setBQ19(BQ19);
		bVo.setBQ20(BQ20);

		//Service를 통해 저장
		service.registerSv(bVo);
		
		System.out.println("BQ: " + bVo);
	    session.setAttribute("BigFiveVO", bVo);

	    return "redirect:/user/demo/demographic_q";
	}
	

}
