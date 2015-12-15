<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="com.javalec.bean.Member" scope="page" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0property Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:setProperty name="member" property="id" value="아이디" />
id : <jsp:getProperty name="member" property="id" /><br />
<jsp:setProperty name="member" property="passwd" value="ThisIsPasswd"/>
passwd : <jsp:getProperty name="member" property="passwd"/><br />
<jsp:setProperty name="member" property="name" value="Your property"/>
name :  <jsp:getProperty name="member" property="name"/><br />
<jsp:setProperty name="member" property="email" value="abc@abc.com"/>
email : <jsp:getProperty name="member" property="email"/><br />
<jsp:setProperty name="member" property="address" value="주소입니당"/>
address : <jsp:getProperty name="member" property="address"/><br />
</body>
</html>