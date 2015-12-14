<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	table, td {
		border: 1px solid;
	}
</style>
</head>
<body>
	<%
		String[] fruits = { "사과", "배", "토마토", "수박", "딸기", "귤", "홍시", "파인애플", "바나나", "키위" };
	%>
	<table>
		<%
			for (int i = 0; i < fruits.length; i++)	{
		%>
		<tr>
			<td><%=i+1%></td>
			<td><%=fruits[i]%></td>
		</tr>
		<%
			}
		%>
	</table>

</body>
</html>