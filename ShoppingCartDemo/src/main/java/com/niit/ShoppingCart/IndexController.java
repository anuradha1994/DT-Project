package com.niit.ShoppingCart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/")
public class IndexController {
	
	public String getPage(){
		return "index";
	}

}
