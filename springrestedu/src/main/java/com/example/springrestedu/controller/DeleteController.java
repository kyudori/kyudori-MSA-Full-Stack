package com.example.springrestedu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restapi")
public class DeleteController {
    @DeleteMapping(value = "/hello")
    public String delete() {
        return "안녕? DELETE 방식 요청 했네~~~";
    }

    @DeleteMapping(value = "/{variable}")
    public String delete1(@PathVariable String variable) {
        return variable;
    }

    @DeleteMapping(value = "/deletetest1")
    public String delete2(@RequestParam String email) {
        return "e-mail : " + email;
    }

    @DeleteMapping(value = "/deletetest2")
    public ResponseEntity<Object> delete3(int id) {
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .body(null);
    }

    @DeleteMapping(value = "/deletetest3")
    public ResponseEntity<String> delete4(int id) {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(id+"번 글이 삭제되었어요");
    }
}