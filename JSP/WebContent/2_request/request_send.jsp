<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 
	response 객체 : 웹브라우저의 요청에 응답하는 것을 response라고 하며, 
	이러한 응답(response)의 정보를 가지고 있는 객체를 response 객체라고 한다.
	request 객체관련 메서드 : 
		- getCharacterEncoding : 응답할 때 문자의 인코딩 형태를 구한다.
		- addCookie(Cookie) : 쿠키를 지정한다.
		- snedRedirect(URL) : 지정한 URL로 이동한다.
 -->
<%!
	int age;
%>
<%
	age = Integer.parseInt(request.getParameter("age"));
	if (age > 19) {
		response.sendRedirect("pass.jsp?age=" + age);		
	} else {
		response.sendRedirect("ng.jsp?age=" + age);
	}
%>

</body>
</html>