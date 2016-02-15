package spring.mvc.bms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.*;
import spring.mvc.bms.command.guest.*;
import spring.mvc.bms.command.host.*;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@RequestMapping("loginForm")
	public ModelAndView loginForm(HttpServletRequest request) {
		System.out.println("loginForm");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);

		LoginFormHandler command = new LoginFormHandler();
		String viewName = command.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}

	@RequestMapping("loginPro")
	public ModelAndView loginPro(HttpServletRequest request, Model model) {
		System.out.println("loginPro");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		LoginProHandler command = new LoginProHandler();
		String viewName = command.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	@RequestMapping("hostBookManagement")
	public ModelAndView hostBookManagement(HttpServletRequest request, Model model) {
		System.out.println("hostBookManagement");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		HostBookManagementHandler command = new HostBookManagementHandler();
		String viewName = command.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	@RequestMapping("hostOrderManagement")
	public ModelAndView hostOrderManagement(HttpServletRequest request, Model model) {
		System.out.println("hostOrderManagement");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		HostOrderManagementHandler command = new HostOrderManagementHandler();
		String viewName = command.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	@RequestMapping("hostBookAddForm")
	public ModelAndView hostBookAddForm(HttpServletRequest request, Model model) {
		System.out.println("hostBookAddForm");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		HostBookAddFormHandler command = new HostBookAddFormHandler();
		String viewName = command.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	@RequestMapping("hostBookAddPro")
	public ModelAndView hostBookAddPro(HttpServletRequest request, Model model) {
		System.out.println("hostBookAddPro");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		HostBookAddProHandler command = new HostBookAddProHandler();
		String viewName = command.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	@RequestMapping("hostBookDeletePro")
	public ModelAndView hostBookDeletePro(HttpServletRequest request, Model model) {
		System.out.println("hostBookDeletePro");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		HostBookDeleteProHandler command = new HostBookDeleteProHandler();
		String viewName = command.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	@RequestMapping("hostBookModifyForm")
	public ModelAndView hostBookModifyForm(HttpServletRequest request, Model model) {
		System.out.println("hostBookModifyForm");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		HostBookModifyFormHandler command = new HostBookModifyFormHandler();
		String viewName = command.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	@RequestMapping("hostBookModifyPro")
	public ModelAndView hostBookModifyPro(HttpServletRequest request, Model model) {
		System.out.println("hostBookModifyPro");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		HostBookModifyProHandler command = new HostBookModifyProHandler();
		String viewName = command.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	@RequestMapping("guestBookPurchase")
	public ModelAndView guestBookPurchase(HttpServletRequest request, Model model) {
		System.out.println("guestBookPurchase");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		GuestBookPurchaseHandler command = new GuestBookPurchaseHandler();
		String viewName = command.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	@RequestMapping("guestBookPurchaseForm")
	public ModelAndView guestBookPurchaseForm(HttpServletRequest request, Model model) {
		System.out.println("guestBookPurchaseForm");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		GuestBookPurchaseFormHandler command = new GuestBookPurchaseFormHandler();
		String viewName = command.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	@RequestMapping("guestBookPurchasePro")
	public ModelAndView guestBookPurchasePro(HttpServletRequest request, Model model) {
		System.out.println("guestBookPurchasePro");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		GuestBookPurchaseProHandler command = new GuestBookPurchaseProHandler();
		String viewName = command.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	@RequestMapping("guestRefundPro")
	public ModelAndView guestRefundPro(HttpServletRequest request, Model model) {
		System.out.println("guestRefundPro");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		GuestRefundProHandler command = new GuestRefundProHandler();
		String viewName = command.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	@RequestMapping("guestRefund")
	public ModelAndView guestRefund(HttpServletRequest request, Model model) {
		System.out.println("guestRefund");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		GuestRefundHandler command = new GuestRefundHandler();
		String viewName = command.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	@RequestMapping("logout")
	public ModelAndView logout(HttpServletRequest request, Model model) {
		System.out.println("logout");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		LogoutHandler command = new LogoutHandler();
		String viewName = command.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
}
