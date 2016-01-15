package spring.mvc.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.member.dao.LogonDBBean;
import mvc.member.dao.LogonDao;
import mvc.member.dto.LogonDataBean;

public class ModifyProHandler implements MCommand {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		LogonDao logonDao = LogonDBBean.getInstance();
		LogonDataBean dto = new LogonDataBean();
		dto.setId((String) request.getSession().getAttribute("memId"));	
		dto.setPasswd(request.getParameter("passwd"));
		dto.setTel(request.getParameter("tel"));
		dto.setEmail(request.getParameter("email"));
		
		int result = logonDao.modifyMember(dto);
		request.setAttribute("result", result);
		
		return "/member/modifyPro.jsp";
	}

}
