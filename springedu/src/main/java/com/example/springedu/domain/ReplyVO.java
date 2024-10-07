package com.example.springedu.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ReplyVO {
	private int id;
	private String name;
	private String content;
	private int refid;
}
