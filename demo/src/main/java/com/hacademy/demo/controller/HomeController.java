package com.hacademy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	@GetMapping("/")
	@ResponseBody
	public String home() {
		return "Hello!"; 
	}
	
	@RequestMapping("/welcome")
	@ResponseBody
	public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping("/testuser")
	@ResponseBody
	public String testuser() {
		return "Testuser";
	}
	
}
