package com.gyojincompany.home;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/")
	public String home() {
		return "index";
	}
	
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/content")
	public String content(Model model) {
		
		TestDto dto1 = new TestDto("Kim", 27);
		
		TestDto dto2 = new TestDto();
		dto2.setName("hong");
		dto2.setAge(32);
		
		model.addAttribute("dto1", dto1);
		model.addAttribute("dto2", dto2);
		
		return "content";
	}
	

}
