package spring.mvc.bms.command.host;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;
import spring.mvc.bms.dao.HostDao;

@Service("hostBookDeleteProHandler")
public class HostBookDeleteProHandler implements MCommand {
	
	@Autowired
	HostDao hostDao;
	
	@Override
	public String execute(ModelAndView mv) {
		Map<String, Object> map = mv.getModelMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String[] checkedBookCode = request.getParameterValues("book_code");
		
		String resultStr = " "; //���� �� �� �ֵ�.å ���� �ȵ� ��� ��� ���÷��� �ұ�
		for (int i = 0; i < checkedBookCode.length; i++) {
			if (hostDao.deleteBook(checkedBookCode[i]) == 0) {
				resultStr += "" + checkedBookCode[i] + " "; 
			}
		}
		
		mv.addObject("deleteBookResult", resultStr);
		return "forward:/hostBookManagement";
	}
}
