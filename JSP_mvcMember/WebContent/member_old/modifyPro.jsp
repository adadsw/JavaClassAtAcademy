<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>회원정보수정 - 처리페이지</h2>
<body>

<%
	int result = (Integer) request.getAttribute("result");
	if (result == 0) {
%>
	<script type="text/javascript">
		<!--
		erroralert(modifyerror);
		//-->
	</script>
<%
	} else {
		response.sendRedirect("main.do");
	}
%>
</body>
</html>