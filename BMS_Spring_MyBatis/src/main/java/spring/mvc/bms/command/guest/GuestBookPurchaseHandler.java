package spring.mvc.bms.command.guest;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;
import spring.mvc.bms.dao.BookDao;
import spring.mvc.bms.dto.BookDataBean;

@Service("guestBookPurchaseHandler")
public class GuestBookPurchaseHandler implements MCommand {

	@Autowired
	BookDao dao;
	@Override
	public String execute(ModelAndView mv) {
		Map<String, Object> map = mv.getModelMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		int result = 0;
		
		List<BookDataBean> bookList = dao.listBook();
		
		if (bookList == null) {
			mv.addObject("bookListResult", result);
			return "guest/bookPurchase";
		} else {
			request.setAttribute("bookList", bookList);
			return "guest/bookPurchase";
		}
	}

}
