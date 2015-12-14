<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>request 객체 - Paprameter 메서드</title>
</head>
<body>
	<h3>Parameter 메서드는 JSP페이지의 데이터 값을 전송하기 위해 사용</h3>
	.getParameter(String name) : name에 해당하는 파라미터 값을 구함. <br />
	.getParameterNames() : 모든 파라미터 이름을 구함. <br />
	.getParameterValues(String name) : name에 해당하는 파라미터 값들을 String 배열로 가져온다.<br/><br/>
	<pre>
	input type이 'submit'인 버튼을 클릭 시 form 태그의 method 방식은 get방식과 post방식이 있다.
	.get 방식 : 요청 url(form action명)의 뒷부분에 물음표(?)와 함께 파라미터를 붙여서 전송<br/>
				?이름1=값1&이름2=값2&이름3=값3&...<br/>
	.post 방식 : 요청 url(form action명)에 파라미터를 붙이지 않고 전송<br/><br/>
	</pre>
	<form action="requestParam.jsp" method="get">
		이름 : <input type="text" name="name" size="10"><br />
		아이디 : <input type="text" name="id" size="10"><br />
		비밀번호 : <input type="password" name="pwd" size="10"><br />
		취미 : <input type="checkbox" name="hobby" value="read">독서
		<input type="checkbox" name="hobby" value="cook">요리
		<input type="checkbox" name="hobby" value="jog">조깅
		<input type="checkbox" name="hobby" value="swimming">수영
		<input type="checkbox" name="hobby" value="sleeping">잠자기<br/>
		전공 : <input type="radio" name="major" value="kor">국어
		<input type="radio" name="major" value="eng">영어
		<input type="radio" name="major" value="math">수학
		<input type="radio" name="major" value="design">디자인<br/>
		<select name="protocol" id="">
			<option value="http">http</option>
			<option value="ftp">ftp</option>
			<option value="smtp">smtp</option>
			<option value="pop">pop</option>
		</select><br/>
		<input type="submit" value="전송">
		<input type="reset" value="초기화">
	</form>
	
</body>
</html>