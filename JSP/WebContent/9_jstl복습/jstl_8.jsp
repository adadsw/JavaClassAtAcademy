<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
	<title>구내식당</title>
</head>
<body>
	<h3>오늘의 점심 메뉴</h3>
	<ul>
		<c:forEach var="cnt" items="${menu}">
			<li>${cnt}</li>
		</c:forEach>
	</ul>
</body>