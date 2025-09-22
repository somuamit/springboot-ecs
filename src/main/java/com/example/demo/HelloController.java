package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Say Hello to";
	}
	
	@GetMapping("/greetings")
	public String sayHi() {
		return "Greetings, Welcome to AWS ECS Testing... !";
	}
	@GetMapping
	public String demoapp() {
		return "Welcome to Demo app!";
	}
	@GetMapping("/testapi")
	public String testapi() {
		return "Hi This is test api for CI/CD !";
	}
	@GetMapping("/newapi")
	public String newapi() {
		return "Hi This is new api !";
	}
}
