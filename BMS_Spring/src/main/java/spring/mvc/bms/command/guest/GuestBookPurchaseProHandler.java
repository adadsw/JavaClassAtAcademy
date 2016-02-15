package spring.mvc.bms.command.guest;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;
import spring.mvc.bms.dao.GuestDBBean;

public class GuestBookPurchaseProHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		Map<String, Object> map = mv.getModelMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
		String user_id = (String) request.getSession().getAttribute("user_id");
		String book_code = request.getParameter("book_code");
		
		GuestDBBean guestDao = GuestDBBean.getInstance();
		int result = guestDao.purchaseBook(user_id, book_code);
		mv.addObject("purchaseResult", result);
		return "forward:/guestBookPurchase";
	}
}
