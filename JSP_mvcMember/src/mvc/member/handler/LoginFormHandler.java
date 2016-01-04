package mvc.member.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFormHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) 
			throws Throwable {
		String result = (String) request.getParameter("result");
		request.setAttribute("result", result);
		return "/member/loginForm.jsp";
	}
}
