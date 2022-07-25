package com.durgesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.durgesh.model.Product;
import com.durgesh.service.IProductService;

@RestController
public class RestApiProductController {
	
	@Autowired
	private IProductService prodcut;
	
	//http://localhost:9800/product?pid=101
	//@GetMapping("/product")
	@GetMapping(value="/product",produces= {"application/json"})
	public Product getProduct(@RequestParam("pid") Integer pid) {
		
		return  prodcut.findProductById(pid);
	}

}
