<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 학습</title>
<style>
	h2 {
		color : blue;
	}
	h3 {
		color : green;
	}
	h4 {
		color : magenta;
	}
</style>
</head>
<body>
<h1>선언문 태그 학습</h1>
<hr>
<%!
	char getKorDay() {
	    char result=' ';
		int day = new java.util.GregorianCalendar().get(java.util.Calendar.DAY_OF_WEEK);
		switch(day) {
		case 1 : result = '일'; break;
		case 2 : result = '월'; break;
		case 3 : result = '화'; break;
		case 4 : result = '수'; break;
		case 5 : result = '목'; break;
		case 6 : result = '금'; break;
		case 7 : result = '토'; 
		}
	    return result;	
   }
%>
<h2>오늘은 <%=  getKorDay() %>요일입니다.</h2>
<h3>오늘은 <%=  getKorDay() %>요일입니다.</h3>
<h4>오늘은 <%=  getKorDay() %>요일입니다.</h4>
</body>
</html>















