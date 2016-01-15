package spring.mvc.member.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.member.dao.LogonDBBean;

public class ConfirmIdHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		
		Map<String, Object> map = mv.getModelMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String id = request.getParameter("id");
		
		int result = LogonDBBean.getInstance().check(id);
		
		//request.setAttribute("key값", value나 변수);
		mv.addObject("id", id);
		mv.addObject("result", result);
		
		return "member/confirmId";
	}

}
