<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Bootswatch: Sketchy</title>

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />

<link rel="stylesheet" href="/resources/css/bootstrap.min.css" media="screen">

<style type="text/css">
a:link {
	color: white;
	text-decoration: none;
}

a:visited {
	color: white;
	text-decoration: none;
}

a:hover {
	font-weight: bold;
	color: white;
	text-decoration: none;
	color: white;
}
</style>
<script>
	var _gaq = _gaq || [];
	_gaq.push([ '_setAccount', 'UA-23019901-1' ]);
	_gaq.push([ '_setDomainName', "bootswatch.com" ]);
	_gaq.push([ '_setAllowLinker', true ]);
	_gaq.push([ '_trackPageview' ]);

	(function() {
		var ga = document.createElement('script');
		ga.type = 'text/javascript';
		ga.async = true;
		ga.src = ('https:' == document.location.protocol ? 'https://ssl'
				: 'http://www')
				+ '.google-analytics.com/ga.js';
		var s = document.getElementsByTagName('script')[0];
		s.parentNode.insertBefore(ga, s);
	})();
</script>
</head>
<body>

	<div class="container">


		<!-- Navbar
      ================================================== -->
		<div class="bs-docs-section clearfix">
			<div class="row">
				<div class="col-lg-12">
					<div class="page-header">
						<h1 id="navbars">FORSB</h1>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-12">
				<div class="bs-component">
					<div class="card text-white bg-success mb-3">
						<div class="card-header">회원 등록하기</div>
						<form name="frm" action="userinfo.do" method="post">
							<input type="hidden" name="command" value="member_join_insert" />

							<div class="card-body">
								<p class="card-title">이름을 입력해 주세요.</p>
								<p class="card-title">
									<input class="form-control" type="text" name="name"
										placeholder="이름" id="inputDefault">
								</p>
								<p class="card-title">핸드폰 번호를 입력해 주세요.</p>
								<div class="row">
									<div class="col-lg-2">
										<input class="form-control" id="inputDefault" type="text"
											placeholder="010" readonly>

									</div>
									<div class="col-lg-3">

										<input class="form-control" type="text" name="phone1"
											placeholder="핸드폰 중간자리" id="inputDefault" maxlength="4"  onKeyup="this.value=this.value.replace(/[^0-9]/g,'');"/>

									</div>
									<div class="col-lg-3">

										<input class="form-control" type="text" name="phone2"
											placeholder="핸드폰 뒷자리" id="inputDefault"  maxlength="4" onKeyup="this.value=this.value.replace(/[^0-9]/g,'');"/>

									</div>
								</div>
								<p></p>
								<p>개인정보 동의에 체크 해 주세요.</p>
								<label class="form-check-label"> 
									 <input class="form-check-input" type="checkbox" name="U_checkAgreement1" value="" checked> 동의
									</label> 
									<div class="row">
										<div class="col-lg-3">
											<button type="submit" class="btn btn-outline-warning"
												onclick="return memberCheck()">등록하기</button>
										</div>
									</div>




								</div>
						</form>
					</div>

				</div>
			</div>


		</div>
	</div>




</body>
<link
	href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css"
	rel="stylesheet">
<link
	href='http://fonts.googleapis.com/css?family=Roboto:400,700,300|Material+Icons'
	rel='stylesheet' type='text/css'>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons"
	rel="stylesheet">
<!--   Core JS Files   -->
<script src="/resources/admin/assets/js/jquery-3.2.1.min.js" type="text/javascript"></script>
<script src="/resources/admin/assets/js/bootstrap.min.js" type="text/javascript"></script>
<script src="/resources/admin/assets/js/material.min.js" type="text/javascript"></script>
<!--  Charts Plugin -->
<script src="/resources/admin/assets/js/bootstrap-notify.js"></script>

<script src="/resources/admin/assets/js/demo.js"></script>

<script type="text/javascript">
	function memberCheck() {
		
		var chk1=document.frm.U_checkAgreement1.checked;

		if (document.frm.name.value == "") {
			demo.showNotification('top', 'center', '이름을 입력하여 주십시오.');
			/* alert('아이디를 입력하여 주십시오.'); */
			frm.name.focus();

			return false;
		}
		if (document.frm.phone1.value == "") {
			demo.showNotification('top', 'center', '핸드폰 중간자리 번호를 입력하여 주십시오.');
			/* alert('아이디를 입력하여 주십시오.'); */
			frm.phone1.focus();

			return false;
		}
		if (document.frm.phone2.value == "") {
			demo.showNotification('top', 'center', '핸드폰 뒷자리 번호를 입력하여 주십시오.');
			/* alert('아이디를 입력하여 주십시오.'); */
			frm.phone2.focus();

			return false;
		}
        if(!chk1){
        	demo.showNotification('top', 'center', '개인정보 활용에 동의해 주세요.');
            frm.U_checkAgreement1.focus();
            return false;
        } 

		return true;

	}
</script>





</html>