package mvc.bms.dao;

import java.util.List;

import mvc.bms.dto.BookDataBean;

public interface BookDao {
	public List<BookDataBean> listBook();
}