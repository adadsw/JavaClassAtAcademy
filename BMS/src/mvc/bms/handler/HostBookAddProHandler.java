package mvc.bms.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.bms.dao.HostDBBean;

public class HostBookAddProHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		request.setCharacterEncoding("euc-kr");
		
		HostDBBean hostDao = HostDBBean.getInstance();
		String title = request.getParameter("title");
		String writer_name = request.getParameter("writer_name");
		String price = request.getParameter("price");
		
		int result = hostDao.addBook(title, writer_name, price);
		
		request.setAttribute("addBookResult", result);
		if (result == 1) {
			return "hostBookManagement.do";
		} else {
			return "hostBookManagement.do";
		}

	}

}
