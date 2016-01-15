package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.javalec.ex.dto.TestDTO;

/*
 * 1. 컨트롤러 클래스 제작
 * (1) 과정
 * 	최초 클라이언트로부터 요청이 들어왔을 때, DispatcherServlet을 통해 컨트롤러로 진입하게 된다.
 * 	그리고 컨트롤러는 요청에 대한 작업을 한 후 view 쪽으로 데이터를 전달한다.
 * (2) 컨트롤러 클래스 제작 순서
 * 	ㄱ. @Controller를 이용한 클래스 생성
 * 	ㄴ. @RequestMapping을 이용한 요청경로 지정
 * 	ㄷ. 요청처리 메소드 구현
 * 	ㄹ. view 이름 리턴
 * 
 * 가장 중요한 점은 컨트롤러에서 로직을 수행한 다음 해당 View를 정확하게 찾아갈 수 있게 해야 한다.
 * 
 * 2. 요청처리 메소드 제작
 * 	클라이언트의 요청을 처리할 메소드를 제작한다.
 * 3. View에 데이터를 전달
 * 	컨트롤러에서 로직 수행 후 View 페이지를 반환한다. 이 때 View에서 사용하게 될 데이터를 객체로 전달할 수 있다.
 * 	방법1. Model 클래스를 이용한 데이터 전달
 * 	방법2. Model And View 클래스를 이용한 데이터 전달 방법
 */
@Controller
public class MyController {
	
	@RequestMapping("/test/view")
	public String view() {
		
		return "/test/view"; // View 페이지 이름을 리턴
	}
	
	// 방법1. Model 클래스를 이용한 데이터 전달
	@RequestMapping("/test/content")
	public String content(Model model) { // Model 객체를 파라미터로 받음
		/*
		 * Model : 컨트롤러에서 뷰쪽으로 데이터를 줄 때 데이터를 가지고 있는 객체이다.
		 * 		   컨트롤러에서 뷰를 찾아갈 때 모델 객체를 같이 가지고 찾아간다.
		 * JSP 페이지에서 모델에 있는 데이터를 꺼내서 쓸 수 있다. 예)${id}
		 */
		
		// 뷰쪽으로 넘기기 위해 모델 객체에 데이터를 받음
		model.addAttribute("id", "id로 입력된 값이 여기");
		model.addAttribute("password", "비밀번호임");
		model.addAttribute("name", "오승현");
		model.addAttribute("age", "27");
		model.addAttribute("occupation", "무직");
		model.addAttribute("whatiwantedtosay", "when i thought there should be changes to the world, i decided that i will be the one who changes it. ");
		return "/test/content"; //뷰페이지 이름을 리턴
	}
	
	// 방법2. ModelAdnView 클래스를 이용한 데이터 전달
	@RequestMapping("/test/reply")
	public ModelAndView reply() {
		ModelAndView mv = new ModelAndView();	// ModelAndView 객체 생성. Model과 View를 합친 객체
		mv.addObject("id", "id로 입력된 값이 여기");	//뷰쪽으로 넘기기 위해 Model 객체에 데이터를 담음
		mv.addObject("password", "비밀번호임");	//뷰 이름 설정
		mv.addObject("name", "오승현");
		mv.addObject("age", "27");
		mv.addObject("occupation", "무직");
		mv.setViewName("/test/reply");
		return mv;	// Model과 View를 같이 반환
	}
	/*
	 * Form 데이터
	 * 방법 1. HttpServletRequest 클래스를 이용해서 데이터 전솔
	 * 실행 : get방식 적용 : 예) http://localhost:8081/ex/test/confirmId?id=park&pwd=1234
	 * id = park, pwd=1234 정보가 HttpServletRequest로 들어간다.
	 */
	// 
	@RequestMapping("/test/confirmId")
	public String confirmId(HttpServletRequest httpServletRequest, Model model) {
		
		// HttpServletRequest : 클라이언트가 요청을 하면 Dispatcher에서 컨트롤러 쪽으로 데이터를 넘긴다.
		// 이 때 사용자가 요청한 데이터를 받는 객체이며, 사용자가 요청한 데이터가 들어있다.
		// Model : 컨트롤러에서 뷰 쪽으로 데이터를 줄 때 데이터를 가지고 있는 객체이다.
		String id = httpServletRequest.getParameter("id");
		String pwd = httpServletRequest.getParameter("pwd");
		model.addAttribute("id", id);
		model.addAttribute("pwd", pwd);
		
		return "/test/confirmId";
	}
	
	@RequestMapping("/test/list")
	public String list(HttpServletRequest httpServletRequest, Model model) {
		
		String Num = httpServletRequest.getParameter("Num");
		String id = httpServletRequest.getParameter("id");
		String title = httpServletRequest.getParameter("title");
		String content = httpServletRequest.getParameter("content");
		String email = httpServletRequest.getParameter("email");
		model.addAttribute("Num", Num);
		model.addAttribute("id", id);
		model.addAttribute("title", title);
		model.addAttribute("content", content);
		model.addAttribute("email", email);
		return "/test/list";
	}
	
	/*
	 * 방법2. @RequestParam 어노테이션을 이용해서 데이터 전솔
	 */
	@RequestMapping("/test/checkId")
	public String checkId(@RequestParam("id") String id,
			@RequestParam("pwd") String pwd, Model model) { //이거 해주면 앞 페이지에서 무조건 parameter 값을 받아와야 페이지가 열림
		
		model.addAttribute("id", id);
		model.addAttribute("pwd", pwd);
		return "/test/checkId";
	}
	
	/*
	 * 방법3. 데이터(커맨드) 객체를 이용하여 데이터 전송
	 */
	@RequestMapping("/test/command")
	public String getCommand(TestDTO dto) {
		return "/test/command";
	}
}
