package mvc.bms.handler.guest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.bms.dao.OrderDBBean;
import mvc.bms.dto.OrderRefundDataBean;
import mvc.bms.handler.CommandHandler;

public class GuestRefundHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		OrderDBBean orderDto = OrderDBBean.getInstance();
		String user_id = (String) request.getSession().getAttribute("user_id");
		List<OrderRefundDataBean> orderList = orderDto.listRefundOrders(user_id);
		if (orderList == null) {
			return "/guest/bookRefund.jsp?orderListResult=0";
		} else {
			request.setAttribute("orderList", orderList);
			return "/guest/bookRefund.jsp";
		}
	}
}