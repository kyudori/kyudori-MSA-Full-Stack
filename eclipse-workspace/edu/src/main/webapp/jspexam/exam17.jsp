<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html> 
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 테스트</title>
</head>
<body>
<h2>&lt;c:redirect&gt; 태그 예제</h2>
<hr>
<c:redirect url="header.jsp">
    <c:param name="id" value="둘리" />
</c:redirect>
</body>
</html>