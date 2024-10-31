package com.example.springrestedu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springrestedu.dto.Message;
import com.example.springrestedu.dto.MemberDTO;

@RestController
public class ResponseEntityController {
    @GetMapping("/test1")
    public ResponseEntity<String> work1(){
        return new ResponseEntity<>("*success*", HttpStatus.OK);
    }
    @GetMapping(value="/test2")
    public ResponseEntity<Message> work2(){
        Message message = Message.builder()
                .msg1("둘리")
                .msg2("또치")
                .msg3("도우너")
                .build();
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    @GetMapping(value="/test3")
    public ResponseEntity work3(){
        return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping(value="/test4")
    public ResponseEntity work4(){
        return new ResponseEntity("오류났슈!!", HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/test5")
    public ResponseEntity work5(){
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/test6")
    public ResponseEntity work6(){
        MultiValueMap<String, String> header = new LinkedMultiValueMap<>();
        header.add("AUTHCODE","xxxxxxx");
        header.add("TOKEN", "yyyyyyy");
        return new ResponseEntity(header, HttpStatus.OK);
    }
    @GetMapping("/test7")
    public ResponseEntity<MemberDTO> work7(){
        MemberDTO dto = new MemberDTO();
        dto.setName("유니코");
        dto.setEmail("unico@naver.com");
        dto.setPhone("010-3333-4444");
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(dto);
    }
}
