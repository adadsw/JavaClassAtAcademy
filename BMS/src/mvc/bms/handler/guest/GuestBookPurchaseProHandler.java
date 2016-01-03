package mvc.bms.handler.guest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.bms.dao.GuestDBBean;
import mvc.bms.handler.CommandHandler;

public class GuestBookPurchaseProHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {

		request.setCharacterEncoding("utf-8");
		String user_id = (String) request.getSession().getAttribute("user_id");
		String book_code = request.getParameter("book_code");
		
		GuestDBBean guestDao = GuestDBBean.getInstance();
		int result = guestDao.purchaseBook(user_id, book_code);
		request.setAttribute("purchaseResult", result);
		return "guestBookPurchase.do";
	}
}
