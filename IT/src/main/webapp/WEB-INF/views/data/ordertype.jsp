<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String json = "[ \n"	          
	           + "{\"id\":\"ALL\",\"text\":\"ALL\",\"selected\":true }  , \n"
	           + "{\"id\":\"SS\",\"text\":\"SS\"}  , \n"
	           + "{\"id\":\"S2\",\"text\":\"S2\"}  , \n"
	           + "{\"id\":\"SF\",\"text\":\"SF\"}  , \n"
	           + "{\"id\":\"SW\",\"text\":\"SW\"}  , \n"
	           + "{\"id\":\"SB\",\"text\":\"SB\"}  , \n"
	           + "{\"id\":\"SJ\",\"text\":\"SJ\"}  , \n"
	           + "{\"id\":\"SR\",\"text\":\"SR\"} \n"
	           + "]";
	response.getWriter().write(json); //回传到前台
%>