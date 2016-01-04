<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
</head>
<body>
<%
	List<String> items = new ArrayList<String>();
	items.add("딸기");
	items.add("오렌지");
	items.add("복숭아");

	request.setAttribute("fruits", items);
	RequestDispatcher dispatcher = request.getRequestDispatcher("el_5.jsp");
	dispatcher.forward(request, response);
%>
	
</body>
</html>