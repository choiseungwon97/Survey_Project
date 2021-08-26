<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html class="no-js">
<!--<![endif]-->
<head>

<title>정보 수정</title>

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
table {
	width: 100%;
	text-align: center;
	border: none;
	border-collapse: collapse;
}

thead {
	width: 100%;
	height: 5rem;
	font-size: 1.5rem;
	text-align: center;
	background-color: #f5f5f5;
}

th, td {
	text-align: center;
}

tbody tr {
	width: 100%;
	height: 3rem;
	font-size: 1.1rem;
	border-bottom: 1px solid gray;
	border-collapse: collapse;
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

					<li><a href="/admin/admin/company/companyList"><span>기업 목록</span></a></li>
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
							<li><a href="/admin/admin/resultList">설문 참여자 목록</a></li>
							<li class="active">정보 수정</li>
						</ol>
						<!-- end of /.breadcrumb -->

					</div>
				</div>
			</div>
			<!-- /.container -->
		</div>
		<!-- /.header-wrapper --> </header>
		<!-- /.page-head (header end) -->



		<div class="container">
			<div class="row">

				<div class="row">
					<div class="headline text-center">
						<h2 class="section-title">정보 수정</h2>
					</div>
				</div>








				<div class="container">

					<div class="row">
						<div class="col-md-8 col-md-offset-3">
							<form class="notify" role="form" method="post">

								<div class="row">
									<div class="col-md-2 text-right">
										<h5>I D</h5>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<input name="id" type="text" class="form-control" id="id"
												required="required" placeholder="ID" value="${adminVO.id}"
												readonly>
										</div>
									</div>


								</div>






								<div class="row">
									<div class="col-md-2 text-right">
										<h5>PassWord</h5>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<input name="password" type="text" class="form-control"
												id="password" required="required" placeholder="Password"
												value="${adminVO.password}">
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
												id="companyName" required="required" placeholder="기업명"
												value="${adminVO.companyName}" readonly>
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
												id="postCode" required="required" placeholder="우편번호"
												value="${adminVO.postCode}">
										</div>
									</div>
								</div>


								<!-- 	우편번호 불러오기용							
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
									
								</div>
 -->
								<div class="row">
									<div class="col-md-2 text-right">
										<h5>상세주소</h5>
									</div>
									<div class="col-md-6">
										<div class="form-group">
											<input name="address" type="text" class="form-control"
												id="address" required="required" placeholder="상세주소"
												value="${adminVO.address}">
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
												required="required" placeholder="연락처" value="${adminVO.tel}">

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
												id="employeeName" required="required" placeholder="담당자명"
												value="${adminVO.employeeName}">

										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-md-8">
										<div class="headline text-right">
											<button class="btn btn-black" type="submit">MODIFY</button>
											<a href="/admin/admin/resultList" class="btn btn-white">BACK</a>
										</div>
									</div>
								</div>



							</form>
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
</html>
