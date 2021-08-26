package com.mis.survey.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mis.survey.domain.AdminVO;
import com.mis.survey.dto.LoginDTO;
import com.mis.survey.service.AdminService;

@Controller
@RequestMapping("/admin/admin/*")
public class AdminController {

	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

	@Inject
	private AdminService service;
	
	
	
	

	// 0. 기업/슈퍼 관리자 ::  login 폼으로 이동
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public void loginGET(@ModelAttribute("dto") LoginDTO dto) throws Exception {

		logger.info("login GET.............");

	}
	
	// 0. 기업/슈퍼 관리자 ::  login 로그인
	@RequestMapping(value = "/loginPost", method = RequestMethod.POST)
	public String loginPost(LoginDTO dto, HttpSession session, Model model, RedirectAttributes rttr) throws Exception {

		logger.info("login POST.............");

		
		AdminVO aVo = service.login(dto);

		if (aVo == null) {
			rttr.addFlashAttribute("msg", "정보가 일치하지 않습니다.");
			return "redirect:/admin/admin/login";
		}

		logger.info("AdminVO : " + aVo.toString());

		model.addAttribute("aVo", aVo);

		return "/admin/admin/loginPost";
	}
	
	// 0. 기업/슈퍼 관리자 ::  logout 로그아웃
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request, HttpServletResponse response, HttpSession session)
			throws Exception {

		logger.info("logout GET.............");
		
		Object obj = session.getAttribute("login");

		if (obj != null) {
			logger.info("logout: session.invalidate() ");

			session.removeAttribute("login");
			session.invalidate();

		}

		return "redirect:/admin/admin/login";
	}


	// 1. 기업 :: join 폼으로 이동
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public void joinGET(HttpServletRequest request, Model model) throws Exception {

		logger.info("join GET.............");

	}
	
	// 1. 기업 :: join 가입
	 @RequestMapping(value = "join", method = RequestMethod.POST)
	 public String adregistPOST(AdminVO aVo, RedirectAttributes rttr) throws Exception {
		 
	    logger.info("join POST...........");
	    logger.info(aVo.toString());

	    service.adregist(aVo);


	        
	      return "redirect:/admin/admin/login";

	   }
	 

	// 2. 기업 :: adminModify 폼으로 이동
	@RequestMapping(value = "adminModify", method = RequestMethod.GET)
	public void adminModifyGET(HttpServletRequest request, Model model, HttpSession session)
			throws Exception {
		
		AdminVO aVo = (AdminVO) session.getAttribute("login");
		String id = aVo.getId();
		
		
		logger.info("adminModify GET.............");
		model.addAttribute(service.adread(id));

	}
	
	// 2. 기업 :: adminModify 정보 수정
	@RequestMapping(value = "adminModify", method = RequestMethod.POST)
	public String adminModifyPOST(AdminVO aVo, RedirectAttributes rttr)
			throws Exception {

		logger.info("adminModify POST.............");
		
		service.admodify(aVo);
		
		rttr.addFlashAttribute("msg", "MODIFY");
		rttr.addFlashAttribute("aVo", "aVo");

		logger.info("adminModify POST complete ...................." + aVo);

		return "redirect:/admin/admin/resultList";
	}


}
