<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>익스프레션 언어</title>
</head>
<body>

<%-- . 익스프레션 언어란 식(expression)을 중심으로 코드를 기술하는 언어이다.
	. 연산자와 피연산자의 조합을 ${와 }로 둘러싸서 표현한다...${} ...<%= %>
	. ${cnt + 1}와 <%= cnt+1 %>은 동일
	. ${cnt + 1}  .. cnt는 attribute name이며, setAttribute, removeAttribute 메서드를 통해 저장되고 관리되는 데이터를 의미한다.
	. 예) ${result}
	. <%= cnt+1 %>.. cnt는 변수
  --%>
  
  <h3> 1부터 10까지의 합을 구하는 JSP 페이지</h3>
  
  <%
  	int result = 0;
  	for (int i = 1; i < 11; i++) {
  		result = result + i;
  	}
  	request.setAttribute("result", result);
  %>
  ${result}
</body>
</html>