package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.model.Shop;
import com.example.mongoRepository.ShopsRepository;


@SpringBootApplication
@EnableMongoRepositories(basePackages = {"com.example.mongoRepository"})
@ComponentScan(basePackages = "com.example.controller.Control.class" )

public class ShopsApplication /* implements CommandLineRunner */ {

/*	@Autowired
	private ShopsRepository mongop;  */
	
	public static void main(String[] args) {
		SpringApplication.run(ShopsApplication.class, args);
	}

/*	@Override
	public void run(String... arg0) throws Exception {
		// find all simple document in DB
		// fetch all customers
				System.out.println("Customers found with findAll():");
				System.out.println("-------------------------------");
				for (Shop customer : mongop.findAll()) {
					System.out.println(customer);
				}
		
	} */
}
