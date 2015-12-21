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
/* 	String email1 = request.getParameter("email1");
	String email2 = request.getParameter("email2");
	String tel1 = request.getParameter("tel1");
	String tel2 = request.getParameter("tel2");
	String tel3 = request.getParameter("tel3");
	
	String email = null;
	if(!email1.equals("") && !email2.equals("")) {
		email = email1 + "@" + email2;
	}
	
	String tel = null;
	if (!tel1.equals("") && !tel2.equals("") && !tel3.equals("")) {
		tel = tel1 + tel2 + tel2;
	}
	
	dto.setEmail(email);
	dto.setTel(tel);
	 */
	 
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