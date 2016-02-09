package spring.mvc.member.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.member.dao.LogonDBBean;
import spring.mvc.member.dao.LogonDao;
import spring.mvc.member.dto.LogonDataBean;

public class ModifyProHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		Map<String, Object> map = mv.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		LogonDao logonDao = LogonDBBean.getInstance();
		LogonDataBean dto = new LogonDataBean();
		dto.setId((String) request.getSession().getAttribute("memId"));	
		dto.setPasswd(request.getParameter("passwd"));
		dto.setTel(request.getParameter("tel"));
		dto.setEmail(request.getParameter("email"));
		
		int result = logonDao.modifyMember(dto);
		mv.addObject("result", result);
		
		return "member/modifyPro";
	}

}
