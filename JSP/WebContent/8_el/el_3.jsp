<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%
	request.setCharacterEncoding("UTF-8");
%>
아이디 : ${param.id} <br>
선택한 애완 동물 : ${paramValues.animal[0]}${paramValues.animal[1]}${paramValues.animal[2]}
