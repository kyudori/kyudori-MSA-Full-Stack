package com.example.springrestedu.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookBoardNotFoundException extends RuntimeException {
    public BookBoardNotFoundException(String message) {
        super(message);
    }
}
