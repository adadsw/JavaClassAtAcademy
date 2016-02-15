<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script src="/ajaxEx/resources/request.js"></script>

<script type="text/javascript">

	function load() {
		sendRequest(loadBook, "book", "POST");
	}
	
	function loadBook() {
		if (httpRequest.readyState == 4) {
			if (httpRequest.status == 200) {
				var msg = "";
				
				//eval("문자열") 함수 : 일반문자열을 수식으로 리턴해주는 역할을 한다.
				var data = eval("httpRequest.responseText");
				var booklist = data.split("|");
				for (var i=0; i<booklist.length; i++) {
					var book = booklist[i].split(",");
					msg += "제목 : " + book[0] + "<br>"
						 + "저자 : " + book[1] + "<br>"
						 + "가격 : " + book[2] + "<br><br>"
				}

				var result = document.getElementById("result")
				result.innerHTML = msg;
			}
		} else {
			result.innerHTML = "상태 : " + httpRequest.readyState;
		}
	}

</script>
    
확인 : <input type="button" value="확인" onclick="load()"><br><br>

<div id="result">
</div>