package spring.mvc.member.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.member.dao.LogonDBBean;
import spring.mvc.member.dao.LogonDao;

public class LoginProHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		Map<String, Object> map = mv.getModelMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		LogonDao logonDao = LogonDBBean.getInstance(); 
		int result = logonDao.check(id, passwd);
		
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
