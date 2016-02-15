package spring.mvc.member.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import spring.mvc.member.dao.LogonDao;

@Service("confirmIdHandler")
public class ConfirmIdHandler implements MCommand {

	@Autowired
	LogonDao logonDao;
	
	@Override
	public String execute(Model model) {
		
		Map<String, Object> map = model.asMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String id = request.getParameter("id");
		
//		int result = LogonDBBean.getInstance().check(id);
		int result = logonDao.check(id);
		
		//request.setAttribute("key값", value나 변수);
		model.addAttribute("id", id);
		model.addAttribute("result", result);
		
		return "member/confirmId";
	}

}
