package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class MyController2 {
	
	@RequestMapping("/view2")	// /test + /view2 = /test/view2
	public String view2() {
		return "/test/view2";
	}
}
