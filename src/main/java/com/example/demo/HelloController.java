package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Say Hello to ECR ECS!";
	}
	
	@GetMapping("/greetings")
	public String sayHi() {
		return "Welcome to AWS ECS Testing... !";
	}
	@GetMapping
	public String demoapp() {
		return "Welcome to Demo app!";
	}
}
