package com.example.springsecurityedu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/view")
@Slf4j
public class ViewController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/signup")
    public String joinPage() {
        return "signup_form";
    }

    @GetMapping("/memberpage")
    public String dashboardPage(@AuthenticationPrincipal User user) {
        log.info(user.getUsername()+"님("+user.getAuthorities()+")이 멤버페이지에 접근함 - "+ LocalDateTime.now());
        return "member_page";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/adminrolepage")
    public String adminSettingPage() {
        return "admin_role";
    }

    @PreAuthorize("hasAnyRole('USER')")
    @GetMapping("/userrolepage")
    public String userSettingPage() {
        return "user_role";
    }
}