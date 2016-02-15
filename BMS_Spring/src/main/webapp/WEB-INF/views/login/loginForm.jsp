<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/resources/setting.jsp" %>
<title>login</title>
<body class="body" onload="loginfocus()">
	<form class="loginForm" action="loginPro" method="post" name="loginform">
		<fieldset>
			<legend>로그인</legend>
			<table class="medium">
				<tr>
					<th>아이디</th>
					<td><input type="text" name="user_id" maxlength="10"></td>
				</tr>
				<tr>
					<th>암호</th>
					<td><input type="password" name="pw" maxlength="10"></td>
				</tr>
				<tr>
					<th><input type="submit" value="로그인"></th>
				</tr>
			</table>
		</fieldset>
	</form>
</body>