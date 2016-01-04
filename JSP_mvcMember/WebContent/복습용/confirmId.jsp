<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="setting.jsp"%>
	<h2>중복확인 페이지</h2>
	<!-- id 중복 -->
	<c:if test="${result == 1}">
	<body onload="confirmFocus()">
		<form action="confirmId.do" method="post" name="confirmForm" onsubmit="return confirmCheck()">
			<table>
				<tr>
					<th colspan="2">
						<span>${id}</span>는 사용할 수 없습니다.
					</th>
				<tr>
					<th>아이디 :</th>
					<td>
						<input type="text" class="input" name="id" maxlength="12">
					</td>
				</tr>
				<tr>
					<th colspan="2">
						<input type="submit" class="inputbutton" value="확인">
						<input type="reset" class="inputbutton" value="취소" onclick="self.close()">
					</th>
				</tr>
			</table>
		</form>
	</body>
	</c:if>
	
	<!-- id 중복이 아닌 경우 -->
	<c:if test="${result != 1}">
		<table>
			<tr>
				<td align="center">
					<span>${id}</span>는 사용할 수 있습니다.
				</td>
			</tr>
			<tr>
				<th>
					<input type="button" class="inputbutton" value="확인" onclick="setId('${id}')">
				</th>
			</tr>
		</table>
	</c:if>