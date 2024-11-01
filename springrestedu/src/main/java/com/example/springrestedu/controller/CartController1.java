package com.example.springrestedu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
@Slf4j
public class CartController1 {

    @GetMapping("/cart1")
    public String handleCartRequest(@RequestParam("pid") String productId) {
        LocalDateTime now = LocalDateTime.now();
        String formattedDateTime = now.format(DateTimeFormatter.ofPattern("MM월 dd일 HH시 mm분"));

        log.info("{}에 {} 상품이 선택되었습니다.", formattedDateTime, productId);

        return "컨트롤러의 답변 : " + productId + " 상품을 선택했네요...";
    }
}
