package spring.mvc.member.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service("logoutHandler")
public class LogoutHandler implements MCommand {

	@Override
	public String execute(Model model) {
		Map<String, Object> map = model.asMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		//request.getSession().setAttribute("memId", null);
		request.getSession().removeAttribute("memId");
		return "member/main";
	}

}
