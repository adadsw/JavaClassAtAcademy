package mvc.bms.handler.host;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.bms.dao.HostDBBean;
import mvc.bms.handler.CommandHandler;

public class HostBookAddProHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		request.setCharacterEncoding("utf-8");
		
		HostDBBean hostDao = HostDBBean.getInstance();
		String title = request.getParameter("title");
		String writer_name = request.getParameter("writer_name");
		String price = request.getParameter("price");
		
		int result = hostDao.addBook(title, writer_name, price);
		
		request.setAttribute("addBookResult", result);
		return "hostBookManagement.do";
	}

}
