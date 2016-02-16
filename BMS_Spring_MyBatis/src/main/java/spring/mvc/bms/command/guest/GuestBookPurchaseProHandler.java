package spring.mvc.bms.command.guest;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;
import spring.mvc.bms.dao.GuestDao;

@Service("guestBookPurchaseProHandler")
public class GuestBookPurchaseProHandler implements MCommand {

	@Autowired
	GuestDao dao;
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
		
		Map<String,String> map2 = new HashMap<String, String>();
		map2.put("user_id", user_id);
		map2.put("book_code", book_code);
		
		int result = dao.purchaseBook(map2);
		mv.addObject("purchaseResult", result);
		return "forward:/guestBookPurchase";
	}
}
