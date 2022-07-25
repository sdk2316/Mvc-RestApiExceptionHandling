package com.durgesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping(value="/user")
	public String getUser(Model model) {
		model.addAttribute("user", "welcome to exxception handling");
		
		String str=null;
		str.length();
		
		return "user";
	}
	
	//controller base handling
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Model model) {
		
		 model.addAttribute("errMsg", "Sometging went wrong. Please try After Sometime...");
		 
		 return "error";
		
	}

}
