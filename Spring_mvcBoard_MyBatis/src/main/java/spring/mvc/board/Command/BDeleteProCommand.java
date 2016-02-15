package spring.mvc.board.Command;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import spring.mvc.board.dao.IDao;

@Service("BDeleteProCommand")
public class BDeleteProCommand implements BCommand {

	@Autowired
	IDao dao;
	
	@Override
	public String execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		int num = Integer.parseInt(request.getParameter("num"));
		String passwd = request.getParameter("passwd");
		String pageNum = request.getParameter("pageNum");
		
//		IDao dao = BDao.getInstance();
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("num", num);
		map2.put("passwd", passwd);
		
		int resultPasswd = dao.check(map2);
		
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
