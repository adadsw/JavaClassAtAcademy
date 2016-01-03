package mvc.bms.handler.host;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.bms.dao.HostDBBean;
import mvc.bms.handler.CommandHandler;

public class HostBookDeleteProHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) 
			throws Throwable {

		request.setCharacterEncoding("utf-8");
		String[] checkedBookCode = request.getParameterValues("book_code");
		
		HostDBBean hostDao = HostDBBean.getInstance();
		
		String resultStr = " "; //���� �� �� �ֵ�.å ���� �ȵ� ��� ��� ���÷��� �ұ�
		for (int i = 0; i < checkedBookCode.length; i++) {
			if (hostDao.deleteBook(checkedBookCode[i]) == 0) {
				resultStr += "" + checkedBookCode[i] + " "; 
			}
		}
		
		request.setAttribute("deleteBookResult", resultStr);
		return "hostBookManagement.do";

	}
}
