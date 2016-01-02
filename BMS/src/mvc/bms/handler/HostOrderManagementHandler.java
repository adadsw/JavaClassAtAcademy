package mvc.bms.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.bms.dao.OrderDBBean;
import mvc.bms.dto.OrderDataBean;

public class HostOrderManagementHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		OrderDBBean orderDto = OrderDBBean.getInstance();
		List<OrderDataBean> orderList = orderDto.listOrders();
		
		if (orderList == null) {
			return "/host/orderManagement.jsp?orderListResult=0";
		} else {
			request.setAttribute("orderList", orderList);
			return "/host/orderManagement.jsp";
		}
	}
}
