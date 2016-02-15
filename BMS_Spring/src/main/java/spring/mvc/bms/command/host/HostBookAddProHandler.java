package spring.mvc.bms.command.host;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;
import spring.mvc.bms.dao.HostDBBean;

public class HostBookAddProHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		Map<String, Object> map = mv.getModelMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
				
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String title = request.getParameter("title");
		String writer_name = request.getParameter("writer_name");
		String price = request.getParameter("price");
		
		HostDBBean hostDao = HostDBBean.getInstance();
		int result = hostDao.addBook(title, writer_name, price);
		mv.addObject("addBookResult", result);
		return "forward:/hostBookManagement";
	}

}
