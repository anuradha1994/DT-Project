package com.niit.shoppingcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {
	
	@RequestMapping("/")
	public String homepage()
	{
		return "INDEX";
	}
	
	
	/*@RequestMapping("/loginPage")
	public String loginpage()
	{
		return "login";
	}*/
	/*@RequestMapping("/login1")
	public String loginpage1()
	{
		return "login";
	}*/
	

	
	
	/*@RequestMapping("/RegisterPage")
	public String homepage2()
	{
		return "INDEX";
	}*/
	
	/*@RequestMapping("/Register")
	public String homepage1()
	{
		return "Register";
	}*/
	/*
	@RequestMapping("/login")
    public String login(@RequestParam(value="error", required = false) String error, @RequestParam(value="logout",
            required = false) String logout, Model model) {
        if (error!=null) {
            model.addAttribute("error", "Invalid username and password");
       return "login";
        }
        model.addAttribute("msg", "User logged in successfully");
       return "INDEX";//return to landing page
        

       
    }
*/	/*//If you want to navigate to other page with carrying the data
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



