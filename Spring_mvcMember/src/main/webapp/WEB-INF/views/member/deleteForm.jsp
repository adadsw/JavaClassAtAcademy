<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="setting.jsp" %>
<script src="${project}script.js"></script>
<link type="text/css" rel="stylesheet" href="${project}style.css">
<h2>회원탈퇴</h2>
<body onload="passwordfocus()">
	<form action="deletePro" method="post" name="passwdform" onsubmit="return passwdCheck()">
		<table>
			<tr>
				<th colspan="2">
					비밀번호를 다시 입력하세요
				</th>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td>
					<input type="password" class="input" name="passwd" maxlength="12">
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" class="inputbutton" value="회원탈퇴">
					<input type="button" class="inputbutton" value="탈퇴취소" onclick="window.location='main'">
				</th>
			</tr>
		</table>
	</form>
</body>
</html>