<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Bootswatch: Litera</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<link rel="stylesheet" href="/resources/css/litera/bootstrap.css" media="screen">
<!-- <link rel="stylesheet" href="/resources/css/litera/custom.min.css"> -->
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
		<div class="row">
			<h5 id="tables"></h5>
		</div>
		<div class="bs-docs-section">
			<div class="row">
				<div class="col-lg-12">
					<div class="page-header">
						<h5 id="tables">인구통계학적 설문지 (6/6) </h5>
					</div>

					<form role="form" method="post">
						<div class="bs-component">
							<table class="table table-hover">
								<thead>
									<tr>
										<th scope="col">NO.</th>
										<th scope="col">설문항목</th>
										<th scope="col">척도</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<th scope="row">1</th>
										<td style="width: 40%">당신의 성별은 무엇입니까?</td>
										<td class="col-md-1">
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="gender" id="optionsRadios1"
													value="1" checked> 남
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="gender" id="optionsRadios1"
													value="2"> 여자
												</label>
											</div>
									</tr>
									<tr>
										<th scope="row">2</th>
										<td>귀하의 나이는 몇 세입니까?</td>
										<td>
											<div class="form-group">
												<input type="text" class="form-control" name="age"
													id="exampleInputEmail1" aria-describedby="emailHelp"
													placeholder="Enter Age"
													onKeyup="this.value=this.value.replace(/[^0-9]/g,'');"
													maxlength="2"> 
													<small id="fileHelp" class="form-text text-muted">설문을 위한 개인정보는 절대 공유하지 않습니다.</small>

											</div>
									</tr>
									<tr>
										<th scope="row">3</th>
										<td>귀하의 업무는 무엇입니까?</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="job" id="optionsRadios1"
													value="1" checked> 개발 업무
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="job" id="optionsRadios1"
													value="2"> 유지보수 업무
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="job" id="optionsRadios1"
													value="3"> 관리 및 사무 업무
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="job" id="optionsRadios1"
													value="4"> 예비 개발자
												</label>
											</div>																						
										</td>
									</tr>
									<tr>
										<th scope="row">4</th>
										<td>귀하의 직급은 무엇입니까?</td>
										<td>
											<div class="form-group">
												<input type="text" class="form-control" name="position"
													id="exampleInputEmail1" aria-describedby="emailHelp"
													placeholder="Enter Position"> <small id="fileHelp"
													class="form-text text-muted">예시: 사원, 과장, 연구원, 책임연구원
													등 자유롭게 입력</small>

											</div>
										</td>
									</tr>
									<tr>
										<th scope="row">5</th>
										<td>귀하의 경력은 몇 년차 입니까?</td>
										<td>
											<div class="form-group">
												<input type="text" class="form-control" name="career"
													id="exampleInputEmail1" aria-describedby="emailHelp"
													placeholder="Enter Career"
													onKeyup="this.value=this.value.replace(/[^0-9]/g,'');"
													maxlength="2"> <small id="fileHelp"
													class="form-text text-muted">경력 년수를 숫자로 입력해주세요.</small>

											</div>
										</td>
									</tr>
									<tr>
										<th scope="row">6</th>
										<td>귀하는 현재 결혼상태는 무엇입니까? 아래 보기에서 선택하십시오.</td>
										<td>
											<div class="form-group">
												<select class="form-control" id="exampleSelect1" name="marital"> 
													<option value="2">기혼 + 자녀 없음</option>
													<option value="3">기혼 + 자녀 있음</option>
													<option	value="1">미혼</option>
												</select>

											</div>
										</td>
									</tr>
									<tr>
										<th scope="row">7</th>
										<td>귀하의 전공은 무엇입니까?</td>
										<td>
											<div class="form-group">
												<input type="text" class="form-control" name="major"
													id="exampleInputEmail1" aria-describedby="emailHelp"
													placeholder="Enter Major"> <small id="fileHelp"
													class="form-text text-muted">대학, 대학원 전공이 있을 경우
													작성해주세요.</small>

											</div>
										</td>
									</tr>	
								<tr>
										<th scope="row">8</th>
										<td>이름</td>
										<td>
											<div class="form-group">
												<input type="text" class="form-control" name="name"
													id="exampleInputEmail1" aria-describedby="emailHelp"
													placeholder="Enter Name"> <small id="fileHelp"
													class="form-text text-muted">이름을 입력해주세요.(필수 사항은 아니며,요청 받았을 경우 작성해주세요.)</small>

											</div>
										</td>
									</tr>									
																
									<tr>
										<th scope="row">9</th>
										<td>기업 정보 / 추천인 정보</td>
										<td>
											<div class="form-group">
												<input type="text" class="form-control" name="id"
													id="exampleInputEmail1" aria-describedby="emailHelp"
													placeholder="Enter CompanyInfo"> <small id="fileHelp"
													class="form-text text-muted">설문 요청한 기업 정보 혹은 추천인이 있으실 경우 입력해주세요.</small>

											</div>
										</td>
									</tr>									
																		
								</tbody>
							</table>
		<hr class="my-4">
		<div class="row">
          <div class="col-lg-12"> Progress 7 / 7 Page					
            <div class="bs-component">
              <div class="progress">
                <div class="progress-bar" role="progressbar" style="width: 100%;" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100"></div>

              </div>
            </div>						
						</div>
						</div>
						</div>
						<hr class="my-4">

						<button type="submit" class="btn btn-primary" onclick="return writeCheck()">설문 완료</button>
					</form>


				</div>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript">
	function writeCheck() {
		

		if (document.frm.age.value.length == 0) {
			alert('나이를 입력해주세요.');
			frm.age.focus();
			return false;
		}
		if (document.frm.posi.value.length == 0) {
			alert('직급을 입력해주세요.');
			frm.posi.focus();
			return false;
		}		
		if (document.frm.career.value.length == 0) {
			alert('경력 년수를 입력해주세요.');
			frm.career.focus();
			return false;
		}	

		return true;
	}
	
</script>








</html>