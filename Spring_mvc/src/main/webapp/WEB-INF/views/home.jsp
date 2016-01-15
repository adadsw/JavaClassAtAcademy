<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<!-- com.javalec.ex 패키지 중 세 번째 ex가 context name이다. 
	Server.xml의 path명	예)<Context docBase="Spring_mvc" path="/ex">
	/context name/resources/...
	실행 : http://localhost:8081/ex/
	-->
<img src="./resources/images/image001.gif">
<img src="./resources/images/image001.gif">
</body>
</html>