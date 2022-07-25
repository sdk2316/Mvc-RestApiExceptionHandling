package com.durgesh.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
//this is global exception handler for all controller
public class MvcExceptionHandler {
	
	@ExceptionHandler(value=NullPointerException.class)
	public String handleNullPointerException(Model model) {
		
		 model.addAttribute("errMsg", "Some Problem occurs . Please try Again After Sometime...");
		
		return "error";
	}
	
	@ExceptionHandler(value=NoBookFoundException.class)
	public String handleNoBookFoundException(Model model) {
		
		// model.addAttribute("errMsg", "Some Problem occurs . Please try Again After Sometime...");
		
		return "errorMessage";
	}


}
