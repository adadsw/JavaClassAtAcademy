
// 로그인 페이지 ID 포커스
function loginfocus() {
	document.loginform.user_id.focus();
}

// Host 책 삭제 시 경고창
function bookdeletewarning() {
	var books = document.getElementsByName("book_code");
	var selectedBooks = new Array();
	for (i=0;i<books.length;i++) {
		if (books[i].checked == true) {
			selectedBooks.push(books[i].value);
		}
	}
	var deleteCheck = confirm("책을 삭제하시겠습니까?\n" + selectedBooks);
	return deleteCheck;
}

function bookrefundwarning() {
	return confirm("선택하신 책을 환불하시겠습니까?");
}