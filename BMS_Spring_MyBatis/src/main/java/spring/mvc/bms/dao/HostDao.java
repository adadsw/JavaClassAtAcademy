package spring.mvc.bms.dao;

import java.util.Map;

import spring.mvc.bms.dto.BookDataBean;

public interface HostDao {

	public int addBook(Map<String, String> map);
	public int deleteBook(String book_code);
	public int modifyBook(BookDataBean book);
}
