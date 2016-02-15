package spring.mvc.bms.command.host;

import java.util.List;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;
import spring.mvc.bms.dao.BookDBBean;
import spring.mvc.bms.dto.BookDataBean;

public class HostBookManagementHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		BookDBBean bookDto = BookDBBean.getInstance();
		List<BookDataBean> bookList = bookDto.listBook();
		if (bookList != null) {
			mv.addObject("bookList", bookList);
		}
		return "host/bookManagement";
	}
}
