package com.example.spingvueedu1.controller;

import io.jsonwebtoken.Claims;
import com.example.spingvueedu1.entity.JwtMember;
import com.example.spingvueedu1.repository.JwtMemberRepository;
import com.example.spingvueedu1.service.JwtService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Map;

@Slf4j
@RestController
@CrossOrigin(origins="http://localhost:5173", allowCredentials = "true" )//SOP 문제 해결과 쿠키를 전달받기 위한 설정

public class AccountController {

    @Autowired
    JwtMemberRepository memberRepository;

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
            Cookie cookie = new Cookie("token", token);
            cookie.setHttpOnly(true);
            cookie.setPath("/");
            res.addCookie(cookie);
            return new ResponseEntity<>("로그인 성공", HttpStatus.OK);
        }

        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/api/account/logout")
    public ResponseEntity<String> logout(@CookieValue(value = "token", required = false) String token, HttpServletResponse res) {
        log.info("logout 실행");
        Cookie cookie = new Cookie("token", token);
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        cookie.setMaxAge(0);
        res.addCookie(cookie);
        return new ResponseEntity<>("로그아웃 성공", HttpStatus.OK);
    }

    @GetMapping("/api/account/check")
    public ResponseEntity check(@CookieValue(value = "token", required = false) String token) {
        log.info("check controller : "+token);
        Claims claims = jwtService.getClaims(token);

        if (claims != null) {
            int id = Integer.parseInt(claims.get("id").toString());
            JwtMember member = memberRepository.findById(id).get();
            return new ResponseEntity<>("반가워요.. "+member.getEmail()+" 회원님!!", HttpStatus.OK);
        }
        return new ResponseEntity<>("로그인을 먼저 수행해 주세용~~~", HttpStatus.OK);
    }
}
