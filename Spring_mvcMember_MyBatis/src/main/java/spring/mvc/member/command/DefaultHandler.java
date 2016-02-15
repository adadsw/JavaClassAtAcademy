package spring.mvc.member.command;

import org.springframework.ui.Model;

public class DefaultHandler implements MCommand {

	@Override
	public String execute(Model mv) {
		return "member/delete";
	}

}
