<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="student" class="com.javalec.bean.Student" scope="page" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>액션태그를 이용한 객체 생성</title>
</head>
<body>

<%-- 
	1. 자바 빈이란? JAVA언어의 데이터(속성)와 기능(메서드)으로 이루어진 클래스이다.
		jsp 페이지를 만들고, 액션태그를 이용하여 빈을 사용하며, 빈의 내부 데이터를 처리한다.
		반복적인 작업을 효율적으로 하기 위해 빈을 사용한다.
	2. 빈 만들기 : getter와 setter를 이용하여 데이터 객체를 만들기 위한 클래스를 만드는 것이다.
	3. 빈 관련 액션태그(useBean, setProperty, getProperty) : 주로 데이터를 업데이트하고, 얻어오는 역할을 한다.
	
		1) <jsp:useBean id="자바빈 이름 즉 참조변수명" class="패키지명.클래스명 scope="범위" />
			Student student = new Student();	//참조변수명 : student ==> useBean id값으로 설정
			
		2) <jsp:setProperty name="자바빈 이름 즉 useBean id" property="속성명" value="값" />
		3) <jsp:getProperty name="자바빈 이름 즉 useBean id" property="속성명" /><br />
 --%>
 
	<jsp:setProperty name="student" property="age" value="13" />
	
	이름 : <jsp:getProperty name="student" property="age" /><br />
	
</body>
</html>