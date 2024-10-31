package com.example.springrestedu.dto;

import java.time.LocalDateTime;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "boardNo")
public class BookBoard {
	private long boardNo;
	private String title;
	private String content;
	private String writer;
	private LocalDateTime regDate = LocalDateTime.now();
}
