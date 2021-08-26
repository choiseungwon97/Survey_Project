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

import com.mis.survey.domain.CareerVO;
import com.mis.survey.service.CareerService;

@Controller
@RequestMapping("/user/career/*")
public class CareerController {

	@Inject
	private CareerService service;

	private static Logger logger = LoggerFactory.getLogger(BigFiveController.class);

	// 1. 설문자 :: career_q 설문 폼으로 이동
	@RequestMapping(value = "career_q", method = RequestMethod.GET)
	protected void registerGET(Model model) throws Exception {
		
		logger.info("Career_q GET................");
		

	}

	// 1. 설문자 :: career_q 설문 등록
	@RequestMapping(value = "career_q", method = RequestMethod.POST)
	public String registerPOST(CareerVO cVo, RedirectAttributes rttr, Model model,  HttpSession session, HttpServletRequest request) throws Exception {

		logger.info("Career_q POST................");
		
		//SESSION ID 전달 받음
		String sessionId = session.getId();
		session.setAttribute("sessionID", sessionId);
		cVo.setSessionId(sessionId);
		
		
		//질문 첫번째 페이지 CQ1 - CQ12까지 처리
		//parameter null 초기화
		int CQ1 = request.getParameter("cq_1") == null ? 1 : Integer.parseInt(request.getParameter("cq_1"));
		int CQ2 = request.getParameter("cq_2") == null ? 1 : Integer.parseInt(request.getParameter("cq_2"));
		int CQ3 = request.getParameter("cq_3") == null ? 1 : Integer.parseInt(request.getParameter("cq_3"));
		int CQ4 = request.getParameter("cq_4") == null ? 1 : Integer.parseInt(request.getParameter("cq_4"));
		int CQ5 = request.getParameter("cq_5") == null ? 1 : Integer.parseInt(request.getParameter("cq_5"));
		int CQ6 = request.getParameter("cq_6") == null ? 1 : Integer.parseInt(request.getParameter("cq_6"));
		int CQ7 = request.getParameter("cq_7") == null ? 1 : Integer.parseInt(request.getParameter("cq_7"));
		int CQ8 = request.getParameter("cq_8") == null ? 1 : Integer.parseInt(request.getParameter("cq_8"));
		int CQ9 = request.getParameter("cq_9") == null ? 1 : Integer.parseInt(request.getParameter("cq_9"));
		int CQ10 = request.getParameter("cq_10") == null ? 1 : Integer.parseInt(request.getParameter("cq_10"));
		int CQ11 = request.getParameter("cq_11") == null ? 1 : Integer.parseInt(request.getParameter("cq_11"));
		int CQ12 = request.getParameter("cq_12") == null ? 1 : Integer.parseInt(request.getParameter("cq_12"));
		
		cVo.setCQ1(CQ1);
		cVo.setCQ2(CQ2);
		cVo.setCQ3(CQ3);
		cVo.setCQ4(CQ4);
		cVo.setCQ5(CQ5);
		cVo.setCQ6(CQ6);
		cVo.setCQ7(CQ7);
		cVo.setCQ8(CQ8);
		cVo.setCQ9(CQ9);
		cVo.setCQ10(CQ10);
		cVo.setCQ11(CQ11);
		cVo.setCQ12(CQ12);
		
		//DAO를 통해 DB 저장
		service.register(cVo);
		
		System.out.println("CQ1: " + cVo);
		session.setAttribute("CareerVO", cVo);		
		
		return "redirect:/user/career/career_q2";
	}
	
	
	// 2. 설문자 :: career_q2 설문 폼으로 이동
	@RequestMapping(value = "career_q2", method = RequestMethod.GET)
	protected void update1GET(Model model) throws Exception {
		
		logger.info("Career_q2  GET................");
		

	}
	
