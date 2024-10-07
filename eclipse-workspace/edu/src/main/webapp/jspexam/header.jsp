<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<c:if test="${param.id != null}">
<hr>
<h3 style="color : red ;"> ${param.id} 님의 방문을 환영합니다.</h3>
<hr>
</c:if>