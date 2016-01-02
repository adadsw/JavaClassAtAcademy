package mvc.bms.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.bms.dao.HostDBBean;

public class HostBookDeleteProHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) 
			throws Throwable {
		
		request.setCharacterEncoding("euc-kr");
		System.out.println(request.getAttribute("book_code"));

		HostDBBean hostDao = HostDBBean.getInstance();
		
//		int result = hostDao.deleteBooks(book_code);
				
		System.out.println("삭제 페이지 지남");
		return "hostBookManagement.do";
	}
}
