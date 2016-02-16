package spring.mvc.bms.command.guest;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.MCommand;
import spring.mvc.bms.dao.GuestDao;

@Service("guestRefundProHandler")
public class GuestRefundProHandler implements MCommand {
	
	@Autowired
	GuestDao guestDao;
	
	@Override
	public String execute(ModelAndView mv) {
		Map<String, Object> map = mv.getModelMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		String[] checkedOrderCode = request.getParameterValues("order_code");
		
		String resultStr = " "; //ȯ�� �� �� �ֵ�.å ȯ�� �ȵ� ��� ��� ���÷��� �ұ�
		
		for (int i = 0; i < checkedOrderCode.length; i++) {
			if (guestDao.refundBook(checkedOrderCode[i]) == 0) {
				resultStr += "" + checkedOrderCode[i] + "/"; 
			}
		}
		
		mv.addObject("refundBookResult", resultStr);
		return "forward:/guestRefund";
	}

}
