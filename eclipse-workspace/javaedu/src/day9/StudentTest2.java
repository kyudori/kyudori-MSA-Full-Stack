package day9;

class Student2 {
	String name;
	String subject;
	int grade;
	
	//생성자 Method
	Student2(String n, String s, int g){
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

public class StudentTest2 {

	public static void main(String[] args) {
		Student2 st1 = new Student2("올라프", "Servlet", 2);
		System.out.println(st1.getStudentInfo());
		st1.study();
		
		Student2 st2 = new Student2("안나", "JSP", 3);
		System.out.println(st2.getStudentInfo());
		st2.study();
		
		Student2 st3 = new Student2("엘사", "AJAX", 4);
		System.out.println(st3.getStudentInfo());
		st3.study();
	}
}
