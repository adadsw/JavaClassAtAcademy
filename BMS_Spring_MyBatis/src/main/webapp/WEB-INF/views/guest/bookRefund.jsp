<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ include file="/resources/setting.jsp" %>

<%-- 책 환불 성공 여부 --%>
<c:if test="${refundBookResult != null && refundBookResult == ' '}">
	<script type="text/javascript">
		alert("책 환불 성공");
	</script>
</c:if>
<c:if test="${refundBookResult != null && refundBookResult != ' '}">
	<script type="text/javascript">
		alert("책 환불 실패. 왠지는 나도 모름");
	</script>
</c:if>

<body>
<h2 class="center">책 환불</h2>
<%-- 주문 목록 없는 경우 --%>
<c:if test="${orderList == null}">
구매하신 책이 없습니다.
</c:if>

<%-- 주문 목록 있는 경우 --%>
<c:if test="${orderList != null}">
<form method="post" action="guestRefundPro" onsubmit="return bookrefundwarning()">
	<table>
		<tr>
			<td>
			</td>
			<td>
				서명
			</td>
			<td>
				저자
			</td>
			<td>
				주문날짜
			</td>
		</tr>
		<c:forEach var="orders" items="${orderList}">
			<tr>
				<td>
					<input type="checkbox" name="order_code" value="${orders.order_code}">
				</td>
				<td>
					${orders.title}
				</td>
				<td>
					${orders.writer_name}
				</td>
				<td>
					<fmt:formatDate type="both" pattern="yyyy-MM-dd HH:mm" value="${orders.order_date}"/>
				</td>	
			</tr>
		</c:forEach>
	</table>
	<input type="submit" value="환불">
</form>
</c:if>
</body>