	// 2. 설문자 :: career_q2 설문 등록
	@RequestMapping(value = "career_q2", method = RequestMethod.POST)
	public String update1POST(CareerVO cVo, RedirectAttributes rttr, Model model,  HttpSession session, HttpServletRequest request) throws Exception {
	
		 		logger.info("Career_q2 POST................");
				
				//SESSION ID 전달 받음
				String sessionId = session.getId();
				
				//전달 받은 이전 CareerVO 객체 받기
				cVo = (CareerVO)session.getAttribute("CareerVO");
				
				//질문 첫번째 페이지 CQ13 - CQ28까지 처리
				//parameter null 초기화
				int CQ13 = request.getParameter("cq_13") == null ? 1 : Integer.parseInt(request.getParameter("cq_13"));
				int CQ14 = request.getParameter("cq_14") == null ? 1 : Integer.parseInt(request.getParameter("cq_14"));
				int CQ15 = request.getParameter("cq_15") == null ? 1 : Integer.parseInt(request.getParameter("cq_15"));
				int CQ16 = request.getParameter("cq_16") == null ? 1 : Integer.parseInt(request.getParameter("cq_16"));
				int CQ17 = request.getParameter("cq_17") == null ? 1 : Integer.parseInt(request.getParameter("cq_17"));
				int CQ18 = request.getParameter("cq_18") == null ? 1 : Integer.parseInt(request.getParameter("cq_18"));
				int CQ19 = request.getParameter("cq_19") == null ? 1 : Integer.parseInt(request.getParameter("cq_19"));
				int CQ20 = request.getParameter("cq_20") == null ? 1 : Integer.parseInt(request.getParameter("cq_20"));
				int CQ21 = request.getParameter("cq_21") == null ? 1 : Integer.parseInt(request.getParameter("cq_21"));
				int CQ22 = request.getParameter("cq_22") == null ? 1 : Integer.parseInt(request.getParameter("cq_22"));
				int CQ23 = request.getParameter("cq_23") == null ? 1 : Integer.parseInt(request.getParameter("cq_23"));
				int CQ24 = request.getParameter("cq_24") == null ? 1 : Integer.parseInt(request.getParameter("cq_24"));
				int CQ25 = request.getParameter("cq_25") == null ? 1 : Integer.parseInt(request.getParameter("cq_25"));
				int CQ26 = request.getParameter("cq_26") == null ? 1 : Integer.parseInt(request.getParameter("cq_26"));
				int CQ27 = request.getParameter("cq_27") == null ? 1 : Integer.parseInt(request.getParameter("cq_27"));
				int CQ28 = request.getParameter("cq_28") == null ? 1 : Integer.parseInt(request.getParameter("cq_28"));
				
				cVo.setSessionId(sessionId);
				cVo.setCQ13(CQ13);
				cVo.setCQ14(CQ14);
				cVo.setCQ15(CQ15);
				cVo.setCQ16(CQ16);
				cVo.setCQ17(CQ17);
				cVo.setCQ18(CQ18);
				cVo.setCQ19(CQ19);
				cVo.setCQ20(CQ20);
				cVo.setCQ21(CQ21);
				cVo.setCQ22(CQ22);
				cVo.setCQ23(CQ23);
				cVo.setCQ24(CQ24);
				cVo.setCQ25(CQ25);
				cVo.setCQ26(CQ26);
				cVo.setCQ27(CQ27);
				cVo.setCQ28(CQ28);
				
				
				//DAO를 통해 DB 저장
				service.Modify1(cVo);
				
				System.out.println("CQ2: " + cVo);
				session.setAttribute("CareerVO", cVo);	
				
				
				return "redirect:/user/career/career_q3";
	}
	
	
	// 3. 설문자 :: career_q3 설문 폼으로 이동
	@RequestMapping(value = "career_q3", method = RequestMethod.GET)
	protected void update2GET(Model model) throws Exception {
		
		logger.info("Career_q3 GET................");
		

	}
	
	// 3. 설문자 :: career_q3 설문 등록
	@RequestMapping(value = "career_q3", method = RequestMethod.POST)
	public String update2POST(CareerVO cVo, RedirectAttributes rttr, Model model,  HttpSession session, HttpServletRequest request) throws Exception {
	
		logger.info("Career_q3 POST................");
		
		//SESSION ID 전달 받음
		String sessionId = session.getId();
		
		
		//전달 받은 이전 CareerVO 객체 받기
		cVo = (CareerVO)session.getAttribute("CareerVO");
		
		//질문 첫번째 페이지 CQ29 - CQ43까지 처리
		//parameter null 초기화
		int CQ29 = request.getParameter("cq_29") == null ? 1 : Integer.parseInt(request.getParameter("cq_29"));
		int CQ30 = request.getParameter("cq_30") == null ? 1 : Integer.parseInt(request.getParameter("cq_30"));
		int CQ31 = request.getParameter("cq_31") == null ? 1 : Integer.parseInt(request.getParameter("cq_31"));
		int CQ32 = request.getParameter("cq_32") == null ? 1 : Integer.parseInt(request.getParameter("cq_32"));
		int CQ33 = request.getParameter("cq_33") == null ? 1 : Integer.parseInt(request.getParameter("cq_33"));
		int CQ34 = request.getParameter("cq_34") == null ? 1 : Integer.parseInt(request.getParameter("cq_34"));
		int CQ35 = request.getParameter("cq_35") == null ? 1 : Integer.parseInt(request.getParameter("cq_35"));
		int CQ36 = request.getParameter("cq_36") == null ? 1 : Integer.parseInt(request.getParameter("cq_36"));
		int CQ37 = request.getParameter("cq_37") == null ? 1 : Integer.parseInt(request.getParameter("cq_37"));
		int CQ38 = request.getParameter("cq_38") == null ? 1 : Integer.parseInt(request.getParameter("cq_38"));
		int CQ39 = request.getParameter("cq_39") == null ? 1 : Integer.parseInt(request.getParameter("cq_39"));
		int CQ40 = request.getParameter("cq_40") == null ? 1 : Integer.parseInt(request.getParameter("cq_40"));
		int CQ41 = request.getParameter("cq_41") == null ? 1 : Integer.parseInt(request.getParameter("cq_41"));
		int CQ42 = request.getParameter("cq_42") == null ? 1 : Integer.parseInt(request.getParameter("cq_42"));
		int CQ43 = request.getParameter("cq_43") == null ? 1 : Integer.parseInt(request.getParameter("cq_43"));
		
		cVo.setSessionId(sessionId);
		cVo.setCQ29(CQ29);
		cVo.setCQ30(CQ30);
		cVo.setCQ31(CQ31);
		cVo.setCQ32(CQ32);
		cVo.setCQ33(CQ33);
		cVo.setCQ34(CQ34);
		cVo.setCQ35(CQ35);
		cVo.setCQ36(CQ36);
		cVo.setCQ37(CQ37);
		cVo.setCQ38(CQ38);
		cVo.setCQ39(CQ39);
		cVo.setCQ40(CQ40);
		cVo.setCQ41(CQ41);
		cVo.setCQ42(CQ42);
		cVo.setCQ43(CQ43);
		
		
		//DAO를 통해 DB 저장
		service.Modify2(cVo);
		
		System.out.println("CQ3: " + cVo);
		session.setAttribute("CareerVO", cVo);
		
		return "redirect:/user/big5/big5_q";
	}
	
	
	
}
