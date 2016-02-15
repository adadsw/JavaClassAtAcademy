package spring.mvc.board.Command;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import spring.mvc.board.dao.IDao;
import spring.mvc.board.dto.BDto;

@Service("bModifyViewCommand")
public class BModifyViewCommand implements BCommand {

	@Autowired
	IDao dao;
	
	@Override
	public String execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		int num = Integer.parseInt(request.getParameter("num"));
		String pageNum = request.getParameter("pageNum");
		String passwd = request.getParameter("passwd");
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("num", num);
		map2.put("passwd", passwd);
		
//		IDao dao = BDao.getInstance();
		int result = dao.check(map2);
		
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
