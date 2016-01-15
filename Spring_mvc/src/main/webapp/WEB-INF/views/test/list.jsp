<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post">
	<input type="text" name="Num">
	<input type="text" name="id">
	<input type="text" name="title">
	<input type="text" name="content">
	<input type="text" name="email">
	<input type="submit" value="전송">
</form>
글번호 : ${Num} <br>
아이디 : ${id} <br>
글제목 : ${title} <br>
글내용 : ${content} <br>
이메일 : ${email} <br>
</body>
</html>