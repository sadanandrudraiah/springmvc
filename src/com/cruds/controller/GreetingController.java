package com.cruds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

	@RequestMapping(value="/greet", method=RequestMethod.POST)
	public ModelAndView greet(@RequestParam("greeting") String greeting)
	{
		String finalMessage = "Hello " + greeting;
		return new ModelAndView("welcome", "FINALMSG", finalMessage);
	}
	
}
