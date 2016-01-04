<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="setting.jsp" %>
<body>
	<h2>회원가입 - 처리페이지</h2>
<!-- insert error -->
<c:if test="${result == 0}">
	<script type="text/javascript">
		<!--
		erroralert(inputerror);
		//-->
	</script>
</c:if>
<!-- insert ok -->
<c:if test="${result != 0}">
	<c:redirect url="loginForm.do?result=${result}"/>
</c:if>
</body>
</html>