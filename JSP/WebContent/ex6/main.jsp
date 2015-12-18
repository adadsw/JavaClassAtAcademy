<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="script.js"></script>
<link type="text/css" rel="stylesheet" href="style.css">
<body>
<h2>메인 페이지</h2>
	<form method="post" action="loginPro.jsp" name="mainform" onsubmit="return maincheck()">
		<table>
			<tr>
				<th>아이디</th>
				<td><input class="input" type="text" name="id" maxlength="12"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><input type="password" class="input" name="passwd" maxlength="10"></td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" class="inputButton" value="로그인">
					<input type="reset" class="inputButton" value="취소">
					<input type="button" class="inputButton" value="회원가입" onclick="window.location='
					inputForm.jsp'">
				</th>
			</tr>
			
		
		</table>
	</form>
	
</body>
</html>