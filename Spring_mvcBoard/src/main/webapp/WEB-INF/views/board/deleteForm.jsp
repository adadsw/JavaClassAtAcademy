<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="setting.jsp" %>
<link type="text/css" rel="stylesheet" href="${project}style.css">
<script src="${project}script.js"></script>

<body onload="passwdfocus()">
	<form method="post" action="deletePro" name="passwdform" 
		onsubmit="return passwdcheck()">
		
		<input type="hidden" name="num" value="${num}">
		<input type="hidden" name="pageNum" value="${pageNum}">
		
		<table>
			<tr>
				<th colspan="2">
					비밀번호를 다시 확인해주세요.
				</th>
			</tr>
			<tr>
				<th> 비밀번호 </th>
				<td>
					<input class="input" type="password" name="passwd" maxlength="20">
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input class="inputbutton" type="submit" value="글삭제">
					<input class="inputbutton" type="button" value="삭제취소"
						onclick="window.location='list?pageNum=${pageNum}'">
				</th>
			</tr>
		</table>
	</form>
</body>
