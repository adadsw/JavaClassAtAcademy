<%@page import="java.sql.Timestamp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="regBean" class="mvc.member.dao.LogonDBBean" />
<jsp:useBean id="dto" class="mvc.member.dto.LogonDataBean"/>
<jsp:setProperty name="dto" property="*" />

<script src="script.js"></script>

<body>
	<h2>회원가입 - 처리페이지</h2>
	
<%
	request.setCharacterEncoding("UTF-8");
	 
	 //reg_date
	dto.setReg_date(new Timestamp(System.currentTimeMillis()));
	 
	int result = regBean.insert(dto);
	request.setAttribute("result", result);
	 
	if (result == 0) { 
%>
	<script type="text/javascript">
		erroralert(inputerror);
	</script>
<%	 
	} else {
		response.sendRedirect("loginForm.jsp?result=" + result);	
	}
%>
	
</body>
</html>