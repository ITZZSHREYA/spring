package com.example.security.sec;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class controller {
	@GetMapping("/home")
	public String home()
	{
		return "<h1>WELCOME TO SPRING SECURITY </h1>";
	}
	@GetMapping("/hello")
	public String hello()
	{
		return "HELLO WORLD";
		
	}
	@GetMapping("/apple")
	public String apple()
	{
		return "I AM APPLE ";
	}
	

}
