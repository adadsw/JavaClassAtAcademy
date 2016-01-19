package spring.mvc.member.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.member.dao.LogonDBBean;
import spring.mvc.member.dto.LogonDataBean;

public class ModifyViewHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		Map<String, Object> map = mv.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String id = (String) request.getSession().getAttribute("memId");
		String passwd = request.getParameter("passwd");

		int result = LogonDBBean.getInstance().check(id, passwd);
		
		if (result == 1) {
			LogonDataBean dto = LogonDBBean.getInstance().getMember(id);
			request.setAttribute("dto", dto);
		}
		
		mv.addObject("result", result);
		
		return "member/modifyView";
	}

}
