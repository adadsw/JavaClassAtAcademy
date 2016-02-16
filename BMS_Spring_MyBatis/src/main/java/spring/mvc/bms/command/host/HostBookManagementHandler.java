package spring.mvc.bms.command.host;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;
import spring.mvc.bms.dao.BookDao;
import spring.mvc.bms.dto.BookDataBean;

@Service("hostBookManagementHandler")
public class HostBookManagementHandler implements MCommand {

	@Autowired
	BookDao bookDao;
	
	@Override
	public String execute(ModelAndView mv) {
		
		List<BookDataBean> bookList = bookDao.listBook();
		if (bookList != null) {
			mv.addObject("bookList", bookList);
		}
		return "host/bookManagement";
	}
}
