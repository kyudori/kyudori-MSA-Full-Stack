<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 테스트</title>
</head>
<body>
<h1>첫 번째 JSP 테스트 예제</h1>
<hr>
<h3>오늘 날짜 : <%= java.time.LocalDate.now() %></h3>
</body>
</html>