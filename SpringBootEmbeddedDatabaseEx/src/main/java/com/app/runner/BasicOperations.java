package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repository.ProductRepository;

@Component
public class BasicOperations implements CommandLineRunner {

	@Autowired
	private ProductRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
	          repository.save( new Product("PEN",10.10));
	          repository.save( new Product("PENCIL",11.10));
	          repository.save( new Product("PAPER",12.10));
	          
	          repository.findAll().forEach(System.out::println);
	          
	          System.exit(0);
	          
	}
	
}
