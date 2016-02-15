package spring.mvc.bms.command.host;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;
import spring.mvc.bms.dao.BookDBBean;
import spring.mvc.bms.dto.BookDataBean;

public class HostBookModifyFormHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		Map<String, Object> map = mv.getModelMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String book_code = request.getParameter("book_code");
		
		BookDataBean book = BookDBBean.getInstance().aBook(book_code);
		mv.addObject("book", book);
		return "host/bookModifyForm";
	}
}
