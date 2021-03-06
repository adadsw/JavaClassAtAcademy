<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="setting.jsp" %>
<link type="text/css" rel="stylesheet" href="${project}style.css">
<script src="${project}script.js"></script>
<h2> 글쓰기 </h2>
<body onload="writefocus()">
	<form method="post" action="writePro" name="writeform" onsubmit="return writecheck()">
		<input type="hidden" name="num" value="${num}">
		<input type="hidden" name="ref" value="${ref}">
		<input type="hidden" name="re_step" value="${re_step}">
		<input type="hidden" name="re_level" value="${re_level}">
		
		<table>
			<tr>
				<th colspan="2" align="right">
					<a href="list">글목록</a>
				</th>
			</tr>
			<tr>
				<th> 작성자 </th>
				<td>
					<input class="input" type="text" name="writer" maxlength="20">
				</td>
			</tr>
			<tr>
				<th> 이메일 </th>
				<td>
					<input class="input" type="text" name="email" maxlength="50">
				</td>
			</tr>
			<tr>
				<th> 글제목 </th>
				<td>
					<input class="input" type="text" name="subject" maxlength="50">
				</td>
			</tr>
			<tr>
				<th> 글내용 </th>
				<td>
					<textarea class="input" rows="10" cols="30" name="content"></textarea>
				</td>
			</tr>
			<tr>
				<th> 비밀번호 </th>
				<td>
					<input class="input" type="password" name="passwd" maxlength="20">
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input class="inputbutton" type="submit" value="작성">
					<input class="inputbutton" type="reset" value="취소">
					<input class="inputbutton" type="button" value="목록보기"
						onclick="window.location='list'">
				</th>
			</tr>
		</table>
	</form>
</body>
</html>