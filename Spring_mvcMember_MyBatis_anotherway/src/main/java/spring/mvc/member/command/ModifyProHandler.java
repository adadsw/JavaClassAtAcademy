package spring.mvc.member.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import spring.mvc.member.dao.LogonDao;
import spring.mvc.member.dto.LogonDataBean;

@Service("modifyProHandler")
public class ModifyProHandler implements MCommand {

	@Autowired
	LogonDao logonDao;
	
	@Override
	public String execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
//		LogonDao logonDao = LogonDBBean.getInstance();
		LogonDataBean dto = new LogonDataBean();
		dto.setId((String) request.getSession().getAttribute("memId"));	
		dto.setPasswd(request.getParameter("passwd"));
		dto.setTel(request.getParameter("tel"));
		dto.setEmail(request.getParameter("email"));
		
		int result = logonDao.modifyMember(dto);
		model.addAttribute("result", result);
		
		return "member/modifyPro";
	}

}
