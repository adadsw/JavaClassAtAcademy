package mvc.bms.handler.host;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.bms.dao.BookDBBean;
import mvc.bms.dto.BookDataBean;
import mvc.bms.handler.CommandHandler;

public class HostBookModifyFormHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) 
			throws Throwable {
		String book_code = request.getParameter("book_code");
		
		BookDataBean book = BookDBBean.getInstance().aBook(book_code);
		request.setAttribute("book", book);
		return "/host/bookModifyForm.jsp";
	}
}
