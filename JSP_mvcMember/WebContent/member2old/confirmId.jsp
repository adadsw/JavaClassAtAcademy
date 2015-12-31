<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="${project}script.js"></script>
<link type="text/css" rel="stylesheet" href="${project}style.css">

	<h2>중복확인 페이지</h2>
<%!
	String id;
	int result;
%>

<%
	String id = (String) request.getAttribute("id");
	int result = (Integer) request.getAttribute("result");
	/* 	 result가 0일 때 null로 넘어오므로 null을 Integer.parseInt하면
	Exception이 발생하므로, 0일 때만 0으로 초기화 
	if (str != null) {
		int result = Integer.parseInt(str);
	} else {
		int result = 0;
	}*/
	// id 중복
	if (result == 1) {
%>
	<body onload="confirmFocus()">
		<form action="confirmId.do" method="post" name="confirmForm" onsubmit="return confirmCheck()">
			<table>
				<tr>
					<th colspan="2">
						<span><%=id%></span>는 사용할 수 없습니다.
					</th>
				</tr>
				<tr>
					<th>아이디 : </th>
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
<%	
	// id 중복이 아닌 경우
	} else {
%>
	<table>
		<tr>
			<td align="center">
				<span><%=id%></span>는 사용할 수 있습니다.
			</td>
		</tr>
		<tr>
			<th>
				<input type="button" class="inputbutton" value="확인" onclick="setId('<%=id%>')">
			</th>
		</tr>
	</table>
<%	
	}
%>
	
</body>
</html>