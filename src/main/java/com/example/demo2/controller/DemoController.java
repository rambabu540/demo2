package com.example.demo2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping("/")
	public Object login() {
		System.out.println("first hit-------");
		return new Object();
	}

}
