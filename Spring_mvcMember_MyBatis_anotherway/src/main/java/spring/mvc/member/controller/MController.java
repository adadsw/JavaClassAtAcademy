package spring.mvc.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mvc.member.command.*;

@Controller
public class MController {

	@RequestMapping("/main")
	public String main() {
		System.out.println("main()");
		return "member/main";
	}

	@RequestMapping("/inputForm")
	public String inputForm() {
		System.out.println("inputForm()");
		return "member/inputForm";
	}

	@Autowired
	InputProHandler inputProHandler;

	@RequestMapping("/inputPro")
	public String inputPro(HttpServletRequest request, Model model) {
		System.out.println("inputPro()");
		model.addAttribute("request", request);

		// MCommand command = new InputProHandler();
		String viewName = inputProHandler.execute(model);

		return viewName;
	}

	@Autowired
	ConfirmIdHandler confirmIdHandler;

	@RequestMapping("/confirmId")
	public String confirmId(HttpServletRequest request, Model model) {
		System.out.println("confirmId()");

		model.addAttribute("request", request);

		// MCommand command = new ConfirmIdHandler();
		// String viewName = command.execute(mv);
		// ConfirmIdHandler command = new ConfirmIdHandler();

		String viewName = confirmIdHandler.execute(model);
		// mv.setViewName(viewName);
		return viewName;
	}

	@Autowired
	LoginFormHandler loginFormHandler;

	@RequestMapping("/loginForm")
	public String loginForm(HttpServletRequest request, Model model) {
		System.out.println("loginForm()");

		model.addAttribute("request", request);

		// MCommand command = new LoginFormHandler();
		String viewName = loginFormHandler.execute(model);

		return viewName;
	}

	@Autowired
	LoginProHandler loginProHandler;

	@RequestMapping("/loginPro")
	public String loginPro(HttpServletRequest request, Model model) {
		System.out.println("loginPro()");

		model.addAttribute("request", request);

		// MCommand command = new LoginProHandler();
		String viewName = loginProHandler.execute(model);

		return viewName;
	}

	@Autowired
	LogoutHandler logoutHandler;

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request, Model model) {
		System.out.println("logout()");

		model.addAttribute("request", request);

		// MCommand command = new LogoutHandler();
		String viewName = logoutHandler.execute(model);

		return viewName;
	}

	@RequestMapping("/deleteForm")
	public String deleteForm(HttpServletRequest request) {
		System.out.println("deleteForm()");
		return "member/deleteForm";
	}

	@Autowired
	DeleteProHandler deleteProHandler;

	@RequestMapping("/deletePro")
	public String deletePro(HttpServletRequest request, Model model) {
		System.out.println("deletePro()");

		model.addAttribute("request", request);

		// MCommand command = new DeleteProHandler();
		String viewName = deleteProHandler.execute(model);

		return viewName;
	}

	@RequestMapping("/modifyForm")
	public String modifyForm(HttpServletRequest request) {
		System.out.println("modifyForm()");
		return "member/modifyForm";
	}

	@Autowired
	ModifyViewHandler modifyViewHandler;

	@RequestMapping("/modifyView")
	public String modifyView(HttpServletRequest request, Model model) {
		System.out.println("modifyView()");

		model.addAttribute("request", request);

		// MCommand command = new ModifyViewHandler();
		String viewName = modifyViewHandler.execute(model);

		return viewName;
	}

	@Autowired
	ModifyProHandler modifyProHandler;

	@RequestMapping("/modifyPro")
	public String modifyPro(HttpServletRequest request, Model model) {
		System.out.println("modifyPro()");

		model.addAttribute("request", request);

		// MCommand command = new ModifyProHandler();
		String viewName = modifyProHandler.execute(model);

		return viewName;
	}
}
