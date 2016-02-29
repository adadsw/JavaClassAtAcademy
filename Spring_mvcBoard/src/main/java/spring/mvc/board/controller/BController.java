package spring.mvc.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mvc.board.Command.*;

@Controller
public class BController {

	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model) {
		System.out.println("list()");
		model.addAttribute("request", request);
		
		BCommand command = new BListCommand();
		String viewName = command.execute(model);
		
		return viewName;
	}
	
	@RequestMapping("/writeForm")
	public String writeForm(HttpServletRequest request, Model model) {
		System.out.println("writeForm()");
		
		model.addAttribute("request", request);
		BCommand command = new BWriteFormCommand();
		String viewName = command.execute(model);
		
		return viewName;
	}
	
	@RequestMapping("/writePro")
	public String writePro(HttpServletRequest request, Model model) {
		System.out.println("writePro()");
		
		model.addAttribute("request", request);
		BCommand command = new BWriteProCommand();
		String viewName = command.execute(model);
		return viewName;
	}
	
	
	
	@RequestMapping("/contentForm")
	public String contentForm(HttpServletRequest request, Model model) {
		System.out.println("contentForm()");
		model.addAttribute("request", request);
		
		BCommand command = new BContentFormCommand();
		String viewName = command.execute(model);
		
		return viewName;	
	}
	
	@RequestMapping("deleteForm")
	public String deleteForm(HttpServletRequest request, Model model) {
		System.out.println("deleteForm()");
		model.addAttribute("request", request);
		
		BCommand command = new BDeleteFormCommand();
		String viewName = command.execute(model);
		
		return viewName;
	}
	
	@RequestMapping("deletePro")
	public String deletePro(HttpServletRequest request, Model model) {
		System.out.println("deletePro()");
		model.addAttribute("request", request);
		
		BCommand command = new BDeleteProCommand();
		String viewName = command.execute(model);
		System.out.println(viewName);

		return viewName;	
	}
	
	@RequestMapping("modifyForm")
	public String modifyForm(HttpServletRequest request, Model model) {
		System.out.println("modifyForm()");
		model.addAttribute("request", request);
		
		BCommand command = new BModifyFormCommand();
		String viewName = command.execute(model);
		
		return viewName;
	}
	
	@RequestMapping("modifyView")
	public String modifyView(HttpServletRequest request, Model model) {
		System.out.println("modifyView()");
		model.addAttribute("request", request);
		
		BCommand command = new BModifyViewCommand();
		String viewName = command.execute(model);
		
		return viewName;
	}
	
	@RequestMapping("modifyPro")
	public String modifyPro(HttpServletRequest request, Model model) {
		System.out.println("modifyView()");
		model.addAttribute("request", request);
		
		BCommand command = new BModifyProCommand();
		String viewName = command.execute(model);
		
		return viewName;
	}
}
