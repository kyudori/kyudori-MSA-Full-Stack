package day3;

public class OperOrLab {
	public static void main(String[] args) {
		int grade = (int)(Math.random()*7)+1;

		if (grade >= 1 && grade <= 3) {
		    System.out.println(grade + " 학년은 저학년입니다.");
		} else if (grade >= 4 && grade <= 6) {
		    System.out.println(grade + " 학년은 고학년입니다.");
		}
	}
}
