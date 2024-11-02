package com.example.springsecuritytestedu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/hello")
    public String hello() {
        return "환영합니다~~~ HomeController 의 처리 결과입니다.";
    }
    @GetMapping("/user")
    public String user() {
        return "로그인을 하면 누구든 볼 수 있는 페이지 입니다.";
    }
    @GetMapping("/role_user")
    public String auth_user() {
        return "USER 권한이 있는 사용자가 볼 수 있는 페이지 입니다.";
    }
    @GetMapping("/role_admin")
    public String admin_user() {
        return "ADMIN 권한이 있는 관리자가 볼 수 있는 페이지 입니다.";
    }
}
