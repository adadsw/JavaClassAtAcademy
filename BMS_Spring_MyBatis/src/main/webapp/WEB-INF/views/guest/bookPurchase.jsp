<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/resources/setting.jsp" %>

<%-- 책 추가 성공 여부 --%>
<c:if test="${purchaseResult != null && purchaseResult == '1'}">
	<script type="text/javascript">
		alert("책 구매 성공");
	</script>
</c:if>
<c:if test="${purchaseResult != null && purchaseResult == '0'}">
	<script type="text/javascript">
		alert("책 구매 실패");
	</script>
</c:if>

<body>
<h2 class="center">책 구매</h2>
<%-- 책이 없는 경우 --%>
<c:if test="${bookList == null}">
구매할 수 있는 책이 없습니다.
</c:if>

<%-- 책 있는 경우 --%>
<c:if test="${bookList != null}">
	<table>
		<tr>
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
					<a href="guestBookPurchaseForm?book_code=${books.book_code}">${books.title}</a>
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
</c:if>
</body>