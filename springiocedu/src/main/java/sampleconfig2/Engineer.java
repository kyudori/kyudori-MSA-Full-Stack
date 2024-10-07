package sampleconfig2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sampleconfig2.Emp;

@Component
public class Engineer {
	@Autowired
	//@Qualifier("emp1")
	private Emp emp;
	@Autowired
	private String dept;
	
	public Engineer() {
		System.out.println("Engineer 객체 생성 - no args");
	}
	@Autowired
	public void ddd(String dept) {
		this.dept = dept;
		System.out.println("Engineer 객체의 ddd() 메서드에 설정된 메서드 오토와이어를 이용한 dept 변수 설정-"+dept);
	}

	@Override
	public String toString() {
		return emp.toString()+"\n"+ "and works at the "+dept+" department.";
	}
}








