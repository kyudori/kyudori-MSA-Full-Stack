package com.example.spingvueedu2.controller;

import io.jsonwebtoken.Claims;
import com.example.spingvueedu2.entity.JwtMember;
import com.example.spingvueedu2.repository.MemberRepository;
import com.example.spingvueedu2.service.JwtService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import jakarta.servlet.http.HttpServletResponse;
import java.util.Map;

@Slf4j
@RestController
@CrossOrigin(origins="http://localhost:5173", allowedHeaders = "*", exposedHeaders="Authorization", allowCredentials = "true")//SOP 문제 해결과 쿠키를 전달받기 위한 설정
public class AccountController {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    JwtService jwtService;

    @PostMapping("/api/account/login")
    public ResponseEntity<String> login(@RequestBody Map<String, String> params,
                                HttpServletResponse res) {
        JwtMember member = memberRepository.findByEmailAndPassword(params.get("email"), params.get("password"));

        log.info("login 실행");

        if (member != null) {
            int id = member.getId();
            String token = jwtService.getToken("id", id);
            MultiValueMap<String, String> header = new LinkedMultiValueMap<>();
            header.add("Authorization", token);
            return new ResponseEntity<>("로그인 성공", header, HttpStatus.OK);
            // authorization
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/api/account/logout")
    public ResponseEntity<String> logout(@RequestHeader(value = "Authorization", required = false) String token, HttpServletResponse res) {
        log.info("logout 실행");
        MultiValueMap<String, String> header = new LinkedMultiValueMap<>();
        header.add("Authorization", "delete");
        return new ResponseEntity<>("로그아웃 성공", header, HttpStatus.OK);
    }

    @GetMapping("/api/account/check")
    public ResponseEntity check(@RequestHeader(value = "Authorization", required = false) String token) {
        log.info("check controller : "+token);
        Claims claims = jwtService.getClaims(token);

        if (claims != null) {
            int id = Integer.parseInt(claims.get("id").toString());
            JwtMember member = memberRepository.findById(id).get();
            return new ResponseEntity<>("반가워요.. "+member.getEmail()+" 회원님!!", HttpStatus.OK);
        }
        return new ResponseEntity<>("로그인을 먼저 수행하세용~~~", HttpStatus.OK);
    }
}
