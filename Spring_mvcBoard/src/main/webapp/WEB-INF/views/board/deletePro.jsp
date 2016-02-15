<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="setting.jsp" %>
<script src="${project}script.js"></script>

<h2>글삭제 - 처리페이지</h2>

	<!-- 비밀번호가 다른 경우 -->
<c:if test="${resultPasswd == 0}">
	<script type="text/javascript">
	<!--
		erroralert(passwderror);
	//-->
	</script>
	<meta http-equiv="refresh" content="0; url='list?pageNum=${pageNum}'">
</c:if>

<c:if test="${resultPasswd != 0}">
	<!-- 삭제 실패 - 답글이 있는 경우 삭제 안 함 -->
	<c:if test="${result == -1}">
		<script type="text/javascript">
		<!--
		erroralert(deletereplyerror);
		//-->
		</script>
		<meta http-equiv="refresh" content="0; url='list?pageNum=${pageNum}'">
	</c:if>
	
	<!-- 삭제 실패 - 단순 delete error -->
	<c:if test="${result == 0}">
		<script type="text/javascript">
		<!--
		erroralert(deleteerror);
		//-->
		</script>
		<meta http-equiv="refresh" content="0; url='list?pageNum=${pageNum}'">
	</c:if>
	
	<!-- 삭제 성공 -->
	<c:if test="${result == 1}">
		<c:redirect url="list"/>
	</c:if>
</c:if>
