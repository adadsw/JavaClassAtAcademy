<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<body>
	<form class="bookAddForm" action="hostBookAddPro.do" method="post" name="loginform">
		<fieldset>
			<legend>å���� �Է�</legend>
			<table>
				<tr>
					<th>����</th>
					<td><input type="text" name="title" maxlength="50"></td>
				</tr>
				<tr>
					<th>����</th>
					<td><input type="text" name="writer_name" maxlength="20"></td>
				</tr>
				<tr>
					<th>����</th> <!-- ���ڸ� �Ѿ�� ������ �� -->
					<td><input type="number" name="price" value="10000" min="0" max="99999" step="5"></td>
				</tr>
				<tr>
					<th><input type="submit" value="�߰�"></th>
				</tr>
				<tr>
					<th><input type="button" value="���" onclick="window.location='hostBookManagement.do'"></th>
				</tr>
			</table>
		</fieldset>
	</form>
</body>