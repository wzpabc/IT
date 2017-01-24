<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String json = "[{ \n" + "    \"id\":1, \n" + "    \"text\":\"同步完成\" \n" + "},{ \n" + "    \"id\":2, \n"
			+ "    \"text\":\"EDI处理中\" \n" + "},{ \n" + "    \"id\":3, \n" + "    \"text\":\"OnHold\", \n"
			+ "    \"selected\":true \n" + "},{ \n" + "    \"id\":4, \n" + "    \"text\":\"未就绪\" \n"
			+ "},{ \n" + "    \"id\":5, \n" + "    \"text\":\"正在排队\" \n" + "}]";
	response.getWriter().write(json); //回传到前台
%>