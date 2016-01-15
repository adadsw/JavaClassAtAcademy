<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 컨트롤러에서 model.addAttribute("id", "psn"); 지정할 경우
	 컨트롤러에서 넘겨준 Model 객체를 꺼내서 el태그로 표현함.
	 즉 컨트롤러에서 전달 받은 Model 객체의 속성을 이용함
	
 -->
	test/content.jsp입니다. <br />
	id : ${param} <br/>
	password : ${password} <br/>
	이름 : ${name} <br/>
	나이 : ${age} <br/>
	직업 : ${occupation} <br/>
</body>
</html>