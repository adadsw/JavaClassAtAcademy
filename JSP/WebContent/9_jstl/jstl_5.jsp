<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head><title>choose 태그</title></head>
<body>
	<h2>인사하기</h2>
	
	<!-- http://localhost:8081/JSP/9_jstl/jstl_5.jsp?num=0 -->
	<c:choose>
		<c:when test="${param.num ==0}">
			처음 뵙겠습니다.
		</c:when>
		<c:when test="${param.num ==1}">
			반갑습니다.
		</c:when>
		<c:otherwise>
			안녕하세요.
		</c:otherwise>
	</c:choose>
</body>