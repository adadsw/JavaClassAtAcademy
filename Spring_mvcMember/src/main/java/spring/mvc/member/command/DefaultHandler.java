package spring.mvc.member.command;

import org.springframework.web.servlet.ModelAndView;

public class DefaultHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		return "member/delete";
	}

}
