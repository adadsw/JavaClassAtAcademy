package spring.mvc.member.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

public class LogoutHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		Map<String, Object> map = mv.getModelMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		//request.getSession().setAttribute("memId", null);
		request.getSession().removeAttribute("memId");
		return "member/main";
	}

}
