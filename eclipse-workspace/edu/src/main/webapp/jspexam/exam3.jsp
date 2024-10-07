<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="java.time.*"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 학습</title>
</head>
<body>
<h2>표현식 태그 테스트</h2>
<hr>
<% int number = 1000; %>
<ul>
<li>데이터 값 : <%= 100  %></li>
<li>산술 연산 결과 : <%= 100+200   %></li>
<li>메서드의 호출 결과 : <%= java.time.LocalDate.now().getYear()  %></li>
<li>메서드의 호출 결과 : <%= "가나다".length()   %></li>
<li>메서드의 호출 결과 : <%=  System.currentTimeMillis()  %></li>
<li>산술 연산 결과 : <%=  number*2  %></li>
<li>비교 연산 결과 : <%=  100 > 50  %></li>
<li>변수의 값 : <%=  number %></li>
</ul>
</body>
</html>









