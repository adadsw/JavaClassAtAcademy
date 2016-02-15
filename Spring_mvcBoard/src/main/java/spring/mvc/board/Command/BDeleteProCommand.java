package spring.mvc.board.Command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import spring.mvc.board.dao.BDao;
import spring.mvc.board.dao.IDao;

public class BDeleteProCommand implements BCommand {

	@Override
	public String execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		int num = Integer.parseInt(request.getParameter("num"));
		String passwd = request.getParameter("passwd");
		String pageNum = request.getParameter("pageNum");
		
		IDao dao = BDao.getInstance();
		int resultPasswd = dao.check(num, passwd);
		
		if (resultPasswd == 1) { //비밀번호가 같은 경우 그라믄 지우기 시도해야지.
			int result = dao.deleteArticle(num);	// result 1 은 삭제 성공 => list, 0이면 삭제실패, -1답글 있어서 실패
			model.addAttribute("result", result);
			System.out.println(result);
		} //비밀번호가 다른 경우 삭제 에러 메시지
		
		model.addAttribute("resultPasswd", resultPasswd);
		model.addAttribute("pageNum", pageNum);
		System.out.println(resultPasswd);

		return "board/deletePro";
	}
}
