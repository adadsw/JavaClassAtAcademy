package spring.mvc.bms.dao;

import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class GuestDBBean implements GuestDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public int purchaseBook(Map<String, String> map) {
		int result = 0;
		GuestDao dao = this.sqlSession.getMapper(GuestDao.class);
		result = dao.purchaseBook(map);
		return result;
	}
	
	public int refundBook(String order_code) {
		int result = 0;
		GuestDao dao = this.sqlSession.getMapper(GuestDao.class);
		result = dao.refundBook(order_code);
		return result;
	}
}
