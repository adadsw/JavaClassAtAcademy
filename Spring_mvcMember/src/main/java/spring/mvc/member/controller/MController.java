package spring.mvc.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.member.command.*;

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
	public String inputPro(HttpServletRequest request) {
		System.out.println("inputPro()");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		MCommand command = new InputProHandler();
		String viewName = command.execute(mv);
		
//		mv.setViewName(viewName);
		return viewName;
	}

	@RequestMapping("/confirmId")
	public String confirmId(HttpServletRequest request) {
		System.out.println("confirmId()");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		MCommand command = new ConfirmIdHandler();
		String viewName = command.execute(mv);
		
//		mv.setViewName(viewName);
		return viewName;
	}
	
	@RequestMapping("/loginForm")
	public String loginForm(HttpServletRequest request) {
		System.out.println("loginForm()");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		MCommand command = new LoginFormHandler();
		String viewName = command.execute(mv);
		
		return viewName;
	}
	
	@RequestMapping("/loginPro")
	public String loginPro(HttpServletRequest request) {
		System.out.println("loginPro()");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		MCommand command = new LoginProHandler();
		String viewName = command.execute(mv);
		
		return viewName;
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletRequest request) {
		System.out.println("logout()");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		MCommand command = new LogoutHandler();
		String viewName = command.execute(mv);
		
		mv.setViewName(viewName);
		return mv;
	}
	
	@RequestMapping("/deleteForm")
	public String deleteForm(HttpServletRequest request) {
		System.out.println("deleteForm()");
		return "member/deleteForm";
	}
	
	@RequestMapping("/deletePro")
	public ModelAndView deletePro(HttpServletRequest request) {
		System.out.println("deletePro()");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		MCommand command = new DeleteProHandler();
		String viewName = command.execute(mv);
		
		mv.setViewName(viewName);
		return mv;
	}
	
	@RequestMapping("/modifyForm")
	public String modifyForm(HttpServletRequest request) {
		System.out.println("modifyForm()");
		return "member/modifyForm";
	}
	
	@RequestMapping("/modifyView")
	public ModelAndView modifyView(HttpServletRequest request) {
		System.out.println("modifyView()");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		MCommand command = new ModifyViewHandler();
		String viewName = command.execute(mv);
				
		mv.setViewName(viewName);
		return mv;
	}
	
	@RequestMapping("/modifyPro")
	public ModelAndView modifyPro(HttpServletRequest request) {
		System.out.println("modifyPro()");
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		MCommand command = new ModifyProHandler();
		String viewName = command.execute(mv);
		
		mv.setViewName(viewName);
		return mv;
	}
}
