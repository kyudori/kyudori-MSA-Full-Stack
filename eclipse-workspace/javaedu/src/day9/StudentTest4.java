package day9;

class Student4 {
	String name;
	String subject;
	int grade;
	
	Student4(){
		//반드시 첫 번째 행에 적어줘야 함
		this("고길동", "Spring Boot", 5);
		System.out.println("매개변수 없는 생성자 호출");
//		name = "고길동";
//		subject = "Spring Boot";
//		grade = 5;
	}
	
	Student4(String n){
		System.out.println("name 매개변수가 선언된 생성자 호출");
		name = n;
	}
	
	//생성자 Method
	Student4(String name, String subject, int grade){
		this.name = name;
		this.subject = subject;
		this.grade = grade;
	}
	
	void study() {
		System.out.println(name + "학생은 " + subject + "과목을 학습합니다.");
	}
	String getStudentInfo() {
		return name + "학생은 " + grade + "학년입니다.";
	}
}

public class StudentTest4 {

	public static void main(String[] args) {
		Student4 st1 = new Student4();
		st1.name = "올라프";
		st1.subject = "Servlet";
		st1.grade = 2;
		System.out.println(st1.getStudentInfo());
		st1.study();
		
		Student4 st2 = new Student4("안나");
		st2.subject = "JSP";
		st2.grade = 3;
		System.out.println(st2.getStudentInfo());
		st2.study();
		
		Student4 st3 = new Student4("엘사", "AJAX", 4);
		System.out.println(st3.getStudentInfo());
		st3.study();
	}
}
