package com.example.springsecurityedu2.controller;

import java.util.List;

import com.example.springsecurityedu2.config.auth.MyUserDetails;
import com.example.springsecurityedu2.entity.MyUser;
import com.example.springsecurityedu2.repository.MyUserRepository;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class RestApiController {
	
	private final MyUserRepository userRepository;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	
	// 인증과정 없이 모든 사람이 접근 가능
	@GetMapping("home")
	public String home() {
		return "<h1>home</h1>";
	}
	
	// 유저, 매니저, 어드민 접근 가능
	@GetMapping("user")
	@PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_MANAGER', 'ROLE_ADMIN')")
	public String user(Authentication authentication) {
		MyUserDetails principal = (MyUserDetails) authentication.getPrincipal();
		System.out.println("principal id : "+principal.getUser().getId());
		System.out.println("principal username : "+principal.getUser().getUsername());
		System.out.println("principal password : "+principal.getUser().getPassword());
		
		return "<h1>user</h1>";
	}
	
	// 매니저, 어드민 접근 가능
	@GetMapping("manager/reports")
	@PreAuthorize("hasAnyRole('ROLE_MANAGER', 'ROLE_ADMIN')")
	public String reports() {
		return "<h1>reports</h1>";
	}
	
	// 어드민만 접근 가능
	@GetMapping("admin/users")
	@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
	public List<MyUser> users(){
		return userRepository.findAll();
	}

	// 인증과정 없이 모든 사람이 접근 가능
	@PostMapping("join")
	public String join(@RequestBody MyUser user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles("USER");
		userRepository.save(user);
		return "회원 가입 완료";
	}

	// 인증과정 없이 모든 사람이 접근 가능
	@PostMapping("login")
	public String login() {
		return "토큰 발행 완료";
	}
}











