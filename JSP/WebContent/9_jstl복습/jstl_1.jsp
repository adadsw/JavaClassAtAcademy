<%@ page language="java" contentType="text/html charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>커스텀 태그</title>

<c:set var="num1" value="7"/>
<c:set var="num2" value="9"/>
<c:set var="result" value="${num1*num2}"/>
${result}