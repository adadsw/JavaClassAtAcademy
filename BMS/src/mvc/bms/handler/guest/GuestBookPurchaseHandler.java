package mvc.bms.handler.guest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.bms.dao.BookDBBean;
import mvc.bms.dto.BookDataBean;
import mvc.bms.handler.CommandHandler;

public class GuestBookPurchaseHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
int result = 0;
		
		BookDBBean bookDto = BookDBBean.getInstance();
		List<BookDataBean> bookList = bookDto.listBook();
		
		if (bookList == null) {
			return "/guest/bookPurchase.jsp?bookListResult=" + result;
		} else {
			request.setAttribute("bookList", bookList);
			return "/guest/bookPurchase.jsp";
		}
	}

}
