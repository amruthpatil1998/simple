package com.example.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/hi")
	public String Test() {
		return "Hi Well Come to My Frinds Joon ";
		
	}
}
