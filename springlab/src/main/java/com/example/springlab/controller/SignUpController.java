package com.example.springlab.controller;

import com.example.springlab.domain.UserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    // GET 요청: 회원가입 폼
    @GetMapping("/signup")
    public String showSignUpForm(Model model) {
        model.addAttribute("user", new UserDTO());
        return "signup";  // src/main/resources/templates/signup.html
    }

    // POST 요청: 회원가입 폼 제출
    @PostMapping("/register")
    public String registerUser(@ModelAttribute("user") UserDTO userDTO, Model model) {
        // DB 저장 없이 단순히 입력 내용 전달 페이지로 이동
        model.addAttribute("user", userDTO);
        return "registerSuccess"; // src/main/resources/templates/registerSuccess.html
    }
}
