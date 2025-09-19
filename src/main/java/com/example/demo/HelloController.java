package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello!";
	}
	
	@GetMapping("/greetings")
	public String sayHi() {
		return "Welcome to ECS!";
	}
	@GetMapping
	public String demoapp() {
		return "Welcome to Demo app!";
	}
}
