package com.example.springedu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping(value="/requestmethod")
public class RequestMethodController {
	
	public RequestMethodController() {
		System.out.println("RequestMethodController 객체 생성!!");
	}
	@GetMapping
	public String myGet() {
		System.out.println("GET 방식 요청 처리............");
		return  "getResult";
	}	
	@PostMapping
	public String myPost() {
		System.out.println("POST 방식 요청 처리............");
		return  "postResult";
	}
}



