package com.aman.ems;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpenseManagementSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ExpenseManagementSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-----------------Application Loaded Successfully-----------------");
	}

}
