<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style = "color : red">
		<h1><%=((model.TimeVO) request.getAttribute("time")).getHour()%>시
			<%=((model.TimeVO) request.getAttribute("time")).getMinute()%>분에 당첨
			실패!! 아쉽아쉽
		</h1>
		<img src="sad.png" alt="위로하는 이미지 출력"> <br> <br> 
		<a href="/edu/jspexam/lottoForm.html">로또 응모 링크</a>
	</div>
</body>
</html>