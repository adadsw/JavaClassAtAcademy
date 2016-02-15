package spring.mvc.member.command;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import spring.mvc.member.dao.LogonDao;

@Service("loginProHandler")
public class LoginProHandler implements MCommand {
	
	@Autowired
	LogonDao logonDao;
	
	@Override
	public String execute(Model model) {
		Map<String, Object> map = model.asMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("id", id);
		map2.put("passwd", passwd);
		
		int result = logonDao.checkPwd(map2);
		
		
		if(result == 1) {
			//로그인 성공
			request.getSession().setAttribute("memId", id);
			//response.sendRedirect("main.do");
			return "member/main";
		} else if(result == -1) {
			// 비밀번호 불일치
			request.setAttribute("result", result);
			return "member/loginForm";
		} else {
			// 아이디가 존재하지 않음 : 0
			request.setAttribute("result", result);
			return "member/loginForm";
		}
	}
}
