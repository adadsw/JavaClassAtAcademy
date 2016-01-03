<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/bms/setting.jsp" %>
<body>
<form action="guestBookPurchasePro.do" method="post">
	<input type="hidden" name="book_code" value="${book.book_code}">
	<fieldset class="bookinfotable">
	<legend>책 정보</legend>
		<table>
			<tr>
				<td>서명</td>
				<td>${book.title}</td>
			</tr>
			<tr>
				<td>저자</td>
				<td>${book.writer_name}</td>
			</tr>
			<tr>
				<td>가격</td>
				<td>${book.price}</td>
			</tr>
			<tr>
				<td><input type="submit" value="구매"></td>
			</tr>
			<tr>
				<td><input type="button" value="목록" onclick="window.location='guestBookPurchase.do'"></td>
			</tr>
		</table>
	</fieldset>
</form>
</body>