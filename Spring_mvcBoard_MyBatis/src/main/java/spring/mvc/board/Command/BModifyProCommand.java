package spring.mvc.board.Command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import spring.mvc.board.dao.IDao;
import spring.mvc.board.dto.BDto;

@Service("bModifyProCommand")
public class BModifyProCommand implements BCommand {

	@Autowired
	IDao dao;
	
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
		
//		IDao dao = BDao.getInstance();
		int result = dao.updateArticle(dto);
		
		model.addAttribute("result", result);
		model.addAttribute("pageNum", pageNum);
		return "board/modifyPro";
	}

}
