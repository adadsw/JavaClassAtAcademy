<%@ page language="java" contentType="text/html; charset=euc-kr"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>include ��Ƽ��</title>
</head>
<body>
<%
	int number = 10;
%>

<%@ include file="includee.jspf" %>

���뺯�� DATAFOLDER = "<%= dataFolder %>"

</body>
</html>