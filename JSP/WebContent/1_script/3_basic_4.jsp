<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>구구단</title>
<style>
	table, td {
		border: 1px solid;
	}
</style>
</head>
<body>
	<table>
<%for (int i = 2; i < 10; i++) {%>
		<tr>
			<td><%=i %>단 입니다.</td>
		</tr>
		
		
		<%for (int j = 1; j < 10; j++) {%>
				<tr><td><%=i%>X<%=j%> = <%= i * j %></td></tr>
		<%}%>
<%}%>
	</table>
</body>
</html>