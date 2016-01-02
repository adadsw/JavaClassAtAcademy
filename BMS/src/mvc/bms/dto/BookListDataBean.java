package mvc.bms.dto;

import java.util.*;

public class BookListDataBean {
	private List<BookDataBean> bookList = new ArrayList<BookDataBean>();
	
	public void addBook(BookDataBean book) {
		bookList.add(book);
	}

	public List<BookDataBean> getBookList() {
		return bookList;
	}

}
