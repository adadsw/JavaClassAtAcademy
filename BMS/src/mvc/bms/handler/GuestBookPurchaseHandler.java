package mvc.bms.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.bms.dao.BookDBBean;
import mvc.bms.dto.BookDataBean;

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
