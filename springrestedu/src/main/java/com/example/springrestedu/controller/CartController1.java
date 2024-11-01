package com.example.springrestedu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//컨트롤러
@RestController
//로그 찍기
@Slf4j
public class CartController1 {

    //요청방식, 매핑명
    @GetMapping("/cart1")
    // 접근제어자, 응답형식, 메서드명, 매개변수
    public String handleCartRequest(@RequestParam("pid") String productId) {
        // 추가 기능
        LocalDateTime now = LocalDateTime.now();
        String formattedDateTime = now.format(DateTimeFormatter.ofPattern("MM월 dd일 HH시 mm분"));

        log.info("{}에 {} 상품이 선택되었습니다.", formattedDateTime, productId);

        //응답 내용
        return "컨트롤러의 답변 : " + productId + " 상품을 선택했네요...";
    }
}
