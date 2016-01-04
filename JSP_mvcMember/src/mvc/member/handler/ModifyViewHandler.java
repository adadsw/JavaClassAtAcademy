package mvc.member.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.member.dao.LogonDBBean;
import mvc.member.dto.LogonDataBean;

public class ModifyViewHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		String id = (String) request.getSession().getAttribute("memId");
		String passwd = request.getParameter("passwd");

		int result = LogonDBBean.getInstance().check(id, passwd);
		
		if (result == 1) {
			LogonDataBean dto = LogonDBBean.getInstance().getMember(id);
			request.setAttribute("dto", dto);
		}
		
		request.setAttribute("result", result);
		
		return "/member/modifyView.jsp";
	}

}
