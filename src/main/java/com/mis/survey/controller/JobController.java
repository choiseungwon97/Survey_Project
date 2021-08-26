package com.mis.survey.controller;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mis.survey.domain.JobVO;
import com.mis.survey.service.JobServiceImpl;

@Controller
@RequestMapping("/user/job/*")
public class JobController {

	 @Inject
	   private JobServiceImpl service;

	   private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

	
	   
	   @RequestMapping(value = "/job_qd", method = RequestMethod.GET)
	   public void registGET(JobVO jVo,Model model) throws Exception {
	      logger.info("register get.,...........");
	   }

	   @RequestMapping(value = "/job_qd", method = RequestMethod.POST)
	   public String registPOST(JobVO jVo, RedirectAttributes rttr, HttpServletRequest request, HttpSession session) throws Exception {

				
			//SESSION ID 생성
			String sessionId = session.getId();
			session.setAttribute("sessionId", sessionId);
				
			jVo.setSessionId(sessionId);
				


	      //parameter null 초기화
			int jq1 = request.getParameter("jq_1") == null ? 1 : Integer.parseInt(request.getParameter("jq_1"));
			int jq2 = request.getParameter("jq_2") == null ? 1 : Integer.parseInt(request.getParameter("jq_2"));
			int jq3 = request.getParameter("jq_3") == null ? 1 : Integer.parseInt(request.getParameter("jq_3"));
			int jq4 = request.getParameter("jq_4") == null ? 1 : Integer.parseInt(request.getParameter("jq_4"));
			int jq5 = request.getParameter("jq_5") == null ? 1 : Integer.parseInt(request.getParameter("jq_5"));
			int jq6 = request.getParameter("jq_6") == null ? 1 : Integer.parseInt(request.getParameter("jq_6"));
			int jq7 = request.getParameter("jq_7") == null ? 1 : Integer.parseInt(request.getParameter("jq_7"));
			int jq8 = request.getParameter("jq_8") == null ? 1 : Integer.parseInt(request.getParameter("jq_8"));
			int jq9 = request.getParameter("jq_9") == null ? 1 : Integer.parseInt(request.getParameter("jq_9"));
			int jq10 = request.getParameter("jq_10") == null ? 1 : Integer.parseInt(request.getParameter("jq_10"));
			int jq11 = request.getParameter("jq_11") == null ? 1 : Integer.parseInt(request.getParameter("jq_11"));
			int jq12 = request.getParameter("jq_12") == null ? 1 : Integer.parseInt(request.getParameter("jq_12"));
			
			jVo.setJQ1(jq1);
			jVo.setJQ2(jq2);
			jVo.setJQ3(jq3);
			jVo.setJQ4(jq4);
			jVo.setJQ5(jq5);
			jVo.setJQ6(jq6);
			jVo.setJQ7(jq7);
			jVo.setJQ8(jq8);
			jVo.setJQ9(jq9);
			jVo.setJQ10(jq10);
			jVo.setJQ11(jq11);
			jVo.setJQ12(jq12);
			
			//다음 페이지 이동 시, JobVO 객체 생성하여 response 객체에 담아서 전송
			

			System.out.println("jvo: " + jVo);
			
			service.register(jVo);
			
			System.out.println("인서트 완료!!");
			
			rttr.addFlashAttribute("msg", "SUCCESS");
			rttr.addFlashAttribute("job", jVo);	
			
		      return "redirect:/user/job/job_qd2";

	   }
			
			
			
//jq2			
			@RequestMapping(value = "/job_qd2", method = RequestMethod.GET)
			   public void modifyGET( Model model )
				         throws Exception {
				   }
			
			
			   @RequestMapping(value = "/job_qd2", method = RequestMethod.POST)
			   public String modifyPOST(JobVO jVo, RedirectAttributes rttr, HttpServletRequest request, HttpSession session )
			         throws Exception {

			      

			      logger.info("job modify post ....................");
			     

			      rttr.addFlashAttribute("msg", "MODIFY");
			      rttr.addFlashAttribute("vo", "vo");

			      logger.info("job modify post ....................");
			      
			      
					
					
					
					//SESSION ID 생성
					String sessionID = session.getId();
					session.setAttribute("sessionID", sessionID);
						
					jVo.setSessionId(sessionID);
					
			int jq13 = request.getParameter("jq_13") == null ? 1 : Integer.parseInt(request.getParameter("jq_13"));
			int jq14 = request.getParameter("jq_14") == null ? 1 : Integer.parseInt(request.getParameter("jq_14"));
			int jq15 = request.getParameter("jq_15") == null ? 1 : Integer.parseInt(request.getParameter("jq_15"));
			int jq16 = request.getParameter("jq_16") == null ? 1 : Integer.parseInt(request.getParameter("jq_16"));
			int jq17 = request.getParameter("jq_17") == null ? 1 : Integer.parseInt(request.getParameter("jq_17"));
			int jq18 = request.getParameter("jq_18") == null ? 1 : Integer.parseInt(request.getParameter("jq_18"));
			int jq19 = request.getParameter("jq_19") == null ? 1 : Integer.parseInt(request.getParameter("jq_19"));
			int jq20 = request.getParameter("jq_20") == null ? 1 : Integer.parseInt(request.getParameter("jq_20"));
			int jq21 = request.getParameter("jq_21") == null ? 1 : Integer.parseInt(request.getParameter("jq_21"));
			
			jVo.setJQ13(jq13);
			jVo.setJQ14(jq14);
			jVo.setJQ15(jq15);
			jVo.setJQ16(jq16);
			jVo.setJQ17(jq17);
			jVo.setJQ18(jq18);
			jVo.setJQ19(jq19);
			jVo.setJQ20(jq20);
			jVo.setJQ21(jq21);
			
			//service.update문
		      service.modify(jVo);
		      return "redirect:/user/career/career_q";

	   
	   }
	   
