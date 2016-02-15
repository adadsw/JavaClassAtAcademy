package spring.mvc.member.command;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import spring.mvc.member.dao.LogonDao;

@Service("deleteProHandler")
public class DeleteProHandler implements MCommand {

	@Autowired
	LogonDao logonDao;
	
	@Override
	public String execute(Model mv) {
		Map<String, Object> map = mv.asMap();
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
		
		Map<String, String> map2 = new HashMap<String, String>();
		map2.put("id", id);
		map2.put("passwd", passwd);
		
		int resultPasswd = logonDao.checkPwd(map2);
		
		int result = 0;
		if (resultPasswd == 1) {
			result = logonDao.deleteMember(id);
		}
		
		mv.addAttribute("resultPasswd", resultPasswd);
		mv.addAttribute("result", result);
		
		return "member/deletePro";
	}

}
