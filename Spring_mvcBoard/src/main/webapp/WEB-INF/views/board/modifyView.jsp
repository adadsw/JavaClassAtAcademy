<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="setting.jsp" %>
<link type="text/css" rel="stylesheet" href="${project}style.css">
<script src="${project}script.js"></script>

<h2> 글 수정 </h2>

<c:if test="${result == 0}">
	<script type="text/javascript">
	<!--
	erroralert(passwderror);
	//-->
	</script>
</c:if>

<c:if test="${result != 0}">
	<body onload="modifyfocus()">
		<form method="post" action="modifyPro" name="modifyform"
			onsubmit="return modifycheck()">
			<input type="hidden" name="num" value="${num}">
			<input type="hidden" name="pageNum" value="${pageNum}">

			<table>
				<tr>
					<th colspan="2">
						수정할 정보를 입력하세요.
					</th>
				</tr>
				<tr>
					<th> 작성자 </th>
					<td> ${dto.writer} </td>
				</tr>
				<tr>
					<th> 이메일 </th>
					<td>
						<c:if test="${dto.email == null}">
							<input class="input" type="text" name="email" maxlength="30">
						</c:if>
						<c:if test="${dto.email != null}">
							<input class="input" type="text" name="email" maxlength="30" value="${dto.email}">
						</c:if>
					</td>
				</tr>
				<tr>
					<th> 글제목 </th>
					<td> 
						<input class="input" type="text" name="subject" maxlength="50" value="${dto.subject}"> 
					</td>
				</tr>
				<tr>
					<th> 글내용 </th>
					<td>
						<textarea class="input" rows="10" cols="32" name="content">${dto.content}</textarea>
					</td>
				</tr>
				<tr>
					<th> 비밀번호 </th>
					<td>
						<input class="input" type="password" name="passwd" maxlength="20" value="${dto.passwd}">
					</td>
				</tr>
				<tr>
					<th colspan="2">
						<input class="inputbutton" type="submit" value="글수정">
						<input class="inputbutton" type="reset" value="취소">
						<input class="inputbutton" type="button" value="목록보기"
							onclick="window.location='list?pageNum=${pageNum}'">
					</th>
				</tr>
			</table>
		</form>
	</body>
</c:if>