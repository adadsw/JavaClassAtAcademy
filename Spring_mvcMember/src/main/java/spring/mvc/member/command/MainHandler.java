package spring.mvc.member.command;

import org.springframework.ui.Model;

public class MainHandler implements MCommand {

	@Override
	public String execute(Model model) {
		// TODO 자동 생성된 메소드 스텁
		return "/member/main.jsp";
	}

}
