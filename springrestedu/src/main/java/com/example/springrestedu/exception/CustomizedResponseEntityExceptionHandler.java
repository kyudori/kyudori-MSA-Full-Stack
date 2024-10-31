package com.example.springrestedu.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BookBoardNotFoundException.class)
    public final ResponseEntity<Object> handleUserNotFoundException(Exception ex){
        ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage()+"ㅠㅠ");
        return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
    }
}
