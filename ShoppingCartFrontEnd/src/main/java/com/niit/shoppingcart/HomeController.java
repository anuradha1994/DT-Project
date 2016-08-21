package com.niit.shoppingcart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {
	
	@RequestMapping("/")
	public String homepage()
	{
		return "INDEX";
	}
	
	
	/*//If you want to navigate to other page with carrying the data
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView("/Home");
		mv.addObject("message","Thank you for visiting the URL");
		return mv;
	}
	@RequestMapping("/Registration")
	public ModelAndView Register()
	{
		ModelAndView mv=new ModelAndView("Registration");
		mv.addObject("user click register here", "true");
		return mv;
	}
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView mv=new ModelAndView("login");
		mv.addObject("user click login here", "true");
		return mv;
	}*/
	
	}



