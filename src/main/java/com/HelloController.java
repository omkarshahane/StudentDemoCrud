package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String showIndexPage()
	{
		return "index";
		
	}
	
	@RequestMapping("/add")
	public String showAddStudPage()
	{
		return "AddStudent";
	}
	
	
	/*
	 * @RequestMapping("/viewStd") public String viewStudent() { return "ViewStud";
	 * }
	 */
	
	
	
	
}
