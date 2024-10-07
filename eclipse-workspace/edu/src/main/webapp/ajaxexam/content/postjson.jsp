<%@ page language="java" contentType="application/json; charset=utf-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.Reader, java.io.InputStreamReader" %>
<%
	StringBuilder sb = new StringBuilder();
    Reader reader = new InputStreamReader(request.getInputStream(), "UTF-8");
    while(true) {
    	int inputChar = reader.read();
    	if (inputChar == -1)
    		break;
    	sb.append((char)inputChar);
    }	
	out.print(sb);
%>
