<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/bms/setting.jsp" %>
<body>

<h2 class="center">�ֹ� ���</h2>

<%-- �ֹ��� ���� ��� --%>
<c:if test="${orderListResult == 0}">
å�� �����ϴ�.
</c:if>

<%-- �ֹ��� �ִ� ��� --%>
<c:if test="${orderList != null}">
	<table>
		<tr>
			<td>
			</td>
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
					<input type="checkbox" name="book_code" value="${orders.order_code}">
				</td>
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