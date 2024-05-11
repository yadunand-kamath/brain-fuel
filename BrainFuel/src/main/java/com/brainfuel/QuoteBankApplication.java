package com.brainfuel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuoteBankApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(QuoteBankApplication.class, args);
		System.out.println("Initialized");
		
	}

}
