<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/bms/setting.jsp" %>

<%-- å �߰� ���� ���� ���� --%>
<c:if test="${addBookResult != null && addBookResult == 1}">
	<script type="text/javascript">
		alert("å �߰� ����");
	</script>
</c:if>
<c:if test="${addBookResult != null && addBookResult != 1}">
	<script type="text/javascript">
		alert("å �߰� ����");
	</script>
</c:if>


<body>

<h2 class="center">å ���</h2>

<%-- å�忡 å ���� ��� --%>
<c:if test="${bookListResult == 0}">
å�� �����ϴ�.
</c:if>

<%-- å�忡 å �ִ� ��� --%>
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
	<input type="button" value="å�߰�" onclick="window.location='hostBookAddForm.do'">
	<input type="button" value="å����" onclick="window.location='hostBookDeletePro.do'">
	�ֹ��� å ���� �Ұ�	
</c:if>
</body>