package com.cruds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public String sayHello(Model model)
	{
		String info = "Hello from Spring MVC";
		model.addAttribute("MSG", info);
		return "home";
	}
	
	
/*	@RequestMapping("/hello")
	public ModelAndView hello()
	{
		String info = "Hello from Spring MVC";
		return new ModelAndView("home", "MSG", info);
	}*/
	
}
