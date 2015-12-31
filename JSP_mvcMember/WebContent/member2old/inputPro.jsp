<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script src="${project}script.js"></script>

<body>
	<h2>회원가입 - 처리페이지</h2>
	
<%
	int result = (Integer) request.getAttribute("result");
	if (result == 0) { 
%>
	<script type="text/javascript">
		erroralert(inputerror);
	</script>
<%	 
	} else {
		response.sendRedirect("loginForm.do?result=" + result);	
	}
%>
	
</body>
</html>