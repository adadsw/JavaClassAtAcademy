package spring.mvc.bms.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring.mvc.bms.dto.OrderDataBean;
import spring.mvc.bms.dto.OrderRefundDataBean;
@Repository
public class OrderDBBean implements OrderDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<OrderDataBean> listOrders() {
		List<OrderDataBean> orderList = null;
		OrderDao dao = this.sqlSession.getMapper(OrderDao.class);
		orderList = dao.listOrders();
		return orderList;
	}

	public List<OrderRefundDataBean> listRefundOrders(String user_id) {
		List<OrderRefundDataBean> orderList = null;
		OrderDao dao = this.sqlSession.getMapper(OrderDao.class);
		orderList = dao.listRefundOrders(user_id);
		return orderList;
	}
}
