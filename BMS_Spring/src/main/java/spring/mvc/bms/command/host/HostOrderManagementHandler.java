package spring.mvc.bms.command.host;

import java.util.List;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;
import spring.mvc.bms.dao.OrderDBBean;
import spring.mvc.bms.dto.OrderDataBean;

public class HostOrderManagementHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		OrderDBBean orderDto = OrderDBBean.getInstance();
		List<OrderDataBean> orderList = orderDto.listOrders();
		
		if (orderList != null) {
			mv.addObject("orderList", orderList);
		}
		return "host/orderManagement";
	}
}