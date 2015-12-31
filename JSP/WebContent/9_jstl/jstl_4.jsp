<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>최대값 구하기</h2>
<body>
<c:if test="true">
	무조건 수행<br>
</c:if>

<c:if test="false">
	false<br>
</c:if>

<c:if test="${param.name == 'bk'}">
	name 파라미터의 값이 ${param.name}입니다.<br>
</c:if>


<!-- http://localhost:8081/JSP/9_jstl/jstl_4.jsp?age=19 -->
<c:if test="${param.age >18}">
	당신의 나이는 18세 이상입니다.
</c:if>

<c:if test="${param.num1 - param.num2 >= 0}">
	num1이 더 큽니다.
</c:if>

<c:if test="${param.num1 - param.num2 < 0}">
	num2가 더 큽니다.
</c:if>
</body>
