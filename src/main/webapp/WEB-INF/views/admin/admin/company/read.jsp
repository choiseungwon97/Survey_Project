<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html class="no-js">
<!--<![endif]-->
<head>

<title>기업 정보</title>

<!-- meta -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">


<!-- stylesheets -->
<link rel="stylesheet"
	href="/resources/avada-agency-pro-master/assets/css/bootstrap.min.css">
<link rel="stylesheet"
	href="/resources/avada-agency-pro-master/assets/css/font-awesome.min.css">
<link rel="stylesheet"
	href="/resources/avada-agency-pro-master/assets/css/animate.css">
<link rel="stylesheet"
	href="/resources/avada-agency-pro-master/assets/css/owl.carousel.css">
<link rel="stylesheet"
	href="/resources/avada-agency-pro-master/assets/css/owl.theme.css">
<link rel="stylesheet"
	href="/resources/avada-agency-pro-master/assets/css/style.css">


<style>
h5 {
	font-size: 1.2rem;
	font-weight: 600;
}
</style>


</head>

<body>
	<div id="single-blog-full-width">


		<!-- site-navigation start -->
		<nav id="mainNavigation" class="navbar navbar-dafault main-navigation"
			role="navigation">
		<div class="container">

			<div class="navbar-header">


				<!-- navbar logo -->
				<div class="navbar-brand">

					<a href="index.html"> <img
						src="/resources/avada-agency-pro-master/assets/img/main_logo.png"
						class="img-responsive center-block" alt="logo">
					</a>
				</div>
				<!-- navbar logo -->

			</div>
			<!-- /.navbar-header -->

			<!-- nav links -->
			<div class="collapse navbar-collapse" id="main-nav-collapse">
				<ul class="nav navbar-nav navbar-right text-uppercase">
					<li><a href="/admin/admin/adminModify"><span>회원 정보</span></a></li>

					<li><a href="/admin/admin/resultList"><span>설문 목록</span></a></li>

					<li><a href="/admin/admin/company/companyList"><span>기업
								목록</span></a></li>
					<li><a href="/admin/admin/logout"><span>로그아웃</span></a></li>
				</ul>
			</div>
			<!-- nav links -->

		</div>
		<!-- /.container --> </nav>
		<!-- site-navigation end -->


		<!-- header begin -->
		<header class="page-head">
		<div class="header-wrapper">
			<div class="container">
				<div class="row">
					<div class="col-md-12">

						<ol class="breadcrumb">
							<li><a href="#">기업 목록</a></li>
							<li class="active">기업 정보</li>
						</ol>
						<!-- end of /.breadcrumb -->

					</div>
				</div>
			</div>
			<!-- /.container -->
		</div>
		<!-- /.header-wrapper --> </header>
		<!-- /.page-head (header end) -->
		<div class="row">
			<div class="headline text-center">
				<h2 class="section-title">기업 정보</h2>
			</div>
		</div>


		<div class="container">
			<div class="row">
				<div class="col-md-8 col-md-offset-3">
					<form role="form">
						<div class="headline">


							<div class="row">
								<div class="col-md-2 text-right">
									<h5>I D</h5>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<input name="id" type="text" class="form-control" id="id"
											required="required" value="${aVo.id}" readonly>
									</div>
								</div>
							</div>


							<div class="row">
								<div class="col-md-2 text-right">
									<h5>기업명</h5>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<input name="companyName" type="text" class="form-control"
											id="companyName" required="required"
											value="${aVo.companyName}" readonly>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-2 text-right">
									<h5>우편번호</h5>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<input name="postCode" type="text" class="form-control"
											id="postCode" required="required" value="${aVo.postCode}"
											readonly>

										<!-- 우편번호 선택 후 불러오기용 <input type="hidden" name=""> -->
									</div>
								</div>

							</div>

							<div class="row">
								<div class="col-md-2 text-right">
									<h5>상세주소</h5>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<input name="address" type="text" class="form-control"
											id="address" required="required" value="${aVo.address}"
											readonly>
									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-2 text-right">
									<h5>전화번호</h5>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<input name="tel" type="text" class="form-control" id="tel"
											required="required" value="${aVo.tel}" readonly>

									</div>
								</div>
							</div>

							<div class="row">
								<div class="col-md-2 text-right">
									<h5>담당자명</h5>
								</div>
								<div class="col-md-6">
									<div class="form-group">
										<input name="employeeName" type="text" class="form-control"
											id="employeeName" required="required"
											value="${aVo.employeeName}" readonly>

									</div>
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-2">
								<div class="headline text-right">
									<button class="btn btn-black btn-danger" type="button">REMOVE</button>
								</div>
							</div>
							<div class="col-md-6">
								<div class="headline text-right">
									<a class="btn btn-black" href="/admin/admin/company/modify?id=${aVo.id}">MODIFY</a>
									<a href="/admin/admin/company/companyList"
										class="btn btn-white">BACK</a>
								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>


		<footer>
		<div class="container">
			<div class="row">

				<!-- about avada agency -->
				<div class="col-md-3 col-sm-6 col-xs-6 footer-widget">
					<h4>For Small Business</h4>

					<p>HUGE Website Builder is a big library of pre-designed web
						elements which help you to create website in few minutes.</p>

					<div class="footer-address">
						<p>
							042-555-5555 <br> example@mail.com
						</p>
					</div>

				</div>
				<!-- /.footer-widget -->

			</div>
		</div>
		</footer>



		<script type="text/javascript"
			src="/resources/avada-agency-pro-master/assets/js/jquery-2.1.3.min.js"></script>
		<script type="text/javascript"
			src="/resources/avada-agency-pro-master/assets/js/bootstrap.min.js"></script>
</body>
<script>
	$(document).ready(function() {
		var formObj = $("form[role='form']");
		//삭제
		$(".btn-danger").on("click", function() {
			formObj.attr("action", "/admin/admin/company/remove");
			formObj.attr("method", "post");
			formObj.submit();

		});

		// 수정
		$(".btn-primary").on("click", function() {
			formObj.attr("action", "/admin/admin/company/modify");
			formObj.attr("method", "get");
			formObj.submit();
		});
	});
</script>
</html>
