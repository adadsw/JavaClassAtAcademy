package spring.mvc.bms.command.guest;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;
import spring.mvc.bms.dao.BookDBBean;
import spring.mvc.bms.dto.BookDataBean;

public class GuestBookPurchaseHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		Map<String, Object> map = mv.getModelMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		int result = 0;
		
		BookDBBean bookDto = BookDBBean.getInstance();
		List<BookDataBean> bookList = bookDto.listBook();
		
		if (bookList == null) {
			mv.addObject("bookListResult", result);
			return "guest/bookPurchase";
		} else {
			request.setAttribute("bookList", bookList);
			return "guest/bookPurchase";
		}
	}

}
