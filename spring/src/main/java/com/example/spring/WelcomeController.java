package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController
{
	@GetMapping("/Welcome")
	public String Welcome() 
	{
		return "Hello world";
	}
	
	@GetMapping("/FSD")
	public String fsd()
	{
		return "WELCOME TO FSD CLASS";
	}
}