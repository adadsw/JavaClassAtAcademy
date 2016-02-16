package spring.mvc.bms.command;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service("MenuHandler")
public class MenuHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		return "menu/menu.jsp";
	}

}
