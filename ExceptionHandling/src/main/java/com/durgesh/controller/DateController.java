package com.durgesh.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	
	@RequestMapping(value="/date")
	public String displayDate(Model model) {
		model.addAttribute("date", "Today's date is : " +new Date());
		
		String str=null;
		str.length();
		
		return "dateDisplay";
		
	}

}
