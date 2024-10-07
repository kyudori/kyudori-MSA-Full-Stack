package com.example.springedu.domain;

import lombok.AllArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;

@Getter
@AllArgsConstructor
public class FileVO1 {
	private MultipartFile uploadFile;	
}
