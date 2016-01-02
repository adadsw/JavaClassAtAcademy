package mvc.bms.dto;

import java.util.ArrayList;
import java.util.List;

public class OrderListDataBean {
	private List<OrderDataBean> orderList = new ArrayList<OrderDataBean>();
	
	public void addOrder(OrderDataBean order) {
		orderList.add(order);
	}

	public List<OrderDataBean> getOrderList() {
		return orderList;
	}
}
