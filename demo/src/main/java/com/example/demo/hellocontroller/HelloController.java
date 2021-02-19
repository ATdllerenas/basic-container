package com.example.demo.hellocontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
	public String hello() {
	return String.format("Hello World, This is my firts Demo project for Spring Boot");
	}
}
