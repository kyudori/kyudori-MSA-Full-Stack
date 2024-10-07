package com.example.springedu.controller;
import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.springedu.domain.CountDTO;
@Controller
public class CountController2 {	
	@RequestMapping(value="/count2")
	public void handle(int num1, int num2, HttpSession s) {
		System.out.println(s.getId());
		if(s.getAttribute("count3") == null )
			s.setAttribute("count3", new CountDTO());
		if(s.getAttribute("count4") == null )
			s.setAttribute("count4", new CountDTO());
		
		CountDTO vo3 = (CountDTO)s.getAttribute("count3");
		CountDTO vo4 = (CountDTO)s.getAttribute("count4");
		
		vo3.setCountNum(num1);
		vo4.setCountNum(num2);
		System.out.println("handle() : "+ 
			      vo3.getCountNum() + " : " + vo4.getCountNum());
		
		System.out.println("=============================");
	}
	@RequestMapping(value="/countdel2")
	public void handle(HttpSession s, String who) {
		if(who != null) {
			s.removeAttribute(who);
			System.out.println(who + " deleted!");		
		}		
		System.out.println("=============================");
	}
}



