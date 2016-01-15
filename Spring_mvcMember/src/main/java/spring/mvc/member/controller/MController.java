package spring.mvc.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.member.command.ConfirmIdHandler;
import spring.mvc.member.command.InputProHandler;
import spring.mvc.member.command.LoginFormHandler;
import spring.mvc.member.command.MCommand;

@Controller
public class MController {

	@RequestMapping("/main")
	public String main() {
		System.out.println("main");
		return "member/main";
	}

	@RequestMapping("/inputForm")
	public String inputForm() {
		System.out.println("inputForm()");
		return "member/inputForm";
	}

	@RequestMapping("/inputPro")
	public ModelAndView inputPro(HttpServletRequest request) {
		System.out.println("inputPro()");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		MCommand command = new InputProHandler();
		String viewName = command.execute(mv);
		
		mv.setViewName(viewName);
		return mv;
	}

	@RequestMapping("/confirmId")
	public ModelAndView confirmId(HttpServletRequest request) {
		System.out.println("confirmId()");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		MCommand command = new ConfirmIdHandler();
		String viewName = command.execute(mv);
		
		mv.setViewName(viewName);
		return mv;
	}
	
	@RequestMapping("/loginForm")
	public ModelAndView loginForm(HttpServletRequest request) {
		System.out.println("loginForm()");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		MCommand command = new LoginFormHandler();
		String viewName = command.execute(mv);
		
		mv.setViewName(viewName);
		return mv;
	}
}
