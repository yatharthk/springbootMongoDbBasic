package com.example.springBootMongo.demo;

import com.example.springBootMongo.demo.DTO.CustomerDTO;
import com.example.springBootMongo.demo.service.CustomerService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SpringDataMongoDbApplication implements CommandLineRunner{
	static Logger logger = Logger.getLogger(SpringDataMongoDbApplication.class);
	@Autowired
	CustomerService service;
	public static void main(String[] args) {
		SpringApplication.run(SpringDataMongoDbApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {

		CustomerDTO customer1=new CustomerDTO(785671000L, "Alex",27, 'M', "Alberta");
		CustomerDTO customer2=new CustomerDTO(785671001L, "Susan",27, 'F', "Chicago");
		// Invoking Service layer method to insert Customer details into
		// Customer table
		service.insertCustomer(customer1);
		service.insertCustomer(customer2);

		logger.info("Added Customers successfully");
		System.out.println("Enter the Customer Phone Number to be deleted");
		Scanner scanner = new Scanner(System.in);
		Long phoneNo = scanner.nextLong();
		// Invoking Service layer method to remove Customer details from
		// Customer table
		service.removeCustomer(phoneNo);
		logger.info("Customer removed successfully");
		scanner.close();
	}
}
