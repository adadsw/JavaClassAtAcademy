<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="/bms/setting.jsp" %>
<body>

<h2 class="center">주문목록</h2>

<%-- 주문 목록 없는 경우 --%>
<c:if test="${orderListResult == 0}">
주문 내역이 없습니다.
</c:if>

<%-- 주문 목록 있는 경우--%>
<c:if test="${orderList != null}">
	<table>
		<tr>
			<td>
				Order_Code
			</td>
			<td>
				User_Id
			</td>
			<td>
				Book_Code
			</td>
			<td>
				Order_Date
			</td>
		</tr>
		<c:forEach var="orders" items="${orderList}">
			<tr>
				<td>
					${orders.order_code}
				</td>
				<td>
					${orders.user_id}
				</td>
				<td>
					${orders.book_code}
				</td>
				<td>
					${orders.order_date}
				</td>	
			</tr>
		</c:forEach>
	</table>
</c:if>
</body>