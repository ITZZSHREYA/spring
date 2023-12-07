package com.example.spring.demo;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class Controller {
	
	@GetMapping("/hello")
	public String home()
	{
		return "HELLO WELCOME TO SPRING SECURITY ";
	}

}
