package spring.mvc.bms.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.dao.UserDBBean;
import spring.mvc.bms.dao.UserDao;

public class LoginProHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		
		Map<String, Object> map = mv.getModelMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String user_id = request.getParameter("user_id");
		String pw = request.getParameter("pw");
		
		UserDao userdao = UserDBBean.getInstance();
		int result = userdao.check(user_id, pw);
		
		if (result == 1) {
			request.getSession().setAttribute("user_id", user_id);
			return "menu/menu";
		} else  {
			mv.addObject("result", result);
			return "login/loginForm";
		}
	}
}
