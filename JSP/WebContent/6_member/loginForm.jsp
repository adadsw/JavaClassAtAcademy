<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="regBean" class="mvc.member.dao.LogonDBBean" />
<script src="script.js"></script>
<link type="text/css" rel="stylesheet" href="style.css">

<body onload="mainfocus()">
	<h2>로그인</h2>
<%!
	int result;
%>	

<%
	String str = request.getParameter("result");
	result = Integer.parseInt(str);
%>
	<form action="loginPro.jsp" method="post" name="mainform" onsubmit="return mainCheck()">
		<table>
			<tr>
				<th colspan="2">
					<%
						if (result == -1) {
							out.println("비밀번호가 다릅니다. 다시 확인하세요.");
						} else if (result == 0) {
							out.println("아이디가 없습니다. 다시 확인하세요.");
						} else if (result == 1) {
							out.println("회원가입을 축하드립니다. 로그인하세요.");
						}
					%>
				</th>
			</tr>
			<tr>
				<th>아이디</th>
				<td>
					<input type="text" class="input" name="id" maxlength="12">
				</td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="password" class="input" name="passwd" maxlength="12">
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" class="inputbutton" value="로그인">
					<input type="reset" class="inputbutton" value="취소">
					<input type="button" class="inputbutton" value="회원가입" onclick="window.location='inputForm.jsp'">
				</th>
			</tr>
		</table>
	</form>
</body>
</html>