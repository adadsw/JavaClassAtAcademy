package spring.mvc.bms.command.guest;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;
import spring.mvc.bms.dao.OrderDBBean;
import spring.mvc.bms.dto.OrderRefundDataBean;

public class GuestRefundHandler implements MCommand {
	@Override
	public String execute(ModelAndView mv) {
		Map<String, Object> map = mv.getModelMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		OrderDBBean orderDao = OrderDBBean.getInstance();
		String user_id = (String) request.getSession().getAttribute("user_id");
		List<OrderRefundDataBean> orderList = orderDao.listRefundOrders(user_id);
		
		if (orderList != null) {
			mv.addObject("orderList", orderList);
		}
		return "guest/bookRefund";
	}
}