package mvc.bms.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.bms.dao.UserDBBean;
import mvc.bms.dao.UserDao;

public class LoginProHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		String user_id = request.getParameter("user_id");
		String pw = request.getParameter("pw");
		
		UserDao userdao = UserDBBean.getInstance();
		int result = userdao.check(user_id, pw);
		
		if (result == 1) {
			request.getSession().setAttribute("user_id", user_id);
			return "/menu/menu.jsp";
		} else  { // 비번 틀림 -1 아디 없음 0
			return "/login/loginForm.jsp?result=" + result; //여기 해야 함
		}
	}

}
