package mvc.member.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.member.dao.LogonDBBean;
import mvc.member.dao.LogonDao;

public class DeleteProHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		request.setCharacterEncoding("utf-8");
		String id = (String) request.getSession().getAttribute("memId");
		// out.println((String) request.getSession().getAttribute("memId"));
		String passwd = request.getParameter("passwd");
		// 패스워드가 일치하면 resultPasswd == 1;
		// 패스워드가 일치하지 않으면 resultPasswd == -1;
		
		LogonDao logonDao = LogonDBBean.getInstance();
		int resultPasswd = logonDao.check(id, passwd);
		
		int result = 0;
		if (resultPasswd == 1) {
			result = logonDao.deleteMember(id);
		}
		
		request.setAttribute("resultPasswd", resultPasswd);
		request.setAttribute("result", result);
		
		return "/member/deletePro.jsp";
	}

}
