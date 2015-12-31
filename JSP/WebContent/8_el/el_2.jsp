<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	 <%-- 익스프레션 언어의 내장 객체
		. param : 웹브라우저에서 <FORM> 엘리먼트를 통해 입력된 데이터를 가져올 때 사용하는 내장객체이다.
		. 사용방법
			1) param 뒤에 마침표를 찍고 해당 데이터 이름을 쓰는 방법 : 예 ${param.NUM}
			2) param 뒤에 대괄호를 치고, 그 안에 작은 따옴표나 큰 따옴표로 묶은 데이터 이름을 쓰는 방법 : 예 ${param["COLOR"]}
			3) paramValues : <FORM> 엘리먼트를 통해 똑같은 이름의 데이터가 여러개 입력되는 경우 
			   ${paramValues.COLOR[인덱스]} --%>
	
	
	<form action="el_3.jsp" method="post">
		아이디 : <input type="text" name="id"><br><br>
		애완 동물을 선택하세요.<br><br>
		개 <input type="checkbox" name="animal" value="개">
		고양이 <input type="checkbox" name="animal" value="고양이">
		금붕어 <input type="checkbox" name="animal" value="금붕어"><br><br>
		
		<input type="submit" value="확인">
		<input type="reset" value="취소">
	</form>
</body>
</html>