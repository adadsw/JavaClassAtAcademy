package spring.mvc.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutHandler implements MCommand {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		//request.getSession().setAttribute("memId", null);
		request.getSession().removeAttribute("memId");
		return "/member/main.jsp";
	}

}
