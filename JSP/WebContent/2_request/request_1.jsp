<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>내장객체 - request 객체</title>
</head>
<body>
	<h3>request란 내장객체로서, 브라우저를 통해 서버에 어떤 정보를 요청하는 것을 말하며, 이러한 정보를 request 객체가 관리한다.</h3>
	<%
		out.println("서버 : " + request.getServerName() + "<br />");
		out.println("포트번호 : " + request.getServerPort() + "<br />");
		out.println("요청방식 : " + request.getMethod() + "<br />");
		out.println("프로토콜 : " + request.getProtocol() + "<br />");
		out.println("URL : " + request.getRequestURL() + "<br />");
		/* URI : 앞의 도메인 주소를 제외한 나머지 값..즉 컨텍스트 패스 이하의 값
		   URI : /JSP/2_request/request_1.jsp*/
		out.println("URI : " + request.getRequestURI() + "<br />");
	%>
</body>
</html>