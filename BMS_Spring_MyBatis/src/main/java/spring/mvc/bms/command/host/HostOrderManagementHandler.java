package spring.mvc.bms.command.host;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;
import spring.mvc.bms.dao.OrderDao;
import spring.mvc.bms.dto.OrderDataBean;

@Service("hostOrderManagementHandler")
public class HostOrderManagementHandler implements MCommand {

	@Autowired
	OrderDao orderDao;
	@Override
	public String execute(ModelAndView mv) {
		List<OrderDataBean> orderList = orderDao.listOrders();
		
		if (orderList != null) {
			mv.addObject("orderList", orderList);
		}
		return "host/orderManagement";
	}
}