<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="/resources/html2canvas.js"></script>
<script src="/resources/jspdf.min.js"></script>
<title>경력지향 설문 - 결과</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<link rel="stylesheet" href="/resources/css/litera/bootstrap.css" media="screen">
<!-- <link rel="stylesheet" href="/resources/css/litera/custom.min.css"> -->
<!-- stylesheets -->
<link rel="stylesheet" href="/resources/assets/css/font-awesome.min.css">
<link rel="stylesheet" href="/resources/assets/css/animate.css">
<link rel="stylesheet" href="/resources/assets/css/owl.carousel.css">
<link rel="stylesheet" href="/resources/assets/css/owl.theme.css">
<link rel="stylesheet" href="/resources/assets/css/style.css">
<link rel="stylesheet" href="/resources/assets/css/big5.css">
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

<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.bundle.min.js"></script>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.8.0/Chart.min.js"></script>

<style>
canvas {
	-moz-user-select: none;
	-webkit-user-select: none;
	-ms-user-select: none;
}
</style>

<style>
.max-small {
    width: auto; height: auto;
    max-width: 300px;
    max-height: 300px;
}
</style>

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
						<h5 id="tables">설문 결과</h5>
					</div>
					<div class="bs-component">
						<button type="button" class="btn btn-primary" id="savePdf">PDF
							저장</button>
						<br> <br> <br>
					</div>

					<div id="pdfDiv">
						<div class="comments">
							<div class="row">

								<div class="col-md-12">
									<h5>기본정보</h5>
									<div class="well">
										<div class="row">
											<div class="col-md-1"></div>
											<div class="col-md-5">
												<p class="comment-info">
													<span>이름: </span> <strong>${gvo.name}</strong>
												</p>
												<p class="comment-info">
													<span>나이: </span> <strong>${gvo.age}</strong>
												</p>
												<p class="comment-info">
													<span>경력: </span> <strong>${gvo.career}</strong>
												</p>
												<p class="comment-info">
													<span>성별: </span> <strong>${gvo.gender}</strong>
												</p>
											</div>
											<div class="col-md-5">

												<p class="comment-info">
													<span>담당 업무: </span> <strong>${gvo.job}</strong>
												</p>
												<p class="comment-info">
													<span>전공: </span> <strong>${gvo.major}</strong>
												</p>
												<p class="comment-info">
													<span>결혼상태: </span> <strong>${gvo.marital}</strong>
												</p>
											</div>
											<div class="col-md-1"></div>
										</div>
									</div>
								</div>
							</div>
						</div>

						<div class="col-md-12">
							<h5>직무 특성(Job Characteristics) 및 경력 닻(Career anchor) 설문 결과</h5>
							<div class="well">
								<div class="row">
									<div class="col-md-6">
										<canvas id="myRadarJobChart"></canvas>
									</div>
									<div class="col-md-6">
										<canvas id="myRadarCarrerChart"></canvas>
									</div>
								</div>
							</div>
						</div>
						
						<div class="col-md-12">
							<h5>Big5 설문 결과</h5>
							<div class="well">
								<div class="row">
									<div class="col-md-12">
										<canvas id="myRadarBig5Chart"></canvas>
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										<table>
											<thead>
												<tr rowspan="3">
													<td>C</td><td>A</td><td>N</td><td>O</td><td>E</td>
												</tr>
											</thead>
												
											<tbody class="line">
												<tr>
													<th>성실성</th><th>친화성</th><th>신경증</th><th>개방성</th><th>외향성</th>
												</tr>
											</tbody>
											<tfoot>
											<tbody class="tbtext">
												<tr><td> </td><td> </td><td> </td><td> </td><td> </td></tr>
												<tr>
													<td>- 신뢰할 수 있는</td><td>- 친절한</td><td>- 긴장하고 불안한</td><td>- 호기심이 강한</td><td>- 말이 많은</td>
												</tr>
												<tr>
													<td>- 준비된, 구성적인</td><td>- 우호적인/협력적인</td><td>- 시무룩한</td><td>- 상상력 있는</td><td>- 사교적인</td>
												</tr>
												<tr>
													<td>- 믿음직한</td><td>- 동정적인/호의적인</td><td>- 감정적인</td><td>- 창의적인</td><td>- 열정적인</td>
												</tr>
												<tr>
													<td>- 신빙성 있는</td><td>- 유익한</td><td>- 자신이 없는</td><td>- 종합적인</td><td>- 자신감이 넘치는</td>
												</tr>
												<tr>
													<td>- 야심적인</td><td>- 예의바른.정중한</td><td>- 질투심 있는</td><td>- 정제된(차분한)</td><td>- 대담한(용감한)</td>
												</tr>
												<tr>
													<td>- 근면한</td><td>- 온화한</td><td>- 불안정한</td><td>- 세련된</td><td>- 주도적인</td>
												</tr>
												<tr>
													<td>- 끈기 있는</td><td></td><td></td><td></td><td></td>
												</tr>
												<tr><td> </td><td> </td><td> </td><td> </td><td> </td></tr>
											
											<tr>
												<th>NOT</th><th>NOT</th><th>NOT</th><th>NOT</th><th>NOT</th>
											</tr>
												
											
												<tr><td> </td><td> </td><td> </td><td> </td><td> </td></tr>
												<tr>
													<td>- 부주의한, 경솔한</td><td>- 비판적인</td><td>- 차분한</td><td>- 지식탐구에 관심없는</td><td>- 조용한</td>
												</tr>
												<tr>
													<td>- 단정치 못한</td><td>- 대립하는/적대적인</td><td>- 견실한</td><td>- 틀에 박힌</td><td>- 수줍어 하는</td>
												</tr>
												<tr>
													<td>- 무능한</td><td>- 냉담한/무신경한</td><td>- 느긋한</td><td>- 순응적인</td><td>- 내성적인</td>
												</tr>
												<tr>
													<td>- 태만한</td><td>- 이기적인</td><td>- 편안한, 여유로운</td><td>- 단순한</td><td>- 숫기없는</td>
												</tr>
												<tr>
													<td>- 게으른</td><td>- 무례한</td><td>- 안정적인</td><td>- 비예술적인</td><td>- 마음을 열지 않는</td>
												</tr>
												<tr>
													<td>- 무책임한</td><td>- 싸늘한</td><td>- 만족하는</td><td>- 전통적인(구식의)</td><td>- 순종적인</td>
												</tr>
												<tr><td> </td><td> </td><td> </td><td> </td><td> </td></tr>
												<tr><td> </td><td> </td><td> </td><td> </td><td> </td></tr>
											</tbody>
										</table>
									</div>
								</div>
							</div>
						</div>						
						
						<div class="col-md-12">
							<div class="well">
								<div class="row">
									<div class="col-md-12">
										<p>MPS (Motivating potential score: 동기유발지수) = ${MPS}</p>
										<p>직무 특성이 내재적 업무동기를 어느 정도 유발 하는지 정도를 나타내는 지표로 직무 만족도 점수로
											사용한다.</p>
									</div>
								</div>
							</div>
						</div>


						<div class="col-md-12">
							<div class="well">
								<div class="row">
									<div class="col-md-12">
										<p>
											<span>SESSIONID: </span> <strong>${gvo.sessionId}</strong>
										</p>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>

