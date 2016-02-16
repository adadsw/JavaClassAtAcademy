package spring.mvc.bms.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.bms.command.LoginFormHandler;
import spring.mvc.bms.command.LoginProHandler;
import spring.mvc.bms.command.LogoutHandler;
import spring.mvc.bms.command.guest.GuestBookPurchaseFormHandler;
import spring.mvc.bms.command.guest.GuestBookPurchaseHandler;
import spring.mvc.bms.command.guest.GuestBookPurchaseProHandler;
import spring.mvc.bms.command.guest.GuestRefundHandler;
import spring.mvc.bms.command.guest.GuestRefundProHandler;
import spring.mvc.bms.command.host.HostBookAddFormHandler;
import spring.mvc.bms.command.host.HostBookAddProHandler;
import spring.mvc.bms.command.host.HostBookDeleteProHandler;
import spring.mvc.bms.command.host.HostBookManagementHandler;
import spring.mvc.bms.command.host.HostBookModifyFormHandler;
import spring.mvc.bms.command.host.HostBookModifyProHandler;
import spring.mvc.bms.command.host.HostOrderManagementHandler;

@Controller
public class BMSController {
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

	@Autowired
	LoginProHandler loginProHandler;
	
	@RequestMapping("loginPro")
	public String loginPro(HttpServletRequest request) {
		System.out.println("loginPro");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		String viewName = loginProHandler.execute(mv);

		mv.setViewName(viewName);
		return viewName;
	}
	
	@Autowired
	HostBookManagementHandler hostBookManagementHandler;
	@RequestMapping("hostBookManagement")
	public ModelAndView hostBookManagement(HttpServletRequest request) {
		System.out.println("hostBookManagement");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		String viewName = hostBookManagementHandler.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	
	@Autowired
	HostOrderManagementHandler hostOrderManagementHandler;
	@RequestMapping("hostOrderManagement")
	public ModelAndView hostOrderManagement(HttpServletRequest request) {
		System.out.println("hostOrderManagement");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		String viewName = hostOrderManagementHandler.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	
	@Autowired
	HostBookAddFormHandler hostBookAddFormHandler;
	@RequestMapping("hostBookAddForm")
	public ModelAndView hostBookAddForm(HttpServletRequest request) {
		System.out.println("hostBookAddForm");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		String viewName = hostBookAddFormHandler.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	
	@Autowired
	HostBookAddProHandler hostBookAddProHandler;
	@RequestMapping("hostBookAddPro")
	public ModelAndView hostBookAddPro(HttpServletRequest request) {
		System.out.println("hostBookAddPro");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		String viewName = hostBookAddProHandler.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	
	@Autowired
	HostBookDeleteProHandler hostBookDeleteProHandler;
	@RequestMapping("hostBookDeletePro")
	public ModelAndView hostBookDeletePro(HttpServletRequest request) {
		System.out.println("hostBookDeletePro");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		String viewName = hostBookDeleteProHandler.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	
	@Autowired
	HostBookModifyFormHandler hostBookModifyFormHandler;
	@RequestMapping("hostBookModifyForm")
	public ModelAndView hostBookModifyForm(HttpServletRequest request) {
		System.out.println("hostBookModifyForm");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		String viewName = hostBookModifyFormHandler.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	
	@Autowired
	HostBookModifyProHandler hostBookModifyProHandler;
	@RequestMapping("hostBookModifyPro")
	public ModelAndView hostBookModifyPro(HttpServletRequest request) {
		System.out.println("hostBookModifyPro");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		String viewName = hostBookModifyProHandler.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	
	@Autowired
	GuestBookPurchaseHandler guestBookPurchaseHandler;
	@RequestMapping("guestBookPurchase")
	public ModelAndView guestBookPurchase(HttpServletRequest request) {
		System.out.println("guestBookPurchase");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		String viewName = guestBookPurchaseHandler.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	
	@Autowired
	GuestBookPurchaseFormHandler guestBookPurchaseFormHandler;
	@RequestMapping("guestBookPurchaseForm")
	public ModelAndView guestBookPurchaseForm(HttpServletRequest request) {
		System.out.println("guestBookPurchaseForm");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		String viewName = guestBookPurchaseFormHandler.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	
	@Autowired
	GuestBookPurchaseProHandler guestBookPurchaseProHandler;
	@RequestMapping("guestBookPurchasePro")
	public ModelAndView guestBookPurchasePro(HttpServletRequest request) {
		System.out.println("guestBookPurchasePro");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		String viewName = guestBookPurchaseProHandler.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	
	@Autowired
	GuestRefundProHandler guestRefundProHandler;
	@RequestMapping("guestRefundPro")
	public ModelAndView guestRefundPro(HttpServletRequest request) {
		System.out.println("guestRefundPro");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		String viewName = guestRefundProHandler.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	@Autowired
	GuestRefundHandler guestRefundHandler;
	@RequestMapping("guestRefund")
	public ModelAndView guestRefund(HttpServletRequest request) {
		System.out.println("guestRefund");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		String viewName = guestRefundHandler.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
	
	@Autowired
	LogoutHandler logoutHandler;
	@RequestMapping("logout")
	public ModelAndView logout(HttpServletRequest request) {
		System.out.println("logout");
		ModelAndView mv = new ModelAndView();
		mv.addObject("request", request);
		
		String viewName = logoutHandler.execute(mv);

		mv.setViewName(viewName);
		return mv;
	}
}
