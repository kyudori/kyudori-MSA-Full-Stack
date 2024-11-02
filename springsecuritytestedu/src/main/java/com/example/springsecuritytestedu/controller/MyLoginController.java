package com.example.springsecuritytestedu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyLoginController {
    @GetMapping("/mylogin")
    public String hello() {
        return "mylogin";
    }

    @GetMapping("/favicon.ico")
    @ResponseBody
    public ResponseEntity hello2() {
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/bye")
    public String bye() {
        return "bye";
    }
}
