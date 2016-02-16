package spring.mvc.bms.command.host;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;
import spring.mvc.bms.dao.HostDao;
import spring.mvc.bms.dto.BookDataBean;

@Service("hostBookModifyProHandler")
public class HostBookModifyProHandler implements MCommand {

	@Autowired
	HostDao hostDao;
	
	@Override
	public String execute(ModelAndView mv) {
		Map<String, Object> map = mv.getModelMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		BookDataBean book = new BookDataBean();
		book.setBook_code(request.getParameter("book_code"));
		book.setTitle(request.getParameter("title"));
		book.setWriter_name(request.getParameter("writer_name"));
		book.setPrice(request.getParameter("price"));
		
		int result = hostDao.modifyBook(book);
		mv.addObject("modifyBookResult", result);
		return "forward:/hostBookManagement";
	}

}
