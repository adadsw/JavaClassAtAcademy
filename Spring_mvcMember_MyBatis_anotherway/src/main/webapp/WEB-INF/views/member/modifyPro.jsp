<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="setting.jsp" %>
<h2>회원정보수정 - 처리페이지</h2>
<body>
	<c:if test="${result == 0}">
		<script type="text/javascript">
			<!--
			erroralert(modifyerror);
			//-->
		</script>
	</c:if>
	<c:if test="${result != 0}">
		<c:redirect url="main"/>
	</c:if>
</body>
</html>