package com.example.springrestedu.controller;

import com.example.springrestedu.dto.ProductDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//컨트롤러
@RestController
//로그 찍기
@Slf4j
public class CartController2 {

    //요청방식, 매핑명
    @GetMapping("/cart2")
    // 접근제어자, 응답형식, 메서드명, 매개변수
    public ProductDTO handleCartRequest(@RequestParam("pid") String productId) {

        String imgName = (productId + ".jpg");
        if(productId.equals("10")) {
            return new ProductDTO("p0"+productId, imgName);
        }
        ProductDTO productDTO = new ProductDTO("p00"+productId, imgName);

        log.info(productDTO.toString());

        //응답 내용
        return productDTO;
    }
}
