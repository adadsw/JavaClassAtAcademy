<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="setting.jsp"%>
<script src="${project}script.js"></script>

<h2> 글수정 </h2>

<c:if test="${result == 0}">
	<script type="text/javascript">
		<!--
			alerterror(modifyerror);
		//-->
	</script>
</c:if>
<c:if test="${result != 0}">
	<c:redirect url="list?pageNum=${pageNum}"/>
</c:if>