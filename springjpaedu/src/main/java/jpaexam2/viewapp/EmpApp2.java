package jpaexam2.viewapp;

import jpaexam2.model.dao.EmpDAO;
import jpaexam2.model.dto.EmpFreqDTO;
import jpaexam2.model.entity.Emp;

import java.util.List;

public class EmpApp2 {
	public static void hr() {
		System.out.print("-".repeat(100));
		System.out.println();
	}
	public static void main(String[] args)  {
		EmpDAO dao = new EmpDAO();
		System.out.printf("emp 테이블의 데이터 갯수 : %d개 \n",dao.getAllDataNum());
		hr();
		int inputNum = 7499;
		System.out.printf("사번이 %d인 직원의 성명 : %s%n", inputNum, dao.getEmpName(inputNum));
		hr();
		List<Emp> r1 = dao.findByJob("SALESMAN");
		r1.stream().forEach(elem -> System.out.println(elem));
		hr();
		List<Emp> r2 = dao.findByPartEname("T");
		r2.stream().forEach(System.out :: println);
		hr();
		List<Emp> r3 = dao.findByGreaterThanSal(2000);
		r3.stream().forEach(System.out :: println);
		hr();
		List<Emp> r4 = dao.findByEnameAndJob1("MARTIN", "SALESMAN");
		r4.stream().forEach(System.out :: println);
		hr();
		Emp evo = dao.findByEnameAndJob2("MARTIN", "SALESMAN");
		System.out.println(evo);
		hr();
		List<EmpFreqDTO> r5 = dao.findByEmpFreqDTO();
		r5.stream().forEach(System.out :: println);
		hr();
		List<Emp> r6 = dao.listPart(0, 14);
		r6.stream().forEach(System.out :: println);
		hr();
		List<Emp> r7 = dao.listPart(0, 3);
		r7.stream().forEach(System.out :: println);
		hr();
		List<Emp> r8 = dao.listPart(3, 2);
		r8.stream().forEach(System.out :: println);
		hr();
		
		Object[] r9 = dao.getGroupFunc();
		System.out.println("급여 총액 : "+r9[0]);
		System.out.println("최대 급여 : "+r9[1]);
		System.out.println("최소 총액 : "+r9[2]);
		hr();			
		dao.close();	
	}
}
