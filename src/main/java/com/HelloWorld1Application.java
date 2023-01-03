package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HelloWorld1Application {
	
	@GetMapping
	public String message(){
		return "welcome to javatechie";
	}


	public static void main(String[] args) {
		SpringApplication.run(HelloWorld1Application.class, args);
	}

}
