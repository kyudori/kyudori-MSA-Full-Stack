package com.example.springrestedu.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.format.TextStyle;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
public class BackendController {
	@GetMapping("/day")
	public ResponseEntity<String> day() {
		log.info("day 요청");
		LocalDate ld = LocalDate.now();
		String day = ld.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault());
		ResponseEntity<String> entity = new ResponseEntity<>(day, HttpStatus.OK);

		return entity;
	}
	@GetMapping("/friends")
	public ResponseEntity<List<FriendVO>> friends() {
		log.info("friends 요청");
		List<FriendVO> list = new ArrayList<>();
		list.add(new FriendVO("둘리"));
		list.add(new FriendVO("또치"));
		list.add(new FriendVO("도우너"));
		ResponseEntity<List<FriendVO>> entity = new ResponseEntity<>(list, HttpStatus.OK);
		return entity;
	}
	@Getter
	@AllArgsConstructor
	public class FriendVO {
		private String name;
	}
}
