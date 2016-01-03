package mvc.bms.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		//request.getSession().setAttribute("user_id", null);
		request.getSession().removeAttribute("user_id");
		return "/login/loginForm.jsp";
	}

}
