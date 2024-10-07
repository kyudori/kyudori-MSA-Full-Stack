<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
span { color : #FF0066; }
</style>
</head>
<body>
<h2>연산 요청 결과</h2>
<hr>
결과(표현식태그) : <span><%= request.getAttribute("result") %></span><br><br>
결과(EL) : <span>${ requestScope.result }</span><br><br>
결과(EL) : <span>${ result }</span><br><br>
<a href="${ header.referer }">입력화면</a>
</body>
</html>









