package com.example.springedu.domain;

import lombok.Data;

@Data
public class SubWayVO {
	private String line;
	private String time;
	private int ride;
	private int takeoff;
	private String linep;
}
