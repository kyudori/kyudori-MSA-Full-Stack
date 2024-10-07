package com.example.springedu.domain;
public class CountDTO {
	private int countNum;
	public CountDTO() {
		System.out.println("CountVO 객체 생성!!");
	}
	public int getCountNum() {
		return countNum;
	}
	public void setCountNum(int countNum) {
		this.countNum += countNum;
	}	
}
