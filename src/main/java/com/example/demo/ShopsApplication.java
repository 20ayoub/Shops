package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@EnableMongoRepositories(basePackages = {"com.example.mongoRepository"})
public class ShopsApplication /* implements CommandLineRunner */ {

/*	@Autowired
	private ShopsRepository mongop;  */
	
	public static void main(String[] args) {
		SpringApplication.run(ShopsApplication.class, args);
	}

	/*@Override
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
