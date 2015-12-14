<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! String name, address;
	String[] pets;%>
<%
	request.setCharacterEncoding("UTF-8");
	name = request.getParameter("name");
	address = request.getParameter("address");
	pets = request.getParameterValues("pet");
%>
이름 : <%=name %><br/>
주소 : <%=address%><br/>
좋아하는 동물 : <%=Arrays.toString(pets)%><br/>
</body>
</html>