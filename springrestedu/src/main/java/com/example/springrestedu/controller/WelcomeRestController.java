package com.example.springrestedu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@GetMapping("/home1")
	public String m1() {
		return "테스트1";
	}
	@GetMapping("/home2")
	public String m2() {
		return "<h1>테스트2</h1>";
	}
}
