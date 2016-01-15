<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 기본 패키지(spring.mvc.member의 3번째 이름이 context name이 된다.	
	/context name/resources/
	ss -->
<c:set var="project" value="${'./resources/'}"/>
<script src="${project}script.js"></script>
<link type="text/css" rel="stylesheet" href="${project}style.css">