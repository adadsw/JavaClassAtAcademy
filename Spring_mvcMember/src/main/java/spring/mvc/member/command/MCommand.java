package spring.mvc.member.command;

import org.springframework.web.servlet.ModelAndView;

public interface MCommand {
	
	public String execute(ModelAndView mv);

}
