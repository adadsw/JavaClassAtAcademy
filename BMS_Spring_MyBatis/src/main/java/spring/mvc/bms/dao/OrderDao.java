package spring.mvc.bms.dao;

import java.util.List;

import spring.mvc.bms.dto.OrderDataBean;
import spring.mvc.bms.dto.OrderRefundDataBean;

public interface OrderDao {
	public List<OrderDataBean> listOrders();
	public List<OrderRefundDataBean> listRefundOrders(String user_id);
}
