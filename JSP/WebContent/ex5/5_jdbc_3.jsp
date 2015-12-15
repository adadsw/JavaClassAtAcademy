<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CREW (회원관리) 테이블 레코드 삽입</title>
</head>
<body>
	<form action="5_jdbc_insert.jsp" method="post">
		<fieldset>
			<legend><b>회원관리</b></legend>
			<table border="1">
				<tr>
					<td>아이디</td>
					<td><input type="text" name="id" size="10"></td>
					<td>암호</td>
					<td><input type="text" name="passwd" size="10"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" size="10"></td>
					<td>이메일</td>
					<td><input type="text" name="email" size="20"></td>
				</tr>
				<tr>
					<td colspan="4">주소<input type="text" name="address" size="50"></td>
				</tr>
				<tr>
					<td colspan="4"><input type="submit" value="삽입"></td>
				</tr>
			</table>
		</fieldset>
	</form>

</body>
</html>