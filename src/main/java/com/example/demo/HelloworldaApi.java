package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldaApi {
	
	@GetMapping("/hello")
	public String helloworld(){
		
		return "Welcome to SpringBoot Rest API";
	}
	

}
