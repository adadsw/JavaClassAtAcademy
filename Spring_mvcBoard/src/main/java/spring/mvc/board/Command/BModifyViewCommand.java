package spring.mvc.board.Command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import spring.mvc.board.dao.BDao;
import spring.mvc.board.dao.IDao;
import spring.mvc.board.dto.BDto;

public class BModifyViewCommand implements BCommand {

	@Override
	public String execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		int num = Integer.parseInt(request.getParameter("num"));
		String pageNum = request.getParameter("pageNum");
		String passwd = request.getParameter("passwd");
		
		IDao dao = BDao.getInstance();
		int result = dao.check(num, passwd);
		
		if (result == 1) {
			BDto dto = new BDto();
			dto = dao.getArticle(num);
			model.addAttribute("dto", dto);
		}

		model.addAttribute("result", result);
		model.addAttribute("num", num);
		model.addAttribute("pageNum", pageNum);
		
		return "board/modifyView";
	}
}
