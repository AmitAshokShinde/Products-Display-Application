package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		//http://localhost:8080/showproduct for product from display
		//http://localhost:8080/showsearch for searching product
		SpringApplication.run(Demo1Application.class, args);
	}

}
