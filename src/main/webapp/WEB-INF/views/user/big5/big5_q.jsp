<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Big Five : 설문</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<link rel="stylesheet" href="/resources/css/litera/bootstrap.css" media="screen">

<!-- <link rel="stylesheet" href="css/litera/custom.min.css"> -->
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
						<h5 id="tables">Big Five 설문지 </h5>
					</div>
					
					<form role="form" method="post">
					
					<input type="hidden" name="sessionID" value="sessionID" />
					
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
										
										<td style="width: 50%">나는 모임에 참석하면 모임의 활력소 역할을 하는 사람이다.</td>
										
										<td class="col-md-1">
										
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_1" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_1" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_1" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_1" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_1" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
											
										</td>
										
									</tr>
									
									<tr>
										<th scope="row">2</th>
										<td>나는 다른 사람들의 감정을 측은히 여긴다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_2" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_2" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_2" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_2" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_2" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>
									<tr>
										<th scope="row">3</th>
										<td>나는 맡은 일을 즉시 처리한다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_3" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_3" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_3" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_3" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_3" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>


									<tr>
										<th scope="row">4</th>
										<td>나는 기분이 자주 바뀐다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_4" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_4" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_4" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_4" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_4" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>

									<tr>
										<th scope="row">5</th>
										<td>나는 상상력이 풍부하다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_5" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_5" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_5" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_5" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_5" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>

									<tr>
										<th scope="row">6</th>
										<td>나는 말을 많이 하지 않는다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_6" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_6" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_6" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_6" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_6" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>


									<tr>
										<th scope="row">7</th>
										<td>나는 다른 사람들의 문제에 관심이 없다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_7" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_7" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_7" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_7" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_7" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>

									<tr>
										<th scope="row">8</th>
										<td>나는 자주 물건을 제자리에 놓는 것을 잊어버린다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_8" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_8" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_8" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_8" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_8" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>

									<tr>
										<th scope="row">9</th>
										<td>나는 대체로 느긋하고 여유롭다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_9" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_9" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_9" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_9" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_9" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>
									
									<tr>
										<th scope="row">10</th>
										<td>나는 추상적인 개념들에 대해 흥미가 없다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_10" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_10" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_10" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_10" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_10" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>


									<tr>
										<th scope="row">11</th>
										<td>나는 사람들을 만나면 여러 사람들과 말을 많이 한다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_11" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_11" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_11" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_11" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_11" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>


									<tr>
										<th scope="row">12</th>
										<td>나는 다른 사람들의 감정을 느낀다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_12" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_12" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_12" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_12" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_12" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>

<tr>
										<th scope="row">13</th>
										<td>나는 질서정연한 것를 좋아한다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_13" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_13" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_13" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_13" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_13" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>

<tr>
										<th scope="row">14</th>
										<td>나는 쉽게 흥분한다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_14" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_14" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_14" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_14" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_14" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>
									
									<tr>
										<th scope="row">15</th>
										<td>나는 추상적인 개념들을 이해하는데 어려움을 느낀다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_15" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_15" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_15" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_15" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_15" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>
									<tr>
										<th scope="row">16</th>
										<td>나는 나를 드러내지 않고 뒤쪽에 있는 편이다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_16" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_16" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_16" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_16" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_16" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>									
									<tr>
										<th scope="row">17</th>
										<td>나는 다른 사람들에게 별다른 관심이 없다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_17" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_17" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_17" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_17" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_17" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>
									<tr>
										<th scope="row">18</th>
										<td>내가 하는 일들은 실수투성이다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_18" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_18" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_18" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_18" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_18" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>									
									<tr>
										<th scope="row">19</th>
										<td>나는 좀처럼 우울함을 느끼지 않는다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_19" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_19" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_19" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_19" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_19" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>									
									<tr>
										<th scope="row">20</th>
										<td>나는 상상력이 풍부하지 않다.</td>
										<td>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_20" id="optionsRadios1"
													value="1" checked> 전혀 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_20" id="optionsRadios1"
													value="2"> 그렇지 않다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_20" id="optionsRadios1"
													value="3"> 보통이다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_20" id="optionsRadios1"
													value="4"> 그렇다
												</label>
											</div>
											<div class="form-group">
												<label class="form-check-label"> <input type="radio"
													class="form-check-input" name="bq_20" id="optionsRadios1"
													value="5"> 매우 그렇다
												</label>
											</div>
										</td>
									</tr>									
									
									
								</tbody>
							</table>
		<hr class="my-4">
		<div class="row">
          <div class="col-lg-12"> Progress 6 / 7 Page					
            <div class="bs-component">
              <div class="progress">
                <div class="progress-bar" role="progressbar" style="width: 84%;" aria-valuenow="84" aria-valuemin="0" aria-valuemax="100"></div>

              </div>
            </div>						
						</div>
						</div>
						</div>
						
						<hr class="my-4">
						<button type="submit" class="btn btn-primary">다음</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>