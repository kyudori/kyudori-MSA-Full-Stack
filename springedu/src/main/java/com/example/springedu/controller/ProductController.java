  package com.example.springedu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.example.springedu.domain.ProductVO;

@Controller
@SessionAttributes("p")
public class ProductController {
	@ModelAttribute("p")
	public ProductVO create() {
		return new ProductVO();
	}
	@GetMapping("/cart")
	public String productCart(@ModelAttribute("p") ProductVO pvo) {		
		return  "productView";
	}
	@GetMapping("/buy")
	public String clearCart(SessionStatus session) {	
		session.setComplete();
		return  "productView";
	}
}




