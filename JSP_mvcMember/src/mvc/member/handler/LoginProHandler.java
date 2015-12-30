package mvc.member.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.member.dao.LogonDBBean;
import mvc.member.dao.LogonDao;

public class LoginProHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		
		LogonDao logonDao = LogonDBBean.getInstance(); 
		int result = logonDao.check(id, passwd);
		
		if(result == 1) {
			//로그인 성공
			request.getSession().setAttribute("memId", id);
			//response.sendRedirect("main.do");
			return "/member/main.jsp";
		} else if(result == -1) {
			// 비밀번호 불일치
			//request.setAttribute("result", result);
			return "/member/loginForm.jsp?result=" + result;
		} else {
			// 아이디가 존재하지 않음 : 0
			//request.setAttribute("result", result);
			return "/member/loginForm.jsp?result=" + result;
		}
	}
}
