<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="setting.jsp" %>    
<script src="${project}script.js"></script>
<h2>회원탈퇴-처리페이지</h2>
<body>
	<c:if test="${resultPasswd == 1}">
		<c:if test="${result == 0}">
			<script type="text/javascript">
			<!--
				erroralert(deleteerror);	
			//-->
			</script>
		</c:if>
		<c:if test="${result != 0}">		
			<% 
			session.removeAttribute("memId");
			// session.setAttribute("memId", null);
			%>
			<c:redirect url="main"/>
		</c:if>
	</c:if>
	<c:if test="${resultPasswd != 1}">
		<script type="text/javascript">
			<!--
				erroralert(passwderror);
			//-->
		</script>
	</c:if>
</body>
</html>