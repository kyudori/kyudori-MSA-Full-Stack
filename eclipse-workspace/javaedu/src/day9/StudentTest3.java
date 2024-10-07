package day9;

class Student3 {
	String name;
	String subject;
	int grade;
	
	Student3(){
		System.out.println("매개변수 없는 생성자 호출");
	}
	
	Student3(String n){
		System.out.println("name 매개변수가 선언된 생성자 호출");
		name = n;
	}
	
	//생성자 Method
	Student3(String n, String s, int g){
		name = n;
		subject = s;
		grade = g;
	}
	
	void study() {
		System.out.println(name + "학생은 " + subject + "과목을 학습합니다.");
	}
	String getStudentInfo() {
		return name + "학생은 " + grade + "학년입니다.";
	}
}

public class StudentTest3 {

	public static void main(String[] args) {
		Student3 st1 = new Student3();
		st1.name = "올라프";
		st1.subject = "Servlet";
		st1.grade = 2;
		System.out.println(st1.getStudentInfo());
		st1.study();
		
		Student3 st2 = new Student3("안나");
		st2.subject = "JSP";
		st2.grade = 3;
		System.out.println(st2.getStudentInfo());
		st2.study();
		
		Student3 st3 = new Student3("엘사", "AJAX", 4);
		System.out.println(st3.getStudentInfo());
		st3.study();
	}
}