<script>
	var ctx = document.getElementById('myRadarJobChart');

	var data_job = new Array();
	<c:forEach items="${job}" var="item">
	data_job.push("${item}");
	</c:forEach>

	var myRadarJobChart = new Chart(ctx, {
		type : 'radar',
		data : {
			labels : [ '기능 다양성', '과업 정체성', '과업 중요성', '자율성', '(직무) 피드백',
					'(조직) 피드백', '타인 관계' ],
			datasets : [ {
				label : 'Job Characteristics',
				borderColor : [ 'rgba(54, 162, 235, 1)' ],
				backgroundColor : [ 'rgba(54, 162, 235, 0.2)' ],
				pointBackgroundColor : [ 'rgba(54, 162, 235, 1)' ],
				data : data_job
			//[ 6, 13, 9, 14, 9, 8, 8 ]
			} ]
		},

		options : {
			legend : {
				position : 'top',
			},
			title : {
				display : true,
				text : '직무특성(Job Characteristics)'
			},
			scale : {
				beginAtZero : true,
				ticks : {
					suggestedMin : 1,
					suggestedMax : 15
				}
			}
		}

	});
</script>


<script>
	var ctx = document.getElementById('myRadarCarrerChart');

	var data_car = new Array();

	<c:forEach items="${carreer}" var="item">
	data_car.push("${item}");
	</c:forEach>

	var myRadarCarrerChart = new Chart(ctx, {
		type : 'radar',
		data : {
			labels : [ '조직 안정성', '지리적 안정성', '봉사헌신', '관리역량', '기술지향', '자율독립 지향',
					'도전 지향', '생활방식 지향', '정체성', '다양성', '창의성' ],
			datasets : [ {
				label : 'Career anchor',
				borderColor : [ 'rgba(75, 192, 192, 1)' ],
				backgroundColor : [ 'rgba(75, 192, 192, 0.2)' ],
				pointBackgroundColor : [ 'rgba(75, 192, 192, 1)' ],
				data : data_car
			//[ 6, 13, 9, 14, 9, 8, 8, 10 ]
			} ]
		},

		options : {
			legend : {
				position : 'top',
			},
			title : {
				display : true,
				text : '경력 닻(Career anchor)'
			},
			scale : {
				beginAtZero : true,
				ticks : {
					suggestedMin : 1,
					suggestedMax : 30
				}
			}
		}

	});
