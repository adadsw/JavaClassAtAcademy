package spring.mvc.board.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import spring.mvc.board.Command.*;

@Controller
public class BController {
	
	@Autowired
	BListCommand bListCommand;
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model) {
		System.out.println("list()");
		model.addAttribute("request", request);
		
//		BCommand command = new BListCommand();
		String viewName = bListCommand.execute(model);
		
		return viewName;
	}
	
	@Autowired
	BWriteFormCommand bWriteFormCommand;
	@RequestMapping("/writeForm")
	public String writeForm(HttpServletRequest request, Model model) {
		System.out.println("writeForm()");
		
		model.addAttribute("request", request);
//		BCommand command = new BWriteFormCommand();
		String viewName = bWriteFormCommand.execute(model);
		
		return viewName;
	}
	
	@Autowired
	BWriteProCommand bWriteProCommand;
	@RequestMapping("/writePro")
	public String writePro(HttpServletRequest request, Model model) {
		System.out.println("writePro()");
		
		model.addAttribute("request", request);
//		BCommand command = new BWriteProCommand();
		String viewName = bWriteProCommand.execute(model);
		return viewName;
	}
	
	@Autowired
	BContentFormCommand bContentFormCommand;
	@RequestMapping("/contentForm")
	public String contentForm(HttpServletRequest request, Model model) {
		System.out.println("contentForm()");
		model.addAttribute("request", request);
		
//		BCommand command = new BContentFormCommand();
		String viewName = bContentFormCommand.execute(model);
		
		return viewName;	
	}
	
	@Autowired
	BDeleteFormCommand bDeleteFormCommand;
	@RequestMapping("deleteForm")
	public String deleteForm(HttpServletRequest request, Model model) {
		System.out.println("deleteForm()");
		model.addAttribute("request", request);
		
		BCommand command = new BDeleteFormCommand();
		String viewName = command.execute(model);
		
		return viewName;
	}
	
	@Autowired
	BDeleteProCommand bDeleteProCommand;
	@RequestMapping("deletePro")
	public String deletePro(HttpServletRequest request, Model model) {
		System.out.println("deletePro()");
		model.addAttribute("request", request);
		
//		BCommand command = new BDeleteProCommand();
		String viewName = bDeleteProCommand.execute(model);
		System.out.println(viewName);

		return viewName;	
	}
	
	@Autowired
	BModifyFormCommand bModifyFormCommand;
	@RequestMapping("modifyForm")
	public String modifyForm(HttpServletRequest request, Model model) {
		System.out.println("modifyForm()");
		model.addAttribute("request", request);
		
//		BCommand command = new BModifyFormCommand();
		String viewName = bModifyFormCommand.execute(model);
		
		return viewName;
	}
	
	@Autowired
	BModifyViewCommand bModifyViewCommand;
	@RequestMapping("modifyView")
	public String modifyView(HttpServletRequest request, Model model) {
		System.out.println("modifyView()");
		model.addAttribute("request", request);
		
//		BCommand command = new BModifyViewCommand();
		String viewName = bModifyViewCommand.execute(model);
		
		return viewName;
	}
	
	@Autowired
	BModifyProCommand bModifyProCommand;
	@RequestMapping("modifyPro")
	public String modifyPro(HttpServletRequest request, Model model) {
		System.out.println("modifyPro()");
		model.addAttribute("request", request);
		
//		BCommand command = new BModifyProCommand();
		String viewName = bModifyProCommand.execute(model);
		
		return viewName;
	}
}
