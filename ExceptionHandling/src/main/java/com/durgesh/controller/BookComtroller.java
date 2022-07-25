package com.durgesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.durgesh.service.IBookService;

@Controller
public class BookComtroller {
	
	@Autowired
	private IBookService bookService;
	
	//http://localhost:9800/findPriceById?bookId=B101
	
	@RequestMapping(value="/findPriceById")
	public String getPriceById(@RequestParam("bookId") String bookId,Model model) {
		
		Double bookPrice = bookService.findPriceById(bookId);
		model.addAttribute("price", "Book Price is "+bookPrice);
		return "book";
	}

}
