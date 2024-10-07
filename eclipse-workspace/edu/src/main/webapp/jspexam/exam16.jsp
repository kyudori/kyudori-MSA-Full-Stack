<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html> 
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 테스트</title>
<style>
	div#one {
		background-color : yellow;
	}
	div#two {
		background-color : pink;
	}
</style>

</head>
<body>
<c:url var="urlheader" value="header.jsp" >
  <c:param name="id" value="UNICO" />
</c:url>
<h3>&lt;c:url&gt;  과 &lt;c:param&gt; 태그의 처리 결과 : ${urlheader} </h3>
<c:import url="${urlheader}" var="head" />
<c:import url="https://www.w3.org/" var="urlEx"/>    
<c:import var="weather" 
 url="http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1168064000">
  </c:import>
<div id="one">
${head}
</div>
<div id ="two">
${weather} 
</div>
${urlEx}
</body>
</html>