</script>


<script>
	var ctx = document.getElementById('myRadarBig5Chart');

	var data_big = new Array();

	<c:forEach items="${bigfive}" var="item">
	data_big.push("${item}");
	</c:forEach>

	var myRadarCarrerChart = new Chart(ctx, {
		type : 'line',
		data : {
			labels : [ '성실성', '친화성', '신경증', '개방성', '외향성' ],
			datasets : [ {
				label : 'Big 5 Norm',
				borderColor : [ 'rgba(204, 153, 255, 1)' ],
				backgroundColor : [ 'rgba(75, 192, 192, 0.0)' ],
				pointBackgroundColor : [ 'rgba(204, 153, 255, 1)' ],
				lineTension: 0,
				fill: false,
				data : [ 13.7, 16, 10, 15, 13 ]
			}, {
				label : 'My Big 5',
				borderColor : [ 'rgba(255, 102, 000, 1)' ],
				backgroundColor : [ 'rgba(255, 102, 000, 0.2)' ],
				pointBackgroundColor : [ 'rgba(255, 102, 000, 1)' ],
				lineTension: 0,
				fill: false,
				data : data_big
			} ]
		},
		options: {
			
			scales: {
				yAxes: [{
					ticks: {
						min: 4,
						max: 20,
						stepSize : 1
					}
				}]
			}
		}

	});
</script>
<!-- 
<script>
	var ctx = document.getElementById('myRadarBig5Chart');

	var data_big = new Array();

	<c:forEach items="${bigfive}" var="item">
	data_big.push("${item}");
	</c:forEach>

	var myRadarCarrerChart = new Chart(ctx, {
		type : 'radar',
		data : {
			labels : [ '성실성', '친화성', '신경증', '개방성', '외향성'],
			datasets : [ {
				label : 'Big 5 Norm',
				borderColor : [ 'rgba(204, 153, 255, 1)' ],
				backgroundColor : [ 'rgba(75, 192, 192, 0.0)' ],
				pointBackgroundColor : [ 'rgba(204, 153, 255, 1)' ],
				data : [ 13.7, 16, 10, 15, 13 ]
			},
			{
				label : 'Big 5',
				borderColor : [ 'rgba(255, 102, 000, 1)' ],
				backgroundColor : [ 'rgba(255, 102, 000, 0.2)' ],
				pointBackgroundColor : [ 'rgba(255, 102, 000, 1)' ],
				data : data_big
			}]
		},

		options : {
			legend : {
				position : 'top',
			},
			title : {
				display : true,
				text : 'Big 5'
			},
			scale : {
				beginAtZero : true,
				ticks : {
					suggestedMin : 1,
					suggestedMax : 20
				}
			}
		}

	});
</script>

 -->

<script>
	$(document)
			.ready(
					function() {
						$('#savePdf')
								.click(
										function() { // pdf저장 button id

											html2canvas($('#pdfDiv')[0])
													.then(
															function(canvas) { //저장 영역 div id

																// 캔버스를 이미지로 변환
																var imgData = canvas
																		.toDataURL('image/png');

																var imgWidth = 190; // 이미지 가로 길이(mm) / A4 기준 210mm
																var pageHeight = imgWidth * 1.414; // 출력 페이지 세로 길이 계산 A4 기준
																var imgHeight = canvas.height
																		* imgWidth
																		/ canvas.width;
																var heightLeft = imgHeight;
																var margin = 10; // 출력 페이지 여백설정
																var doc = new jsPDF(
																		'p',
																		'mm');
																var position = 0;

																// 첫 페이지 출력
																doc
																		.addImage(
																				imgData,
																				'PNG',
																				margin,
																				position,
																				imgWidth,
																				imgHeight);
																heightLeft -= pageHeight;

																// 한 페이지 이상일 경우 루프 돌면서 출력
																while (heightLeft >= 20) {
																	position = heightLeft
																			- imgHeight;
																	doc
																			.addPage();
																	doc
																			.addImage(
																					imgData,
																					'PNG',
																					0,
																					position,
																					imgWidth,
																					imgHeight);
																	heightLeft -= pageHeight;
																}

																// 파일 저장
																doc
																		.save('survey_result.pdf');

																setTimeout(
																		function() {
																			alert('결과 화면을 PDF 출력하셨으니, 메인화면으로 이동합니다. 설문 감사합니다.');
																			location.href = "home.jsp";

																		}, 3000);

															});

										});

					})
</script>




</html>