package com.example.springedu.service;
public class FriendNotFoundException extends Exception { 
	private static final long serialVersionUID = 1L;
	public FriendNotFoundException() {
	}
	public FriendNotFoundException(String message) {
		super(message);
	}
}
