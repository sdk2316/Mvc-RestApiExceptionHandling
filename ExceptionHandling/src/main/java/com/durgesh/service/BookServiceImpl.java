package com.durgesh.service;

import org.springframework.stereotype.Service;

import com.durgesh.exception.NoBookFoundException;
@Service
public class BookServiceImpl implements IBookService{

	@Override
	public Double findPriceById(String bookId) {
		// TODO Auto-generated method stub
		
		if(bookId.equals("B101")) {
			return 459.00;
		}else {
			// this will display on console, and we will write same exception to show msg to client at global exception handle class
			throw new NoBookFoundException("No Book found with given id");
		}
		
	}

}
