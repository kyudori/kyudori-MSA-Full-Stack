package jpaexam2.model.dto;

import jpaexam2.model.entity.Dept;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
//@AllArgsConstructor
public class EmpFreqDTO {
	private int empno;
	private String ename;
	private java.sql.Date  hiredate;
	private int sal;
	private Integer deptno;

	public EmpFreqDTO(int empno, String ename, java.sql.Date hiredate, int sal, Dept deptno) {
		this.empno = empno;
		this.ename = ename;
		this.hiredate = hiredate;
		this.sal = sal;
		this.deptno = deptno.getDeptno();
	}
}
