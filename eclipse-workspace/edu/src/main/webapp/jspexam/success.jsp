<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="color: red">
		<h1><%=((model.TimeVO) request.getAttribute("time")).getHour()%>시
			<%=((model.TimeVO) request.getAttribute("time")).getMinute()%>분에 당첨!!
			추카추카
		</h1>
		<img src="happy.png" alt="축하이미지 출력">
	</div>
</body>
</html>