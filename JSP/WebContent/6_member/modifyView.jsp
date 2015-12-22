<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="regBean" class="mvc.member.dao.LogonDBBean" />
<jsp:useBean id="dto" class="mvc.member.dto.LogonDataBean"/>
<script src="script.js"></script>
<link type="text/css" rel="stylesheet" href="style.css">
<h2>회원정보 수정</h2>

<%
	String id = (String) session.getAttribute("memId");
	String passwd = request.getParameter("passwd");
	
	int result = regBean.check(id, passwd);
	request.setAttribute("result", result);
	// 아이디와 패스워드가 일치하는 경우 
	if (result == 1) {
		dto = regBean.getMember(id);
		request.setAttribute("dto", dto);
		String telTemp = dto.getTel();
		String[] tel = telTemp.split("-");
%>
<body>
	<form method="post" action="" name="inputform" onsubmit="return ">
		<table>
			<tr>
				<th colspan="2">
					수정하실 정보를 입력하세요.
				</th>
			</tr>
			<tr>
				<th>아이디</th>
				<td>
					<%=dto.getId()%>
				</td>
			</tr>
			<tr>
				<th>*비밀번호</th>
				<td><input type="password" class="input" name="passwd" maxlength="12"></td>
			</tr>
			<tr>
				<th>*비밀번호 확인</th>
				<td><input type="password" class="input" name="repasswd" maxlength="12"></td>
			</tr>
			<tr>
				<th>*이름</th>
				<td><%=dto.getName()%></td>
			</tr>
			<tr>
				<th>주민등록번호</th>
				<td><%=dto.getJumin1() + "-" + dto.getJumin2() %>
			</tr>
			<tr>
				<th>전화번호</th>
				<td><input type="tel" class="input" name="tel1" maxlength="3" style="width:30px" onkeyup="nexttel1()" value="<%=tel[0]%>">-<input class="input" type="text" name="tel2" maxlength="4" style="width:40px" onkeyup="nexttel2()" value="<%=tel[1]%>">-<input class="input" type="text" name="tel3" maxlength="4" style="width:40px" onkeyup="nexttel3()" value="<%=tel[2]%>"></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="text" class="input" name="email1" maxlength="15" style="width:100px" value="<%= dto.getEmail() %>">
					@
					<select name="email2" class="input">
						<option value="0">직접입력</option>
						<option value="naver.com">네이버</option>
						<option value="daum.net">다음</option>
						<option value="nate.com">네이트</option>
						<option value="gmail.com">구글</option>
					</select>
				</td>
			</tr>
			<tr>
				<th colspan="2">
					<input type="submit" class="inputButton" value="수정">
					<input type="reset" class="inputButton" value="리셋">
					<input type="button" class="inputbutton" value="수정취소" onclick="window.location='main.jsp'">
				</th>
			</tr>
		</table>
	</form>
</body>
<%
	} else {
		
	}
%>
</html>