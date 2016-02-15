package spring.mvc.board.Command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import spring.mvc.board.dao.BDao;
import spring.mvc.board.dao.IDao;
import spring.mvc.board.dto.BDto;

public class BModifyProCommand implements BCommand {

	@Override
	public String execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		BDto dto = new BDto();
		String pageNum = request.getParameter("pageNum");
		
		dto.setNum(Integer.parseInt(request.getParameter("num")));
		dto.setEmail(request.getParameter("email"));
		dto.setSubject(request.getParameter("subject"));
		dto.setContent(request.getParameter("content"));
		dto.setPasswd(request.getParameter("passwd"));
		
		IDao dao = BDao.getInstance();
		int result = dao.updateArticle(dto);
		
		model.addAttribute("result", result);
		model.addAttribute("pageNum", pageNum);
		return "board/modifyPro";
	}

}
