<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/bms/setting.jsp" %>

<%-- 책 추가 성공 실패 여부 --%>
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


<body>

<h2 class="center">책 목록</h2>

<%-- 책장에 책 없는 경우 --%>
<c:if test="${bookListResult == 0}">
책이 없습니다.
</c:if>

<%-- 책장에 책 있는 경우 --%>
<c:if test="${bookList != null}">
	<table>
		<tr>
			<td>
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
					${books.title}
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
	<input type="button" value="책추가" onclick="window.location='hostBookAddForm.do'">
	<input type="button" value="책삭제" onclick="window.location='hostBookDeletePro.do'">
	주문된 책 삭제 불가	
</c:if>
</body>