package mvc.member.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.member.dao.LogonDBBean;

public class ConfirmIdHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		String id = request.getParameter("id");
		
		int result = LogonDBBean.getInstance().check(id);
		
		//request.setAttribute("key값", value나 변수);
		request.setAttribute("id", id);
		request.setAttribute("result", result);
		
		return "/member/confirmId.jsp";
	}

}
