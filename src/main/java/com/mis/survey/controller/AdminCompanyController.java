package com.mis.survey.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mis.survey.domain.AdminVO;
import com.mis.survey.service.AdminCompanyService;

@Controller
@RequestMapping("/admin/admin/company/*")
public class AdminCompanyController {

	@Inject
	 private AdminCompanyService service;

	private static final Logger logger = LoggerFactory.getLogger(AdminCompanyController.class);

	// 관리자(기업회원) 리스트
	@RequestMapping(value = "companyList", method = RequestMethod.GET)
	public void companyList(HttpServletRequest request, Model model) throws Exception {

		logger.info("companyList GET.,...........");
		model.addAttribute("aVo", service.adminList());
	}

	// 관리자(기업회원) 상세보기
	@RequestMapping(value = "read", method = RequestMethod.GET)
	public void read(@RequestParam("id") String id, HttpServletRequest request, Model model) throws Exception {

		logger.info("company read GET.,...........");
		
		logger.info("id :: " + id);
		model.addAttribute("aVo", service.adRead(id));
		logger.info("aVo :::  " + service.adRead(id));

	}

	// 관리자(기업회원) 정보 수정하기
	@RequestMapping(value = "modify", method = RequestMethod.GET)
	public void modify(HttpServletRequest request, Model model) throws Exception {

		String id = request.getParameter("id");
		
		logger.info("company modify GET.,...........");
		model.addAttribute(service.adRead(id));
		
	}
	@RequestMapping(value = "modify", method = RequestMethod.POST)
	public String modifyPOST(AdminVO aVo, HttpServletRequest request, Model model)
			throws Exception {

		logger.info("company modify POST.............");
		
		String id = request.getParameter("id");
		logger.info("id ::: " + id);
		
		
		service.adModify(aVo);
		logger.info("수정 실행 완료 :: " + aVo);
		
		return "redirect:/admin/admin/company/companyList";
	}

	// 관리자(기업회원) 추가하기
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public void registerGET() throws Exception {
		logger.info("Admin company register get..");

	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerPOST(AdminVO aVo, RedirectAttributes rttr) throws Exception {

		logger.info("Admin company Register POST .......");
		logger.info("aVo : " + aVo);

		service.adRegister(aVo);

		return "redirect:/admin/admin/company/companyList";
	}

	
	// 관리자(기업회원) 삭제하기
	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public String removeGET(@RequestParam("id") String id, HttpServletRequest request, Model model) throws Exception {
		logger.info("Admin company remove get..");
		
		logger.info("id :::" + id);
		service.adRemove(id);
		logger.info("remove complete.....");
		return "redirect:/admin/admin/company/companyList";
	}

	
}
