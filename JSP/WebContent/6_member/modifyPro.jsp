<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="regBean" class="mvc.member.dao.LogonDBBean"/>
<jsp:useBean id="dto" class="mvc.member.dto.LogonDataBean"/>
<h2>회원정보수정 - 처리페이지</h2>
<body>

<%
	dto.setPasswd(request.getParameter("passwd"));
	dto.setEmail(request.getParameter("email"));
	dto.setTel(request.getParameter("tel"));
	dto.setId((String) session.getAttribute("memId"));	
	
	int result = regBean.modifyMember(dto);
	request.setAttribute("result", result);
	
	if (result == 0) {
%>
	<script type="text/javascript">
		<!--
		erroralert(modifyerror);
		//-->
	</script>
<%
	} else {
%>
<script>
	alert("수정 성공d");
</script>
<%
		response.sendRedirect("main.jsp");
	}
%>
</body>
</html>