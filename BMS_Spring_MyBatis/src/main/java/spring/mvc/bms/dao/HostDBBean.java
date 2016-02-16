package spring.mvc.bms.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.bms.dto.BookDataBean;
@Repository
public class HostDBBean implements HostDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public int addBook(Map<String, String> map) {
		int result = 0;
		HostDao dao = this.sqlSession.getMapper(HostDao.class);
		result = dao.addBook(map);
		return result;
	}
	
	public int deleteBook(String book_code) {
		int result = 0;
		HostDao dao = this.sqlSession.getMapper(HostDao.class);
		result = dao.deleteBook(book_code);
		return result;
	}
	
	public int modifyBook(BookDataBean book) {
		int result = 0;
		HostDao dao = this.sqlSession.getMapper(HostDao.class);
		result = dao.modifyBook(book);
		return result;
	}
}
