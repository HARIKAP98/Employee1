package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


///welcome => "Welcome to Employee page"
@Controller
public class WelcomeController {

	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String welcomePage()
	{
		return "welcome";
	}
	
	@RequestMapping(value="/welcome", method=RequestMethod.POST)
	public String employeesPage()
	{
		return "list-employees";
	}
} 

// kill $(lsof -ti:1024)