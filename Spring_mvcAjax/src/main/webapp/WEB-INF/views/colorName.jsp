<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script src="/ajaxEx/resources/request.js"></script>

<script type="text/javascript">
	function show() {
		// function sendRequest(callback, url, method, params)
		sendRequest(loadNameColor, "colorName", "POST");
	}

	/* simple(): 콜백메소드, result : 출력자리*/
	function loadNameColor() {
	
		if (httpRequest.readyState == 4) {
			if (httpRequest.status == 200) {
				var result = document.getElementById("result")
				var msg = "";
				msg = "<font color='" + document.inputform.color.value + "'>"
						+ document.inputform.name.value + "</font>";
				result.innerHTML = msg;
			} else {
				result.innerHTML = "에러발생";
			}
		} else {
			result.innerHTML = "상태 : " + httpRequest.readyState;
		}
	}
</script>


<form name="inputform">
	<table border="1">
		<tr>
			<th>이름</th>
			<td><input type="text" name="name"></td>
		</tr>
	</table>


<input type="radio" name="color" value="green" onclick="show()" />초록<br>
<input type="radio" name="color" value="blue" onclick="show()" />파랑<br>
<input type="radio" name="color" value="red" onclick="show()" />빨강

</form>

<!-- 결과 출력 위치 -->
<br>
<div id="result"></div>
<br>

