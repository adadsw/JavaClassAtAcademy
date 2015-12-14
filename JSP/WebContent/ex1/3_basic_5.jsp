<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>표현식 활용</title>
</head>
<body>
	<%
		java.util.Date date = new java.util.Date();
		int hour = date.getHours();
		int one = 10;
		int two = 12;
		
		String now = hour < 12 ? "오전" : "오후";
	%>
	<%!
		public int operation(int i, int j) {
		return (i > j) ? i : j;
		}
	%>
	지금은 오전일까요, 오후일까요? <%= now %>
	one과 two 둘 중 큰 수는? <%=operation(one,two) %>
</body>
</html>