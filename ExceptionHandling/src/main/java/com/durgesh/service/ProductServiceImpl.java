package com.durgesh.service;

import org.springframework.stereotype.Service;

import com.durgesh.exception.NoProductFoundException;
import com.durgesh.model.Product;
@Service
public class ProductServiceImpl implements IProductService{

	@Override
	public Product findProductById(Integer pid) {
		// TODO Auto-generated method stub
		if(pid==101) {
			return new Product("101", "Dell 101", 35000.9);
		}else {
			throw new NoProductFoundException("Product Not Found");
		}
	}

}
