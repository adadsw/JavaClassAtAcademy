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
<%!
	String name, id, pwd, major, protocol;
	String[] hobbies;
%>
<%
	request.setCharacterEncoding("UTF-8");
	name = request.getParameter("name");
	id = request.getParameter("id");
	pwd = request.getParameter("pwd");
	hobbies = request.getParameterValues("hobby");
	major = request.getParameter("major");
	protocol = request.getParameter("protocol");
%>

	이름 : <%=name %><br/>
	id : <%=id %><br/>
	pwd : <%=pwd %><br/>
	취미 : <%=Arrays.toString(hobbies)%><br/>
	major : <%=major %><br/>
	protocol : <%=protocol %><br/>

</body>
</html>