package com.silver.simple.web;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {
	
	public String home() {
		return "Hello world";
	}
}