			   @RequestMapping(value = "/job_qg", method = RequestMethod.GET)
			   public void regist1GET(JobVO jVo,Model model) throws Exception {
			      logger.info("register get.,...........");
			   }

			   @RequestMapping(value = "/job_qg", method = RequestMethod.POST)
			   public String regist1POST(JobVO jVo, RedirectAttributes rttr, HttpServletRequest request, HttpSession session) throws Exception {

						
					//SESSION ID 생성
					String sessionId = session.getId();
					session.setAttribute("sessionId", sessionId);
						
					jVo.setSessionId(sessionId);
						


			      //parameter null 초기화
					int jq1 = request.getParameter("jq_1") == null ? 1 : Integer.parseInt(request.getParameter("jq_1"));
					int jq2 = request.getParameter("jq_2") == null ? 1 : Integer.parseInt(request.getParameter("jq_2"));
					int jq3 = request.getParameter("jq_3") == null ? 1 : Integer.parseInt(request.getParameter("jq_3"));
					int jq4 = request.getParameter("jq_4") == null ? 1 : Integer.parseInt(request.getParameter("jq_4"));
					int jq5 = request.getParameter("jq_5") == null ? 1 : Integer.parseInt(request.getParameter("jq_5"));
					int jq6 = request.getParameter("jq_6") == null ? 1 : Integer.parseInt(request.getParameter("jq_6"));
					int jq7 = request.getParameter("jq_7") == null ? 1 : Integer.parseInt(request.getParameter("jq_7"));
					int jq8 = request.getParameter("jq_8") == null ? 1 : Integer.parseInt(request.getParameter("jq_8"));
					int jq9 = request.getParameter("jq_9") == null ? 1 : Integer.parseInt(request.getParameter("jq_9"));
					int jq10 = request.getParameter("jq_10") == null ? 1 : Integer.parseInt(request.getParameter("jq_10"));
					int jq11 = request.getParameter("jq_11") == null ? 1 : Integer.parseInt(request.getParameter("jq_11"));
					int jq12 = request.getParameter("jq_12") == null ? 1 : Integer.parseInt(request.getParameter("jq_12"));
					
					jVo.setJQ1(jq1);
					jVo.setJQ2(jq2);
					jVo.setJQ3(jq3);
					jVo.setJQ4(jq4);
					jVo.setJQ5(jq5);
					jVo.setJQ6(jq6);
					jVo.setJQ7(jq7);
					jVo.setJQ8(jq8);
					jVo.setJQ9(jq9);
					jVo.setJQ10(jq10);
					jVo.setJQ11(jq11);
					jVo.setJQ12(jq12);
					
					//다음 페이지 이동 시, JobVO 객체 생성하여 response 객체에 담아서 전송
					

					System.out.println("jvo: " + jVo);
					
					service.register(jVo);
					
					System.out.println("인서트 완료!!");
					
					rttr.addFlashAttribute("msg", "SUCCESS");
					rttr.addFlashAttribute("job", jVo);	
					
				      return "redirect:/user/job/job_qd2";

			   }
					
					
					
