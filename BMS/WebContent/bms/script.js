
// 1. 로그인 페이지
function loginfocus() {
	document.loginform.user_id.focus();
}


// Host 책 삭제
function deleteBook() {
	var books = document.getElementsByName("book_code");
	var selectedBooks = new Array();
	for (i=0;i<books.length;i++) {
		if (books[i].checked == true) {
			selectedBooks.push(books[i].value);
		}
	}
	var deleteCheck = confirm("wanna delete these?\n" + selectedBooks);
	
	if (deleteCheck) {
		window.open('hostBookDeletePro.do');
	}
	return selectedBooks;
}