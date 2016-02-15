package spring.mvc.member.command;

import java.sql.Timestamp;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import spring.mvc.member.dao.LogonDao;
import spring.mvc.member.dto.LogonDataBean;

@Service("inputProHandler")
public class InputProHandler implements MCommand {

	@Autowired
	LogonDao logonDao;
	
	@Override
	public String execute(Model model) {

		Map<String, Object> map = model.asMap(); // model을 Map으로 변환
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		// 3단계. 모델을 사용하여 요청한 기능을 수행한다.
		// request.setCharacterEncoding("UTF-8");
		// reg_date
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

		/*
		 * 방법 2. LogonDao가 인터페이스이므로 LogonDBBean에서 implements 한 후에 다형성을 적용해서
		 * 부모타입으로 사용할 수 있다. LogonDao logonDao = LogonDBBean.getInstance();
		 */

		int result = logonDao.insertMember(dto);
		// 4단계. request나 session에 처리결과를 저장한다.
		model.addAttribute("result", result);
		// 5단계. 이동할 뷰페이지(jsp)를 리턴한다.
		return "member/inputPro";

	}

}
