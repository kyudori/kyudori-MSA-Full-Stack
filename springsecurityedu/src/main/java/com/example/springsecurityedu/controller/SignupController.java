package com.example.springsecurityedu.controller;

import com.example.springsecurityedu.dto.MemberSignupDTO;
import com.example.springsecurityedu.service.RegisterMemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class SignupController {

    private final RegisterMemberService registerMemberService;

    public SignupController(RegisterMemberService registerMemberService) {
        this.registerMemberService = registerMemberService;
    }

    @PostMapping("/signup")
    public ResponseEntity<String> join(MemberSignupDTO dto) {
        try {
            registerMemberService.join(dto.getUserid(), dto.getPw());
            return ResponseEntity.ok("성공적으로 회원 가입이 진행되었습니다.");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
