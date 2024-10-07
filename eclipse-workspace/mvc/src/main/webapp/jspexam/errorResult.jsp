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
<h2>요청을 처리하는 동안 오류가 발생했어요..</h2>
<h3>오류의 원인 : <span><%= request.getAttribute("msg") %> </span></h3> 
<h3>오류의 원인 : <span>${ msg }</span></h3> 
<a href="${ header.referer }">입력화면</a>
</body>
</html>