<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="regBean" class="mvc.member.dao.LogonDBBean" scope="page" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>

<%
	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	
	int result = regBean.check(id, passwd);
	
	if(result == 1) {
		//로그인 성공
		request.getSession().setAttribute("memId", id);
		response.sendRedirect("main.jsp");
	} else if(result == -1) {
		// 비밀번호 불일치
		request.setAttribute("result", result);
		response.sendRedirect("loginForm.jsp?result=" + result);
	} else {
		// 아이디가 존재하지 않음 : 0
		request.setAttribute("result", result);
		response.sendRedirect("loginForm.jsp?result=" + result);
	}
%>

</body>
</html>