package spring.mvc.ajaxEx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AjaxController {

	@RequestMapping("/simple")
	public String simple(Model model) {
		System.out.println("simple()");
		String viewName = "simple/simple";
		
		return viewName;
	}
	
	@RequestMapping("/responseNews")
	public String responseNews(Model model) {
		System.out.println("responseNews()");
		String viewName = "news/responseNews";
		
		return viewName;
	}
	
	@RequestMapping("/news1")
	public String news1(Model model) {
		System.out.println("news1()");
		String viewName = "news/news1";
		
		return viewName;
	}
	
	@RequestMapping("/news2")
	public String news2(Model model) {
		System.out.println("news2()");
		String viewName = "news/news2";
		
		return viewName;
	}
	
	@RequestMapping("/news3")
	public String news3(Model model) {
		System.out.println("news3()");
		String viewName = "news/news3";
		
		return viewName;
	}
	
	@RequestMapping("/colorName")
	public String colorName(Model model) {
		System.out.println("colorName()");
		String viewName = "colorName";
		
		return viewName;
	}
	
	@RequestMapping("/color")
	public String color(Model model) {
		System.out.println("color()");
		String viewName = "color/color";
		
		return viewName;
	}
	
	@RequestMapping("/responseColor")
	public String responseColor(Model model) {
		System.out.println("responseColor()");
		String viewName = "color/responseColor";
		
		return viewName;
	}
	
	@RequestMapping("/book")
	public String book(Model model) {
		System.out.println("book()");
		String viewName = "book/book";
		
		return viewName;
	}
	
	@RequestMapping("/responseBook")
	public String responseBook(Model model) {
		System.out.println("responseBook()");
		String viewName = "book/responseBook";
		
		return viewName;
	}
	@RequestMapping("/suggestion")
	public String suggestion(Model model) {
		System.out.println("suggestion()");
		String viewName = "search/suggestion";
		
		return viewName;
	}
	@RequestMapping("/suggest")
	public String suggest(Model model) {
		System.out.println("suggestion()");
		String viewName = "search/suggest";
		
		return viewName;
	}

}
