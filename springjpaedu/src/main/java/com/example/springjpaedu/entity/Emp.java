package com.example.springjpaedu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Emp {
	@Id
	private int empno;
	@Column(length = 14)
	private String ename;
	@Column(length = 30)
	private String job;
	private Integer mgr;
	private java.sql.Date  hiredate;
	private int sal;
	private Integer comm;
	private Integer deptno;
}
