<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<script src="/ajaxEx/resources/request.js"></script>

<script type="text/javascript">

	function load(color) {
		var params = "name=" + encodeURI(document.inputform.name.value) + "&color=" + color;		
		sendRequest(loadPage, "color", "POST", params); /* url = color.jsp */
	}
	
	function loadPage() {
		if (httpRequest.readyState == 4) {
			if (httpRequest.status == 200) {
				var result = document.getElementById("result");
				result.innerHTML = httpRequest.responseText;
			} else {
				result.innerHTML = "상태 : " + httpRequest.readyState;
			}
		}
	}

</script>

<form name="inputform">
	<table border="1">
		<tr>
			<th>이름</th>
			<td colspan="4"><input type="text" name="name">
		</tr>
		<tr>
			<th rowspan="4">색상</th>
			<td>
				<input type="radio" name="color" onclick="load('red')">빨강<br>
				<input type="radio" name="color" onclick="load('blud')">파랑<br>
				<input type="radio" name="color" onclick="load('yellow')">노랑<br>
				<input type="radio" name="color" onclick="load('green')">초록<br>
			</td>
		</tr>
	</table>
</form>

<br>
<div id="result"></div>
<br>