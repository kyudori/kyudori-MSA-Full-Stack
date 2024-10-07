package com.example.springedu.domain;

import org.springframework.web.multipart.MultipartFile;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class MemberinfoVO {
	private String id ;
	private String password;
	private MultipartFile image;
	private String email;
	private String my_words;
	private String pwdchk;	
}
