<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="setting.jsp" %>
<script src="${project}script.js"></script>

<h2>글쓰기 - 처리 페이지</h2>

<c:if test="${result == 0}">
	<script type="text/javascript">
	<!--
	erroralert(inserterror);
	//-->
	</script>
</c:if>

<c:if test="${result != 0}">
	<!-- 작성 성공 -->
	<c:redirect url="list"/>
</c:if>