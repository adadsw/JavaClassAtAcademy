package mvc.bms.handler.host;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.bms.dao.BookDBBean;
import mvc.bms.dto.BookDataBean;
import mvc.bms.handler.CommandHandler;

public class HostBookManagementHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		BookDBBean bookDto = BookDBBean.getInstance();
		List<BookDataBean> bookList = bookDto.listBook();
		
		if (bookList == null) {
			return "/host/bookManagement.jsp?bookListResult=0";
		} else {
			request.setAttribute("bookList", bookList);
			return "/host/bookManagement.jsp";
		}
	}
}
