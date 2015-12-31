<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>forEach</title>
<%
	String[] arr={"불고기 백반", "오므라이스", "콩국수"};
	request.setAttribute("menu", arr);
%>
<jsp:forward page="jstl_8.jsp"/>
