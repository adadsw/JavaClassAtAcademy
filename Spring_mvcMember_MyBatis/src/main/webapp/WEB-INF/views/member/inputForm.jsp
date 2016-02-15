<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="setting.jsp" %>    
<script src="${project}script.js"></script>
<link type="text/css" rel="stylesheet" href="${project}style.css">
<h2>회원가입</h2>
<body onload="inputfocus()">
	<form method="post" action="inputPro" name="inputform" onsubmit="return inputCheck(this)">
		<input type="hidden" name="confirmid" value="2">
		<input type="hidden" name="tel" value="0">
		<input type="hidden" name="email" value="0">
		<table>
			<tr>
				<th colspan="2">회원정보를 입력하세요.</th>
			</tr>
			<tr>
				<th>* 아이디</th>
				<td>
					<input type="text" class="input" name="id" maxlength="12">
					<input type="button" class="inputbutton" value="중복확인" onclick="confirmId()">
				</td>
			</tr>
			<tr>
				<th>* 비밀번호</th>
				<td><input type="password" class="input" name="passwd" maxlength="12"></td>
			</tr>
			<tr>
				<th>* 비밀번호 재입력</th>
				<td><input type="password" class="input" name="repasswd" maxlength="12"></td>
			</tr>
			<tr>
				<th>* 이름</th>
				<td><input type="text" class="input" name="name" maxlength="12"></td>
			</tr>
			<tr>
				<th>* 주민등록번호</th>
				<td><input type="text" class="input" name="jumin1" maxlength="6" style="width:50px" onkeyup="nextjumin1()">
				<input class="input" name="jumin2" maxlength="7" style="width:60px" onkeyup="nextjumin2()"></td>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="tel" class="input" name="tel1" maxlength="3" style="width:30px" onkeyup="nexttel1()">-<input class="input" type="text" name="tel2" maxlength="4" style="width:40px" onkeyup="nexttel2()">-<input class="input" type="text" name="tel3" maxlength="4" style="width:40px" onkeyup="nexttel3()"></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="text" class="input" name="email1" maxlength="15" style="width:100px">
					@
					<select name="email2" class="input">
						<option value="directInsert">직접입력</option>
						<option value="naver.com">네이버</option>
						<option value="daum.net">다음</option>
						<option value="nate.com">네이트</option>
						<option value="gmail.com">구글</option>
					</select>
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" class="inputButton" value="회원가입" onclick="combineEmailTel(form)">
					<input type="reset" class="inputButton" value="리셋">
					<input type="button" class="inputbutton" value="가입취소" onclick="window.location='main'">
				</th>
			</tr>
		</table>
	</form>
</body>
</html>