package mvc.bms.handler.guest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.bms.dao.GuestDBBean;
import mvc.bms.handler.CommandHandler;

public class GuestRefundProHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) 
			throws Throwable {
		
		request.setCharacterEncoding("utf-8");
		String[] checkedOrderCode = request.getParameterValues("order_code");
		
		GuestDBBean guestDao = GuestDBBean.getInstance();
		String resultStr = " "; //ȯ�� �� �� �ֵ�.å ȯ�� �ȵ� ��� ��� ���÷��� �ұ�
		
		for (int i = 0; i < checkedOrderCode.length; i++) {
			if (guestDao.refundBook(checkedOrderCode[i]) == 0) {
				resultStr += "" + checkedOrderCode[i] + "/"; 
			}
		}
		
		request.setAttribute("refundBookResult", resultStr);
		return "guestRefund.do";
	}

}
