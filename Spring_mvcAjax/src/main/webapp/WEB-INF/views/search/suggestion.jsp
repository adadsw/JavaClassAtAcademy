<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script src="/ajaxEx/resources/request.js"></script>
<h2>검색 기능</h2>
검색어로 책 제목을 찾아서 출력한다.
<br>
<br>

<script type="text/javascript">
	var checkfirst = true; // 처음
	var loopsendkeyword = false // 작업 완료 후엔 0.5초마다 반복했던 작업을 중단
	var lastkeyword = null; //마지막 키워드
	
	function startSuggest() {
		if (checkfirst == true) { // 처음
			loopsendkeyword = true;	//0.5초마다 반복해라
			setTimeout("sendkeyword()", 500);
		}	
		checkfirst = false; //작업종료
	}
	
	function sendkeyword() {
		if (loopsendkeyword == false) return; // 반복을 종료해라..작업 종료 시 false로 셋
		
		var keyword = document.search.keyword.value;
		
		//검색어를 지운 경우 출력 위치를 숨겨라
		if (keyword == null) {
			hide("divSuggest");
			lastkeyword="";
		//똑같은 검색어는 계속 검색하지 않도록 함
		} else if (keyword != lastkeyword) {
			lastkeyword = keyword;
			var params = "keyword=" + encodeURI(keyword);
			sendRequest(result, "suggest", "POST", params); //suggest.jsp로 요청한 결과가 result로 돌아온다.
		} 
		
		setTimeout("sendkeyword()", 500); //function 안에서 호출하므로 계속 재귀호출
		
	}
	
	function result() {
		var suggestlist = document.getElementById("suggestlist");
		if (httpRequest.readyState == 4) {	// 4 : completed : 전 데이터를 취득완료된 상태
			if (httpRequest.status == 200) {	//200 : 정상종료
				var books = "";
				var data = httpRequest.responseText;
				//var data = "정상종료";
				
				var datalist = data.split("|");
				var count = datalist[0]; //갯수
				
				if (count > 0) {
					var booklist = datalist[1].split(",");
					for (var i = 0; i < count; i++) {
						books += "<a href=\"javascript:select('" + booklist[i] + "')\">"
							  + booklist[i]
							  + "</a>"
							  + "<br>";
					}
					show("divSuggest");
					suggestlist.innerHTML = books;
				} else {
					hide("divSuggest");
				}
			} else {
				suggestlist.innerHTML = "에러발생";
			} 	
		} else {
			suggestlist.innerHTML = "상태 : " + httpRequest.readyState;
		}
	}
	
	//작업 완료
	//검색작업이 완료되었으므로 검색단어가 input박스에 들어가고 결과list
	function select(book) {
		document.search.keyword.value = book;
		loopsendkeyword = false;
		checkfirst = true;
		hide("divSuggest"); // 
	}
	
	function show(str) {
		var element = document.getElementById(str);
		if (element) {
			element.style.display = "";
		}		
	}
	function hide(str) {
		var element = document.getElementById(str);
		if (element) {
			element.style.display = "none";
		}
	}
	
</script>

<form name="search">
	<input type="text" name="keyword" onkeydown="startSuggest()"> <input
		type="button" value="검색"
		onclick="location='http://book.naver.com/search/search.nhn?sm=sta_hty.book&sug=&where=nexearch&query='+encodeURI(document.search.keyword.value) ">
</form>

<div id="divSuggest">
	<div id="suggestlist"></div>
</div>