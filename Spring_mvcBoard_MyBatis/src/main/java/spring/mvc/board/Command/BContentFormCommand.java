package spring.mvc.board.Command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import spring.mvc.board.dao.IDao;
import spring.mvc.board.dto.BDto;

@Service("bContentFormCommand")
public class BContentFormCommand implements BCommand {

	@Autowired
	IDao dao;

	@Override
	public String execute(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		int num = Integer.parseInt(request.getParameter("num"));
		String pageNum = request.getParameter("pageNum");
		String number = request.getParameter("number");

		// IDao dao = BDao.getInstance();
		BDto dto = dao.getArticle(num);

		// 내가 쓴 글이 아닌 것만 조회수 증가
		if (!request.getRemoteAddr().equals(dto.getIp())) {
			dao.addCount(num);
		}

		model.addAttribute("pageNum", pageNum);
		model.addAttribute("number", number);
		model.addAttribute("dto", dto);

		return "board/contentForm";
	}

}
