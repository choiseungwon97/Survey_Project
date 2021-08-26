<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!-->

<html class="no-js">
<!--<![endif]-->
<head>

<title>JOIN</title>

<!-- meta -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">


<!-- stylesheets -->
<link rel="stylesheet" href="/resources/assets/css/bootstrap.min.css">
<link rel="stylesheet" href="/resources/assets/css/font-awesome.min.css">
<link rel="stylesheet" href="/resources/assets/css/animate.css">
<link rel="stylesheet" href="/resources/assets/css/owl.carousel.css">
<link rel="stylesheet" href="/resources/assets/css/owl.theme.css">
<link rel="stylesheet" href="/resources/assets/css/style.css">


<!-- scripts -->
<script type="text/javascript"
	src="/resources/assets/js/modernizr.custom.97074.js"></script>

</head>

<body>

	<div id="home-page">

		<!-- site-navigation start -->
		<!-- header start -->
		<header id="header" class="header-wrapper home-parallax home-fade">
			<div class="header-overlay"></div>
			<div class="header-wrapper-inner">
				<div class="container">

					<div class="welcome-speech">
						<h1>JOIN</h1>

						<br /> <br />











						<!--   footer section begin   -->

						<div class="container">

							<div class="row">
								<div class="col-md-8 col-md-offset-3">
									<form role="form" method="post" name="frm">




										<!-- 							
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<input name="id" type="text" class="form-control" id="id"
												required="required" placeholder="ID">
											<input type="hidden" name="reid">
										</div>
									</div>
									
									<div class="col-md-2">
										<div class="form-group">
											<a href="#" class="btn btn-success" onclick="idCheck()">중복</a>
										</div>
									</div>
								</div>
 -->


										<div class="row">
											<div class="col-md-8">
												<div class="form-group">
													<input name="id" type="text" class="form-control" id="id"
														required="required" placeholder="ID"> <input
														type="hidden" name="reid">
												</div>
											</div>
										</div>





										<div class="row">
											<div class="col-md-8">
												<div class="form-group">
													<input name="password" type="password" class="form-control"
														id="password" required="required" placeholder="PASSWORD">
												</div>
											</div>
										</div>

										<div class="row">
											<div class="col-md-8">
												<div class="form-group">
													<input name="companyName" type="text" class="form-control"
														id="companyName" required="required" placeholder="기업명">
												</div>
											</div>
										</div>




										<!-- 								
								<div class="row">
									<div class="col-md-6">
										<div class="form-group">
											<input name="postCode" type="text" class="form-control" id="postCode"
												required="required" placeholder="우편번호">
											우편번호 선택 후 불러오기용 <input type="hidden" name="">
										</div>
									</div>
									
									<div class="col-md-2">
										<div class="form-group">
											<a href="#" class="btn btn-success" onclick="우번번호 찾기용">검색</a>
										</div>
									</div>
 -->

										<div class="row">
											<div class="col-md-8">
												<div class="form-group">
													<input name="postCode" type="text" class="form-control"
														id="postCode" required="required" placeholder="우편번호">
													<!-- 우편번호 선택 후 불러오기용 <input type="hidden" name=""> -->
												</div>
											</div>
										</div>





										<div class="row">
											<div class="col-md-8">
												<div class="form-group">
													<input name="address" type="text" class="form-control"
														id="address" required="required" placeholder="상세주소">
												</div>
											</div>
										</div>

										<div class="row">
											<div class="col-md-8">
												<div class="form-group">
													<input name="tel" type="text" class="form-control" id="tel"
														required="required" placeholder="연락처">
												</div>
											</div>
										</div>

										<div class="row">
											<div class="col-md-8">
												<div class="form-group">
													<input name="employeeName" type="text" class="form-control"
														id="employeeName" required="required" placeholder="담당자명">
												</div>
											</div>
										</div>

										<div class="row">
											<div class="col-md-8">
												<div class="form-group">
													<button class="btn btn-black" type="submit" onClick="writeCheck()">가입</button>
													&nbsp; &nbsp; &nbsp; <a href="/admin/admin/login"
														class="btn btn-white"> 취소 </a>
													<!-- <a href="#" class="btn btn-black"> LOGIN </a> -->
												</div>
											</div>
										</div>



									</form>
								</div>
							</div>
						</div>
						<!-- /.row -->

					</div>
					<!-- /.container -->

					<!--   footer section end   -->












				</div>
				<!-- /.intro -->

			</div>
			<!-- /.container -->
	</div>
	<!-- /.header-wrapper-inner -->
	</header>
	<!-- /#header -->


	<footer>
		<div class="container">
			<div class="row">

				<!-- useful links -->
				<div class="col-md-6 col-sm-6 col-xs-6 footer-widget">
					<h4>연구 소개</h4>
					<ul class="row footer-links">
						<li><a href="#">경력지향 설문</a><br></li>

						<li>본 연구는 설문 조사를 통해 업종 별 직무 특성과 개인의 경력 지향의 차이가 업무 만족도와 이직
							의도와의 관계를 이해하고자 합니다.<br>
						</li>

						<li>본 설문은 순수한 연구목적에만 사용되며, 본 연구를 통해 알게 된 개인의 정보와 설문 결과는 개인 동의
							없이 외부로의 유출이나 공개되지 않습니다.<br>
						</li>

						<li>직무 특성과 경력 지향 대한 설문 결과를 확인해주세요.</li>

					</ul>
				</div>

				<!-- /.footer-widget -->
				<!-- about avada agency -->
				<div class="col-md-6 col-sm-6 col-xs-6 footer-widget">
					<h4>INFORMATION</h4>
					<div class="col-md-4 col-sm-4 col-xs-6">
						<img src="/resources/assets/img/intro.jpg"
							class="img-responsive center-block" alt="recent news 1">
					</div>

					<p>문의 사항은(Email,메일주소)로 연락해 주시면 성심 성의껏 답변해 드리도록 하겠습니다.</p>

					<div class="footer-address">
						<p>
							(34430) 대전광역시 대덕구 한남로 70 한남대학교 대학원 경영정보학과 <br> Email :
							clicku123@gmail.com
						</p>
					</div>

				</div>
				<!-- /.footer-widget -->

			</div>
		</div>
	</footer>

	<!-- footer-navigation end -->

	</div>
	<!-- end of /#home-page -->

	<!--  Necessary scripts  -->

	<script type="text/javascript"
		src="/resources/assets/js/jquery-2.1.3.min.js"></script>
	<script type="text/javascript"
		src="/resources/assets/js/bootstrap.min.js"></script>
	<script type="text/javascript"
		src="/resources/assets/js/owl.carousel.js"></script>
	<script type="text/javascript"
		src="/resources/assets/js/jquery.hoverdir.js"></script>


	<!-- script for portfolio section using hoverdirection -->
	<script type="text/javascript">
		$(function() {

			$('.portfolio-item > .item-image').each(function() {
				$(this).hoverdir({
					hoverDelay : 75
				});
			});

		});
	</script>


	<!-- script for twitter-feed using owl carousel-->
	<script type="text/javascript">
		$(document).ready(function() {

			$("#twit").owlCarousel({

				navigation : true, // Show next and prev buttons
				slideSpeed : 100,
				paginationSpeed : 400,
				navigationText : false,
				singleItem : true,
				autoPlay : true,
				pagination : false
			});

		});
	</script>


	<!-- script for testimonial section using owl carousel -->
	<script type="text/javascript">
		$(document).ready(function() {

			$("#client-speech").owlCarousel({

				autoPlay : 5000, //Set AutoPlay to 3 seconds
				stopOnHover : true,
				singleItem : true
			});

		});
	</script>

	<script>
	function writeCheck() {
		
			alert('회원가입에 성공하셨습니다.');

	}
	</script>


</body>


</html>