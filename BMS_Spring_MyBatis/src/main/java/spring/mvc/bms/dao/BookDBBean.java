package spring.mvc.bms.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.bms.dto.BookDataBean;

@Repository
public class BookDBBean implements BookDao {
	
	// 마이바티스 추가 시작
	@Autowired
	private SqlSession sqlSession;
	// 마이바티스 추가 종료
	
	public List<BookDataBean> listBook() {
		List<BookDataBean> bookList = null;
		BookDao dao = this.sqlSession.getMapper(BookDao.class);
		bookList = dao.listBook();
		return bookList;
	}
	
	public BookDataBean aBook(String book_code) {
		BookDataBean book = null;
		BookDao dao = this.sqlSession.getMapper(BookDao.class);
		book = dao.aBook(book_code);
		return book;
	}
}
