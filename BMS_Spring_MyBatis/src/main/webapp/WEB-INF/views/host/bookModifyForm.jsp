<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/resources/setting.jsp" %>
<script src="http://code.jquery.com/jquery-latest.js" type="text/javascript"></script>
<script type="text/javascript">
	$(function() {
		$('#modifyButton').click(function() {
			$('#modifyButton').replaceWith('<input id="modifyButton" type="submit" value="확인">');
			$('input[name="title"]').replaceWith('<input type="text" name="title" value="${book.title}" maxlength="50">');
			$('input[name="writer_name"]').replaceWith('<input type="text" name="writer_name" value="${book.writer_name}" maxlength="20">');
			$('input[name="price"]').replaceWith('<input type="number" name="price" value="${book.price}" min="0" max="99999" step="5">');
			$('legend').replaceWith('<legend>수정할 내용 입력</legend>')
		});
	});
</script>
<body>
<form action="hostBookModifyPro" method="post">
	<input type="hidden" name="book_code" value="${book.book_code}">
	<fieldset>
	<legend>책 정보</legend>
		<table>
			<tr>
				<th>서명</th>
				<td><input type="text" name="title" value="${book.title}" readonly></td>
			</tr>
			<tr>
				<th>저자</th>
				<td><input type="text" name="writer_name" value="${book.writer_name}" readonly></td>
			</tr>
			<tr>
				<th>가격</th>
				<td><input type="number" name="price" value="${book.price}" style="width:83px" readonly></td>
			</tr>
			<tr>
				<th><input id="modifyButton" type="button" value="수정"></th>
			</tr>
			<tr>
				<th><input type="button" value="목록" onclick="window.location='hostBookManagement'"></th>
			</tr>
		</table>
	</fieldset>
</form>
</body>
