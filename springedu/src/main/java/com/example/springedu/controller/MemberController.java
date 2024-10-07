package com.example.springedu.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.springedu.domain.MemberDTO;

@Controller
public class MemberController {	
	
	@PostMapping("/member1")
	protected ModelAndView proc1(@RequestParam(value = "name", defaultValue = "없음") String name,
			@RequestParam(value = "phone", defaultValue = "없음") String phone,
			@RequestParam(value = "id", defaultValue = "없음") String id,			
			@RequestParam(value = "password", defaultValue = "없음") String password, HttpServletRequest req) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("refinfo", req.getHeader("referer"));
		mav.addObject("name", name);
		mav.addObject("id", id);
		mav.addObject("phone", phone);
		mav.addObject("password", password);
		mav.setViewName("memberView");
		return mav;
	}
	
	@PostMapping("/member2")
	public String proc2(@ModelAttribute("member") MemberDTO dto, HttpServletRequest req, Model model) {
		model.addAttribute("refinfo", req.getHeader("referer"));
		if( dto.getName() == null || dto.getName().equals("")) 			
			dto.setName("없음"); 
		if( dto.getPhone() == null || dto.getPhone().equals("")) 
			dto.setPhone("없음");
		if( dto.getId() == null || dto.getId().equals("")) 
			dto.setId("없음");
		if( dto.getPassword() == null || dto.getPassword().equals("")) 
			dto.setPassword("없음");				
		return "memberView";
	}
	
	@PostMapping("/member3")
	public String proc3(MemberDTO dto, HttpServletRequest req, Model model) { // memberdto 이름으로 request 객체에 보관까지 된다
		model.addAttribute("refinfo", req.getHeader("referer"));
		if( dto.getName() == null || dto.getName().equals("")) 			
			dto.setName("없음"); 
		if( dto.getPhone() == null || dto.getPhone().equals("")) 
			dto.setPhone("없음");
		if( dto.getId() == null || dto.getId().equals("")) 
			dto.setId("없음");
		if( dto.getPassword() == null || dto.getPassword().equals("")) 
			dto.setPassword("없음");				
		
		return "memberView";
	}
}
