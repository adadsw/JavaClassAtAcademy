package spring.mvc.bms.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

public class LogoutHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		Map<String, Object> map = mv.getModelMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		//request.getSession().setAttribute("user_id", null);
		request.getSession().removeAttribute("user_id");
		return "login/loginForm";
	}

}
