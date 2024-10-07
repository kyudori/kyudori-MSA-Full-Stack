<%@ page language="java" contentType="application/json; charset=UTF-8"%>
<% String news[] = { "비수도권 데이터센터 인력난…전문인력 양성 지원한다",
		"서울시, AI 시대 행정 준비…디지털 행정 효율성, 성과관리 강화",
		"살아나는 벤처투자 시장…신기술 스타트업 대규모 투자 유치",
  	    "‘인기 대폭발’ 대전 공영자전거 ‘타슈’… 확 늘어나고, 계속 진화한다",
		"삼성전자 “AI 에어컨 진화 비결은 '빅데이터'”",
		"SK C&C, 국내 최초 뇌출혈 AI 진단 솔루션 美 FDA 허가",
		"오라클, DB에 AI 더한 '오라클 DB 23ai' 출시"};%>
<% response.setHeader("Cache-Control", "no-cache"); %>
<% int num = (int)(Math.random() * 7);%>
{ 
	"news" : "<%= news[num] %>"
}