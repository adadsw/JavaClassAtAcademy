package spring.mvc.member.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service("loginFormHandler")
public class LoginFormHandler implements MCommand {

	@Override
	public String execute(Model model) {
		
		Map<String, Object> map = model.asMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String result = (String) request.getParameter("result");
		model.addAttribute("result", result);
		
		System.out.println("loginFormhandler");
		return "member/loginForm";
	}
}
