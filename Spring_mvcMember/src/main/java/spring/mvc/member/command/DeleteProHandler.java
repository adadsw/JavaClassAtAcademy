package spring.mvc.member.command;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.member.dao.LogonDBBean;
import spring.mvc.member.dao.LogonDao;

public class DeleteProHandler implements MCommand {

	@Override
	public String execute(ModelAndView mv) {
		Map<String, Object> map = mv.getModelMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
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
		
		mv.addObject("resultPasswd", resultPasswd);
		mv.addObject("result", result);
		
		return "member/deletePro";
	}

}
