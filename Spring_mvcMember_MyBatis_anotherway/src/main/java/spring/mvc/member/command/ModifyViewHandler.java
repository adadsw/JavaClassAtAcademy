package spring.mvc.member.command;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import spring.mvc.member.dao.LogonDao;
import spring.mvc.member.dto.LogonDataBean;

@Service("modifyViewHandler")
public class ModifyViewHandler implements MCommand {

	@Autowired
	LogonDao logonDao;
	
	@Override
	public String execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String id = (String) request.getSession().getAttribute("memId");
		String passwd = request.getParameter("passwd");

		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("id", id);
		map2.put("passwd", passwd);
		int result = logonDao.checkPwd(map2);
		
		if (result == 1) {
			LogonDataBean dto = logonDao.getMember(id);
			request.setAttribute("dto", dto);
		}
		
		model.addAttribute("result", result);
		
		return "member/modifyView";
	}

}
