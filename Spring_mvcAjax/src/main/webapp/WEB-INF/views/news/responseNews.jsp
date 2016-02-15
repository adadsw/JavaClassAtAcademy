<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<script src="/ajaxEx/resources/request.js"></script>
    
<script type="text/javascript">

	function load(url) {
		sendRequest(loadNews, url, "POST");
	}
	
	/* 콜백 메소드 */
	function loadNews() {
		var result = document.getElementById("result");
		if (httpRequest.readyState == 4) {
			if (httpRequest.status == 200) {
				result.innerHTML = httpRequest.responseText;
			} else {
				result.innerHTML = "에러발생";
			}
		}
	}
	
</script>

<a onclick="load('news1')">국방부 "美서 사드배치 협의요청 없다…주한미군 배치 안보도움"</a><br>
<a onclick="load('news2')">"운동만으로 체중 줄이는 데는 한계"</a><br>
<a onclick="load('news3')">밥솥 껴안고 자기, 생존가계부 쓰기… 헬조선 청년의 씁쓸한 ‘꿀팁’ </a><br>

<br><br>
<div id="result">

</div>
