<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2> 커스텀 태그 </h2>
<c:set var="code" value="80012" scope="request"/>
<c:set var="name" value="온도습계" scope="request"/>
<c:set var="price" value="15000" scope="request"/>

<jsp:forward page="jstl_3.jsp"/>