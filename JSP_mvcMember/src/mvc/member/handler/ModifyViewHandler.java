package mvc.member.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.member.dao.LogonDBBean;
import mvc.member.dao.LogonDao;
import mvc.member.dto.LogonDataBean;

public class ModifyViewHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		String id = (String) request.getSession().getAttribute("memId");
		String passwd = request.getParameter("passwd");
		
		LogonDao logonDao = LogonDBBean.getInstance();
		int result = logonDao.check(id, passwd);
		
		if (result == 1) {
			LogonDataBean dto = logonDao.getMember(id);
			request.setAttribute("dto", dto);
		}
		
		request.setAttribute("result", result);
		
		return "/member/modifyView.jsp";
	}

}
