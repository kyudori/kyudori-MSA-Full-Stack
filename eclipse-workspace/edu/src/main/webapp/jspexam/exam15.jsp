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
<h2>&lt;c:if&gt; 와 &lt;c:choose&gt; 태그 예제</h2>
<hr>
<c:if test="true">
무조건 수행<br>
</c:if>

<c:if test="${ empty param.name and empty param.age }" >
	<h3>name=xxx&amp;age=xxx 의 형식으로 Query 문자열을 전달하세요..</h3>
</c:if>

<c:if test="${ !empty param.name and !empty param.age }" >
	<c:if test="${param.name == 'duke'}">
		name 파라미터의 값이 ${param.name} 입니다.<br> 
	</c:if>

	<c:if  test="${ param.age >= 30 }"> 
		당신의 나이는 30세 이상입니다.
	</c:if>
	<c:if  test="${ param.age < 30 }"> 
		당신의 나이는 30세 미만입니다.
	</c:if>
	<hr>
	<ul>
	<c:choose> 
  		<c:when test="${param.name == 'duke'}" > 
    		<li> 당신의 이름은 ${param.name} 입니다.
  		</c:when> 
  		<c:when test="${param.age >= 30}" > 
    		<li> 당신은 30세 이상입니다.
  		</c:when> 
  		<c:otherwise> 
    		<li> 당신은 'duke'도 아니고 30세 이상도 아닙니다.
  		</c:otherwise> 
	</c:choose> 
	</ul>
</c:if>
</body>
</html>