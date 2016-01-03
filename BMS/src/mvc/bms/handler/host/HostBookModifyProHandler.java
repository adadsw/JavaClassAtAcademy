package mvc.bms.handler.host;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.bms.dao.HostDBBean;
import mvc.bms.dto.BookDataBean;
import mvc.bms.handler.CommandHandler;

public class HostBookModifyProHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) 
			throws Throwable {
		
		request.setCharacterEncoding("utf-8");
		
		BookDataBean book = new BookDataBean();
		book.setBook_code(request.getParameter("book_code"));
		book.setTitle(request.getParameter("title"));
		book.setWriter_name(request.getParameter("writer_name"));
		book.setPrice(request.getParameter("price"));
		
		HostDBBean hostDao = HostDBBean.getInstance();
		int result = hostDao.modifyBook(book);
		request.setAttribute("modifyBookResult", result);
		return "hostBookManagement.do";
	}

}
