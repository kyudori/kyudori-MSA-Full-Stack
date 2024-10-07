package day9;

class Student {
	String name;
	String subject;
	int grade;
	
	void study() {
		System.out.println(name + "학생은 " + subject + "과목을 학습합니다.");
	}
	String getStudentInfo() {
		return name + "학생은 " + grade + "학년입니다.";
	}
}

public class StudentTest {

	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1);
		st1.study();
		System.out.println(st1.getStudentInfo());
		
		st1.name = "둘리";
		st1.subject = "CSS3";
		st1.grade = 3;
		st1.study();
		System.out.println(st1.getStudentInfo());
		System.out.println(st1.name);
		System.out.println(st1.subject);
		System.out.println(st1.grade);
		
		Student st2 = new Student();
		System.out.println(st2);
		st2.study();
		System.out.println(st1.getStudentInfo());
		
		st2.name = "듀크";
		st2.subject = "JavaScript";
		st2.grade = 4;
		st2.study();
		System.out.println(st1.getStudentInfo());
		
		System.out.println("st2 = st1 수행");
		st2 = st1;
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st1.name);
		System.out.println(st2.name);
	}

}