		//jq2			
					@RequestMapping(value = "/job_qg2", method = RequestMethod.GET)
					   public void modify1GET( Model model )
						         throws Exception {
						   }
					
					
					   @RequestMapping(value = "/job_qg2", method = RequestMethod.POST)
					   public String modify1POST(JobVO jVo, RedirectAttributes rttr, HttpServletRequest request, HttpSession session )
					         throws Exception {

					      

					      logger.info("job modify post ....................");
					     

					      rttr.addFlashAttribute("msg", "MODIFY");
					      rttr.addFlashAttribute("vo", "vo");

					      logger.info("job modify post ....................");
					      
					      
							
							
							
							//SESSION ID 생성
							String sessionID = session.getId();
							session.setAttribute("sessionID", sessionID);
								
							jVo.setSessionId(sessionID);
							
					int jq13 = request.getParameter("jq_13") == null ? 1 : Integer.parseInt(request.getParameter("jq_13"));
					int jq14 = request.getParameter("jq_14") == null ? 1 : Integer.parseInt(request.getParameter("jq_14"));
					int jq15 = request.getParameter("jq_15") == null ? 1 : Integer.parseInt(request.getParameter("jq_15"));
					int jq16 = request.getParameter("jq_16") == null ? 1 : Integer.parseInt(request.getParameter("jq_16"));
					int jq17 = request.getParameter("jq_17") == null ? 1 : Integer.parseInt(request.getParameter("jq_17"));
					int jq18 = request.getParameter("jq_18") == null ? 1 : Integer.parseInt(request.getParameter("jq_18"));
					int jq19 = request.getParameter("jq_19") == null ? 1 : Integer.parseInt(request.getParameter("jq_19"));
					int jq20 = request.getParameter("jq_20") == null ? 1 : Integer.parseInt(request.getParameter("jq_20"));
					int jq21 = request.getParameter("jq_21") == null ? 1 : Integer.parseInt(request.getParameter("jq_21"));
					
					jVo.setJQ13(jq13);
					jVo.setJQ14(jq14);
					jVo.setJQ15(jq15);
					jVo.setJQ16(jq16);
					jVo.setJQ17(jq17);
					jVo.setJQ18(jq18);
					jVo.setJQ19(jq19);
					jVo.setJQ20(jq20);
					jVo.setJQ21(jq21);
					
					//service.update문
				      service.modify(jVo);
				      return "redirect:/user/career/career_q";

			   
			   }
					   
					   @RequestMapping(value = "/job_qm", method = RequestMethod.GET)
					   public void regist2GET(JobVO jVo,Model model) throws Exception {
					      logger.info("register get.,...........");
					   }

					   @RequestMapping(value = "/job_qm", method = RequestMethod.POST)
					   public String regist2POST(JobVO jVo, RedirectAttributes rttr, HttpServletRequest request, HttpSession session) throws Exception {

								
							//SESSION ID 생성
							String sessionId = session.getId();
							session.setAttribute("sessionId", sessionId);
								
							jVo.setSessionId(sessionId);
								


					      //parameter null 초기화
							int jq1 = request.getParameter("jq_1") == null ? 1 : Integer.parseInt(request.getParameter("jq_1"));
							int jq2 = request.getParameter("jq_2") == null ? 1 : Integer.parseInt(request.getParameter("jq_2"));
							int jq3 = request.getParameter("jq_3") == null ? 1 : Integer.parseInt(request.getParameter("jq_3"));
							int jq4 = request.getParameter("jq_4") == null ? 1 : Integer.parseInt(request.getParameter("jq_4"));
							int jq5 = request.getParameter("jq_5") == null ? 1 : Integer.parseInt(request.getParameter("jq_5"));
							int jq6 = request.getParameter("jq_6") == null ? 1 : Integer.parseInt(request.getParameter("jq_6"));
							int jq7 = request.getParameter("jq_7") == null ? 1 : Integer.parseInt(request.getParameter("jq_7"));
							int jq8 = request.getParameter("jq_8") == null ? 1 : Integer.parseInt(request.getParameter("jq_8"));
							int jq9 = request.getParameter("jq_9") == null ? 1 : Integer.parseInt(request.getParameter("jq_9"));
							int jq10 = request.getParameter("jq_10") == null ? 1 : Integer.parseInt(request.getParameter("jq_10"));
							int jq11 = request.getParameter("jq_11") == null ? 1 : Integer.parseInt(request.getParameter("jq_11"));
							int jq12 = request.getParameter("jq_12") == null ? 1 : Integer.parseInt(request.getParameter("jq_12"));
							
							jVo.setJQ1(jq1);
							jVo.setJQ2(jq2);
							jVo.setJQ3(jq3);
							jVo.setJQ4(jq4);
							jVo.setJQ5(jq5);
							jVo.setJQ6(jq6);
							jVo.setJQ7(jq7);
							jVo.setJQ8(jq8);
							jVo.setJQ9(jq9);
							jVo.setJQ10(jq10);
							jVo.setJQ11(jq11);
							jVo.setJQ12(jq12);
							
							//다음 페이지 이동 시, JobVO 객체 생성하여 response 객체에 담아서 전송
							

							System.out.println("jvo: " + jVo);
							
							service.register(jVo);
							
							System.out.println("인서트 완료!!");
							
							rttr.addFlashAttribute("msg", "SUCCESS");
							rttr.addFlashAttribute("job", jVo);	
							
						      return "redirect:/user/job/job_qd2";

					   }
							
							
							
