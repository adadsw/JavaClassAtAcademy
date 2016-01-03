<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/bms/setting.jsp" %>

<%-- 책 추가 성공 여부 --%>
<c:if test="${addBookResult != null && addBookResult == 1}">
	<script type="text/javascript">
		alert("책 추가 성공");
	</script>
</c:if>
<c:if test="${addBookResult != null && addBookResult != 1}">
	<script type="text/javascript">
		alert("책 추가 실패");
	</script>
</c:if>

<%-- 책 삭제 성공 여부 --%>
<c:if test="${deleteBookResult != null && deleteBookResult == ' '}">
	<script type="text/javascript">
		alert("책 삭제 성공");
	</script>
</c:if>
<c:if test="${deleteBookResult != null && deleteBookResult != ' '}">
	<script type="text/javascript">
		alert("책 삭제 실패. 구매 내역 확인 바람.");
	</script>
</c:if>

<%-- 책 수정 성공 여부 --%>
<c:if test="${modifyBookResult != null && modifyBookResult == '1'}">
	<script type="text/javascript">
		alert("책 수정 성공");
	</script>
</c:if>
<c:if test="${modifyBookResult != null && modifyBookResult == '0'}">
	<script type="text/javascript">
		alert("책 수정 실패");
	</script>
</c:if>

<body>
	<h2 class="center">책 목록</h2>

<%-- 책 목록 없는 경우 --%>
<c:if test="${bookList == null}">
책 목록 없음
	<form method="post" action="hostBookDeletePro.do" onsubmit="return bookdeletewarning()">
	<input type="button" value="책 추가" onclick="window.location='hostBookAddForm.do'">
	</form>
</c:if>

<%-- 책 있는 경우 --%>

<c:if test="${bookList != null}">
	<form method="post" action="hostBookDeletePro.do" onsubmit="return bookdeletewarning()">
		<table>
			<tr>
				<td>
				</td>
				<td>
					BookCode
				</td>
				<td>
					Title
				</td>
				<td>
					Writer
				</td>
				<td>
					Price
				</td>
			</tr>
			<c:forEach var="books" items="${bookList}">
				<tr>
					<td>
						<input type="checkbox" name="book_code" value="${books.book_code}">
					</td>
					<td>
						<label for="book_code">${books.book_code}</label>
					</td>
					<td>
						<a href="hostBookModifyForm.do?book_code=${books.book_code}">${books.title}</a>
					</td>
					<td>
						${books.writer_name}
					</td>
					<td>
						${books.price}
					</td>	
				</tr>
			</c:forEach>
		</table>
		<input type="button" value="책 추가" onclick="window.location='hostBookAddForm.do'">
		<input type="submit" value="책 삭제">
		주문된 책 삭제 불가
	</form>
</c:if>
</body>