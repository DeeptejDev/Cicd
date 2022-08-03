package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class WelcomeController {
	@GetMapping("/msg")
	public String getMessage() {
		return "welcome";
	}

}
