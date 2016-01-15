<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="setting.jsp" %>
<body onload="passwordfocus()">
	<form action="memberModifyView.do" method="post" name="passwdform" onsubmit="return passwdCheck()">
		<table>
			<tr>
				<th colspan="2">
					비밀번호를 다시 입력하세요.
				</th>
			</tr>
			<tr>
				<th> 비밀번호 </th>
				<td>
					<input class="input" type="password" name="passwd" maxlength="12">
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input class="inputbutton" type="submit" value="정보수정">
					<input class="inputbutton" type="button" value="수정취소" onclick="window.location='main.do'">
				</th>
			</tr>
		</table>
	</form>

</body>
</html>