				//jq2			
							@RequestMapping(value = "/job_qm2", method = RequestMethod.GET)
							   public void modify2GET( Model model )
								         throws Exception {
								   }
							
							
							   @RequestMapping(value = "/job_qm2", method = RequestMethod.POST)
							   public String modify2POST(JobVO jVo, RedirectAttributes rttr, HttpServletRequest request, HttpSession session )
							         throws Exception {

							      

							      logger.info("job modify post ....................");
							     

							      rttr.addFlashAttribute("msg", "MODIFY");
							      rttr.addFlashAttribute("vo", "vo");

							      logger.info("job modify post ....................");
							      
							      
									
									
									
									//SESSION ID 생성
									String sessionID = session.getId();
									session.setAttribute("sessionID", sessionID);
										
									jVo.setSessionId(sessionID);
									
							int jq13 = request.getParameter("jq_13") == null ? 1 : Integer.parseInt(request.getParameter("jq_13"));
							int jq14 = request.getParameter("jq_14") == null ? 1 : Integer.parseInt(request.getParameter("jq_14"));
							int jq15 = request.getParameter("jq_15") == null ? 1 : Integer.parseInt(request.getParameter("jq_15"));
							int jq16 = request.getParameter("jq_16") == null ? 1 : Integer.parseInt(request.getParameter("jq_16"));
							int jq17 = request.getParameter("jq_17") == null ? 1 : Integer.parseInt(request.getParameter("jq_17"));
							int jq18 = request.getParameter("jq_18") == null ? 1 : Integer.parseInt(request.getParameter("jq_18"));
							int jq19 = request.getParameter("jq_19") == null ? 1 : Integer.parseInt(request.getParameter("jq_19"));
							int jq20 = request.getParameter("jq_20") == null ? 1 : Integer.parseInt(request.getParameter("jq_20"));
							int jq21 = request.getParameter("jq_21") == null ? 1 : Integer.parseInt(request.getParameter("jq_21"));
							
							jVo.setJQ13(jq13);
							jVo.setJQ14(jq14);
							jVo.setJQ15(jq15);
							jVo.setJQ16(jq16);
							jVo.setJQ17(jq17);
							jVo.setJQ18(jq18);
							jVo.setJQ19(jq19);
							jVo.setJQ20(jq20);
							jVo.setJQ21(jq21);
							
							//service.update문
						      service.modify(jVo);
						      return "redirect:/user/career/career_q";

					   
					   }
							   
							   @RequestMapping(value = "/job_qp", method = RequestMethod.GET)
							   public void regist3GET(JobVO jVo,Model model) throws Exception {
							      logger.info("register get.,...........");
							   }

