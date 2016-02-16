package spring.mvc.bms.command.host;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;

@Service("hostBookAddFormHandler")
public class HostBookAddFormHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		return "host/bookAddForm";
	}

}
