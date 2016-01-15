package spring.mvc.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InputFormHandler implements MCommand {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) 
			throws Throwable {
		
		return "/member/inputForm.jsp";
	}

}
