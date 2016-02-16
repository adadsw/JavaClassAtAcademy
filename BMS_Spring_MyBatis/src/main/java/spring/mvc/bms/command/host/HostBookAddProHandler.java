package spring.mvc.bms.command.host;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;
import spring.mvc.bms.dao.HostDao;

@Service("hostBookAddProHandler")
public class HostBookAddProHandler implements MCommand {

	@Autowired
	HostDao dao;
	
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
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("title", title);
		map2.put("writer_name", writer_name);
		map2.put("price", price);
		
		int result = dao.addBook(map2);
		
		mv.addObject("addBookResult", result);
		return "forward:/hostBookManagement";
	}
}
