package com.example.springedu.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.springedu.domain.UserVO;

@Controller
public class UserController {

	@ModelAttribute("popularFruit")
	public String[] refPopularFruit() {
		System.out.println("popularFruit 명으로 보관될 문자열 배열객체 생성과 보관");
		return new String[] { "사과", "포도", "수박", "참외" };
	}

	@RequestMapping(value = "/userForm", method = RequestMethod.GET)
	public String userForm() {
		System.out.println("----- UserController.userForm() : GET -----");
		return "userForm";
	}

	@RequestMapping(value = "/userSave", method = RequestMethod.POST)
	public String userSave(UserVO userVo, Model model, HttpServletRequest req) {
		System.out.println("----- UserController.userSave() : POST -----");
		System.out.println("userInfo : " + userVo.toString());
		model.addAttribute("msg", "처리 성공");
		model.addAttribute("refinfo", req.getHeader("referer"));
		return "userInfo";
	}
}
