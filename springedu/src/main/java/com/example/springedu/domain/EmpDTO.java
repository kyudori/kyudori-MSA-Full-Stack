package com.example.springedu.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class EmpDTO {
	private int empno;
	private String ename;
	private String job;
	private String hiredate;
	private int sal;	
}
