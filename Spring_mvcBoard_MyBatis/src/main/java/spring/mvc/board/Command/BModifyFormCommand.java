package spring.mvc.board.Command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public class BModifyFormCommand implements BCommand {

	@Override
	public String execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request"); 
		
		int num = Integer.parseInt(request.getParameter("num"));
		String pageNum = request.getParameter("pageNum");
		
		model.addAttribute("num", num);
		model.addAttribute("pageNum", pageNum);
		
		return "board/modifyForm";
	}
}
