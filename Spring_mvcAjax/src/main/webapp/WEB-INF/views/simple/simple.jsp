<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script src="/ajaxEx/resources/request.js"></script>

<h2>Ajax - Asynchronous JavaScript and XML</h2>
비동기식 자바스크립트와 XML
<br><br>

<script type="text/javascript">
	function show() {
		// function sendRequest(callback, url, method, params)
		sendRequest(simple, "simple", "POST");
	}

	/* simple(): 콜백메소드, result : 출력자리*/
	function simple() {
		var result = document.getElementById("result")
		if (httpRequest.readyState == 4) {
			if (httpRequest.status == 200) {
				var msg = "";
				msg = "이름 : " + document.inputform.name.value;
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
			<td>
				<input type="text" name="name">
				<input type="button" value="확인" onclick="show()">
			</td>
		</tr>
	</table>
</form>

<!-- 결과 출력 위치 -->
<br>
<div id="result">
	
</div>
<br>