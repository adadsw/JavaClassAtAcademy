<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/bms/setting.jsp" %>
<title>login</title>
<body onload="loginfocus()">
	<form class="loginForm" action="loginPro.do" method="post" name="loginform">
		<fieldset>
			<legend>�α���</legend>
			<table>
				<tr>
					<th>���̵�</th>
					<td><input type="text" name="user_id" maxlength="10"></td>
				</tr>
				<tr>
					<th>��ȣ</th>
					<td><input type="password" name="pw" maxlength="10"></td>
				</tr>
				<tr>
					<th><input type="submit" value="�α���"></th>
				</tr>
			</table>
		</fieldset>
	</form>
</body>