package spring.mvc.bms.command;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.dao.UserDao;

@Service("loginProHandler")
public class LoginProHandler implements MCommand {

	@Autowired
	UserDao dao;
	
	@Override
	public String execute(ModelAndView mv) {
		
		Map<String, Object> map = mv.getModelMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String user_id = request.getParameter("user_id");
		String pw = request.getParameter("pw");
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("user_id", user_id);
		map2.put("pw", pw);
		
		int result = dao.check(map2);
		
		if (result == 1) {
			request.getSession().setAttribute("user_id", user_id);
			return "menu/menu";
		} else  {
			mv.addObject("result", result);
			return "login/loginForm";
		}
	}
}
