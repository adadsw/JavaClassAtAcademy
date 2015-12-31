<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="${project}script.js"></script>
<h2>회원탈퇴-처리페이지</h2>
<body>

<%
	int resultPasswd = (Integer) request.getAttribute("resultPasswd");
	int result = (Integer) request.getAttribute("result");
	
	if (resultPasswd == 1) {
		if (result == 0) {
%>
			<script type="text/javascript">
			<!--
				erroralert(deleteerror);		
			//-->
			</script>
<%
		} else {
			session.removeAttribute("memId");
			// session.setAttribute("memId", null);
			response.sendRedirect("main.do");
		}
	} else {
%>
		<script type="text/javascript">
			<!--
				erroralert(passwderror);
			//-->
		</script>
<%
	}
%>
</body>
</html>