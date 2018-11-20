package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestProjectApplication {

	@RequestMapping("/")
	String index() {
		return "Hello World! Hellow haha";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}
}
