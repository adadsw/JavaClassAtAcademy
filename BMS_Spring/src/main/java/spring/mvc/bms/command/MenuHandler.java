package spring.mvc.bms.command;

import org.springframework.web.servlet.ModelAndView;

public class MenuHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		return "menu/menu.jsp";
	}

}
