package mvc.member.handler;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.member.dao.LogonDBBean;
import mvc.member.dao.LogonDao;
import mvc.member.dto.LogonDataBean;

public class InputProHandler implements CommandHandler {
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) 
			throws Throwable {
		//3단계. 모델을 사용하여 요청한 기능을 수행한다.
		request.setCharacterEncoding("UTF-8");
		 
		 //reg_date
		LogonDataBean dto = new LogonDataBean();
		dto.setId(request.getParameter("id"));
		dto.setPasswd(request.getParameter("passwd"));
		dto.setName(request.getParameter("name"));
		dto.setJumin1(request.getParameter("jumin1"));
		dto.setJumin2(request.getParameter("jumin2"));
		dto.setTel(request.getParameter("tel"));
		dto.setEmail(request.getParameter("email"));
		dto.setReg_date(new Timestamp(System.currentTimeMillis()));
		// 방법 1
		// LogonDBBean regBean = new LogonDBBean();
		// int result = regBean.insertMember(dto);
		
		/* 방법 2.
		 * LogonDao가 인터페이스이므로 LogonDBBean에서 implements 한 후에
		 * 다형성을 적용해서 부모타입으로 사용할 수 있다.
		 * LogonDao logonDao = LogonDBBean.getInstance(); */
		
		LogonDao dao = LogonDBBean.getInstance();
		int result = dao.insertMember(dto);
		// 4단계. request나 session에 처리결과를 저장한다.
		
		// 5단계. 이동할 뷰페이지(jsp)를 리턴한다.
		return "/member/inputPro.jsp";
	}

}
