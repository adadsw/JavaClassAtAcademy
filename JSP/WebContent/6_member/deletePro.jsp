<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="regBean" class="mvc.member.dao.LogonDBBean" />
<script src="script.js"></script>
<h2>회원탈퇴-처리페이지</h2>
<body>

<%
	request.setCharacterEncoding("utf-8");
	String id = (String) session.getAttribute("memId");
	// out.println((String) request.getSession().getAttribute("memId"));
	String passwd = request.getParameter("passwd");
	// 패스워드가 일치하면 result == 1;
	// 패스워드가 일치하지 않으면 result == -1;
	int resultPasswd = regBean.check(id, passwd);
	request.setAttribute("resultPasswd", resultPasswd);
	
	if (resultPasswd == 1) {
		int result = regBean.deleteMember(id);

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
			response.sendRedirect("main.jsp");
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