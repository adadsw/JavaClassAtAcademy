<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>title</title>
</head>
<body>
	<form action="el_3.jsp" method="post">아이디 : <input type="text" name="id"><br><br> 애완 동물을 선택하세요. <br><br>
	개 <input type="checkbox" name="animal" value="개"> 고양이 <input type="checkbox" name="animal" value="고양이"> 금붕어<input type="checkbox" name="animal" value="금붕어"><br><br>
	<input type="submit" value="확인">
	<input type="reset" value="취소">
	</form>
</body>
</html>