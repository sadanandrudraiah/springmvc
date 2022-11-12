package com.cruds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cruds.entity.User;

@Controller
public class UserController {

	@RequestMapping(value="/user", method=RequestMethod.GET)
	public String showForm(Model model)
	{
		model.addAttribute("command", new User());
		return "user";
	}

	@RequestMapping(value="/user", method=RequestMethod.POST)
	public String processForm(@ModelAttribute("user") User user)
	{
		System.out.println(user);
		// call service & dao
		return "redirect:user.html";
	}
	
	
}
