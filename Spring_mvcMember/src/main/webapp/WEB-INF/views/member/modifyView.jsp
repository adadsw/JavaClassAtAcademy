<%-- <%@ page import="mvc.member.dto.LogonDataBean"%> --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="setting.jsp" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<h2>회원정보 수정</h2>


	// 아이디와 패스워드가 일치하는 경우 
<c:if test="${result == 1}">
<body onload="modifyFocus()">
	<form method="post" action="modifyPro" name="modifyform" onsubmit="return modifyCheck(this)">
		<input type="hidden" name="tel" value="0">
		<input type="hidden" name="email" value="0">
		<table>
			<tr>
				<th colspan="2">
					수정하실 정보를 입력하세요.
				</th>
			</tr>
			<tr>
				<th>아이디</th>
				<td>
					${dto.id}
				</td>
			</tr>
			<tr>
				<th>*비밀번호</th>
				<td><input type="password" class="input" name="passwd" maxlength="12" value="${dto.passwd}"></td>
			</tr>
			<tr>
				<th>*비밀번호 확인</th>
				<td><input type="password" class="input" name="repasswd" maxlength="12" value="${dto.passwd}"></td>
			</tr>
			<tr>
				<th>*이름</th>
				<td>${dto.name}</td>
			</tr>
			<tr>
				<th>주민등록번호</th>
				<td>${dto.jumin1}-${dto.jumin2}
			</tr>
			<tr>
				<th>전화번호</th>
		<c:if test="${dto.tel == '0'}">
				<td>
					<input type="tel" class="input" name="tel1" maxlength="3" style="width:30px" onkeyup="nexttel1()">
					-<input class="input" type="text" name="tel2" maxlength="4" style="width:40px" onkeyup="nexttel2()">
					-<input class="input" type="text" name="tel3" maxlength="4" style="width:40px" onkeyup="nexttel3()">
				</td>
		</c:if>
		<c:if test="${dto.tel != '0'}">
			<c:set var="tel" value="${fn:split(dto.tel, '-')}"/>
				<td>
					<input type="tel" class="input" name="tel1" maxlength="3" style="width:30px" onkeyup="nexttel1()" value="${tel[0]}">
					-<input class="input" type="text" name="tel2" maxlength="4" style="width:40px" onkeyup="nexttel2()" value="${tel[1]}">
					-<input class="input" type="text" name="tel3" maxlength="4" style="width:40px" onkeyup="nexttel3()" value="${tel[2]}">
				</td>
		</c:if>
			</tr>
			<tr>
				<th>이메일</th>
		<c:if test="${dto.email == '0'}">
				<td><input type="text" class="input" name="email1" maxlength="15" style="width:100px">
					@
					<input type="text" class="input" name="email2" maxlength="15" style="width:100px">
				</td>
		</c:if>
		<c:if test="${dto.email != '0'}">
			<c:set var="email" value="${fn:split(dto.email, '@')}"/>
				<td><input type="text" class="input" name="email1" maxlength="15" style="width:100px" value="${email[0]}">
					@
					<input type="text" class="input" name="email2" maxlength="15" style="width:100px" value="${email[1]}">
				</td>
		</c:if>	
			</tr>
			<tr>
				<th>가입일자</th>
				<td>
					<fmt:formatDate type="both" pattern="yyyy-MM-dd HH:mm" value="${dto.reg_date}"/>
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" class="inputButton" value="수정" onclick="combineEmailTel(form)">
					<input type="reset" class="inputButton" value="리셋">
					<input type="button" class="inputbutton" value="수정취소" onclick="window.location='main'">
				</th>
			</tr>
		</table>
	</form>
</body>
	</c:if>
	<c:if test="${result == -1}">
		<script type="text/javascript">
			<!--
				erroralert(passwderror);
			//-->
		</script>
	</c:if>
</html>