							   @RequestMapping(value = "/job_qp", method = RequestMethod.POST)
							   public String regist3POST(JobVO jVo, RedirectAttributes rttr, HttpServletRequest request, HttpSession session) throws Exception {

										
									//SESSION ID 생성
									String sessionId = session.getId();
									session.setAttribute("sessionId", sessionId);
										
									jVo.setSessionId(sessionId);
										


							      //parameter null 초기화
									int jq1 = request.getParameter("jq_1") == null ? 1 : Integer.parseInt(request.getParameter("jq_1"));
									int jq2 = request.getParameter("jq_2") == null ? 1 : Integer.parseInt(request.getParameter("jq_2"));
									int jq3 = request.getParameter("jq_3") == null ? 1 : Integer.parseInt(request.getParameter("jq_3"));
									int jq4 = request.getParameter("jq_4") == null ? 1 : Integer.parseInt(request.getParameter("jq_4"));
									int jq5 = request.getParameter("jq_5") == null ? 1 : Integer.parseInt(request.getParameter("jq_5"));
									int jq6 = request.getParameter("jq_6") == null ? 1 : Integer.parseInt(request.getParameter("jq_6"));
									int jq7 = request.getParameter("jq_7") == null ? 1 : Integer.parseInt(request.getParameter("jq_7"));
									int jq8 = request.getParameter("jq_8") == null ? 1 : Integer.parseInt(request.getParameter("jq_8"));
									int jq9 = request.getParameter("jq_9") == null ? 1 : Integer.parseInt(request.getParameter("jq_9"));
									int jq10 = request.getParameter("jq_10") == null ? 1 : Integer.parseInt(request.getParameter("jq_10"));
									int jq11 = request.getParameter("jq_11") == null ? 1 : Integer.parseInt(request.getParameter("jq_11"));
									int jq12 = request.getParameter("jq_12") == null ? 1 : Integer.parseInt(request.getParameter("jq_12"));
									
									jVo.setJQ1(jq1);
									jVo.setJQ2(jq2);
									jVo.setJQ3(jq3);
									jVo.setJQ4(jq4);
									jVo.setJQ5(jq5);
									jVo.setJQ6(jq6);
									jVo.setJQ7(jq7);
									jVo.setJQ8(jq8);
									jVo.setJQ9(jq9);
									jVo.setJQ10(jq10);
									jVo.setJQ11(jq11);
									jVo.setJQ12(jq12);
									
									//다음 페이지 이동 시, JobVO 객체 생성하여 response 객체에 담아서 전송
									

									System.out.println("jvo: " + jVo);
									
									service.register(jVo);
									
									System.out.println("인서트 완료!!");
									
									rttr.addFlashAttribute("msg", "SUCCESS");
									rttr.addFlashAttribute("job", jVo);	
									
								      return "redirect:/user/job/job_qd2";

							   }
									
									
									
						//jq2			
									@RequestMapping(value = "/job_qp2", method = RequestMethod.GET)
									   public void modify3GET( Model model )
										         throws Exception {
										   }
									
									
									   @RequestMapping(value = "/job_qp2", method = RequestMethod.POST)
									   public String modify3POST(JobVO jVo, RedirectAttributes rttr, HttpServletRequest request, HttpSession session )
									         throws Exception {

									      

									      logger.info("job modify post ....................");
									     

									      rttr.addFlashAttribute("msg", "MODIFY");
									      rttr.addFlashAttribute("vo", "vo");

									      logger.info("job modify post ....................");
									      
									      
											
											
											
											//SESSION ID 생성
											String sessionID = session.getId();
											session.setAttribute("sessionID", sessionID);
												
											jVo.setSessionId(sessionID);
											
									int jq13 = request.getParameter("jq_13") == null ? 1 : Integer.parseInt(request.getParameter("jq_13"));
									int jq14 = request.getParameter("jq_14") == null ? 1 : Integer.parseInt(request.getParameter("jq_14"));
									int jq15 = request.getParameter("jq_15") == null ? 1 : Integer.parseInt(request.getParameter("jq_15"));
									int jq16 = request.getParameter("jq_16") == null ? 1 : Integer.parseInt(request.getParameter("jq_16"));
									int jq17 = request.getParameter("jq_17") == null ? 1 : Integer.parseInt(request.getParameter("jq_17"));
									int jq18 = request.getParameter("jq_18") == null ? 1 : Integer.parseInt(request.getParameter("jq_18"));
									int jq19 = request.getParameter("jq_19") == null ? 1 : Integer.parseInt(request.getParameter("jq_19"));
									int jq20 = request.getParameter("jq_20") == null ? 1 : Integer.parseInt(request.getParameter("jq_20"));
									int jq21 = request.getParameter("jq_21") == null ? 1 : Integer.parseInt(request.getParameter("jq_21"));
									
									jVo.setJQ13(jq13);
									jVo.setJQ14(jq14);
									jVo.setJQ15(jq15);
									jVo.setJQ16(jq16);
									jVo.setJQ17(jq17);
									jVo.setJQ18(jq18);
									jVo.setJQ19(jq19);
									jVo.setJQ20(jq20);
									jVo.setJQ21(jq21);
									
									//service.update문
								      service.modify(jVo);
								      return "redirect:/user/career/career_q";

							   
							   }
}
