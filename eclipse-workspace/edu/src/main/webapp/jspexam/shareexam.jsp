<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>서블릿에서 보관된 객체 추출</h1>
	<hr>
	<h3>
		request scope :
		<%=request.getAttribute("myRequest")%></h3>
	<h3>
		session scope :
		<%=session.getAttribute("mySession")%></h3>
	<h3>
		application scope :
		<%=application.getAttribute("myApp")%></h3>
	<hr>
	<h3>request scope : ${ requestScope.myRequest }</h3>
	<h3>session scope : ${ sessionScope.mySession }</h3>
	<h3>application scope : ${ applicationScope.myApp }</h3>
	<hr>
	<h3>request scope : ${ myRequest }</h3>
	<h3>session scope : ${ mySession }</h3>
	<h3>application scope : ${ myApp }</h3>
</body>
</html>







