<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="student" class="com.javalec.bean.Student" scope="page" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>액션 태그를 이용한 객체 생성</title>
</head>
<body>

	<jsp:setProperty property="name" name="student" value="강철중"/>
	이름 : <jsp:getProperty property="name" name="student"/> <br/>
	<jsp:setProperty property="age" name="student" value="38" />
	나이 : <jsp:getProperty property="age" name="student"/>
	<jsp:setProperty property="grade" name="student" value="0" />
	학년 : <jsp:getProperty property="grade" name="student" />
</body>
</html>