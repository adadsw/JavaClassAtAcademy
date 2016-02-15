package spring.mvc.bms.command.guest;

import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;

public class GuestBagHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		return "guest/bag";
	}

}
