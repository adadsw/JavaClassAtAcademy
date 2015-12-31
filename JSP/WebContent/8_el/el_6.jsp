<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>

<%
	Map<String, String> map = new HashMap<String, String>();
	map.put("Seoul", "한국");
	map.put("Tokyo", "일본");
	map.put("Washington DC", "미국");
	
	request.setAttribute("address", map);
	RequestDispatcher dispatcher = request.getRequestDispatcher("el_7.jsp");
	dispatcher.forward(request, response);
%>