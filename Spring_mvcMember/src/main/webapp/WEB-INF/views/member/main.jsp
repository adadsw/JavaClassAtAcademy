<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="setting.jsp" %>

<h2>메인 페이지</h2>
<!-- 
	세션은 최초 요청시 생성되며, 이후로는 이미 생성된 세션이 사용된다.
	세션은 사용자의 브라우저와 서버간의 논리적 연결.. 즉 서버가 자신에게 접속한
	클라이언트의 정보를 갖고 있는 상태.. 예) 장바구니 정보
 -->

<c:if test="${sessionScope.memId == null}">
	<body onload="mainfocus()">
		<form method="post" action="loginPro" name="mainform" onsubmit="return maincheck()">
			<table>
				<tr>
					<th>아이디</th>
					<td><input class="input" type="text" name="id" maxlength="12"></td>
				</tr>
				<tr>
					<th>비밀번호</th>
					<td><input class="input" type="password" name="passwd" maxlength="10"></td>
				</tr>
				<tr>
					<th colspan="2">
						<input type="submit" class="inputButton" value="로그인">
						<input type="reset" class="inputButton" value="취소">
						<input type="button" class="inputButton" value="회원가입" onclick="window.location='inputForm'">
					</th>
				</tr>
			</table>
		</form>
	</body>
</c:if>
<c:if test="${sessionScope.memId != null}">
	<body>
		<table>
			<tr>
				<td align="center" style="width: 300px">
					<span>${sessionScope.memId}</span>님 안녕하세요.
				</td>
			</tr>
			<tr>
				<th>
					<input type="button" class="inputbutton" value="정보수정" onclick="window.location='modifyForm'">
					<input type="button" class="inputbutton" value="회원탈퇴" onclick="window.location='deleteForm'">
					<input type="button" class="inputbutton" value="로그아웃" onclick="window.location='logout'">
				</th>
			</tr>
		</table>
	</body>
</c:if>
</html>