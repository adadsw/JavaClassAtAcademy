<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>익스프레션 언어</title>
</head>
<body>
	<h3>1부터 10까지의 합을 구하는 JSP 페이지</h3>
	<%
		int result = 0;
		for (int i = 1; i < 11; i++) {
		result = result + 1;
		}
		request.setAttribute("result", result);
	%>
	${result}
</body>
</html>