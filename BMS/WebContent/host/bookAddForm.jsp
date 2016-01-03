<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<body>
	<form class="bookAddForm" action="hostBookAddPro.do" method="post" name="loginform">
		<fieldset>
			<legend>책 정보 입력</legend>
			<table>
				<tr>
					<th>서명</th>
					<td><input type="text" name="title" maxlength="50"></td>
				</tr>
				<tr>
					<th>저자</th>
					<td><input type="text" name="writer_name" maxlength="20"></td>
				</tr>
				<tr>
					<th>가격</th>
					<td><input type="number" name="price" value="10000" min="0" max="99999" step="5"></td>
				</tr>
				<tr>
					<th><input type="submit" value="추가"></th>
				</tr>
				<tr>
					<th><input type="button" value="목록" onclick="window.location='hostBookManagement.do'"></th>
				</tr>
			</table>
		</fieldset>
	</form>
</body>