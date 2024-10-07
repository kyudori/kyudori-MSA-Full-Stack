package day3;
public class IfTest7_2 {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 101); // 0~100		
		// if 문을 사용하여
		// 90~100 - "XX점은 A등급"
		// 80~89 - "XX점은 B등급"
		// 70~79 - "XX점은 C등급"
		// 60~69 - "XX점은 D등급"
		// 0~59 - "XX점은 F등급"
		char grade;
		if(score >= 90)
			grade = 'A';
		else if(score >= 80)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score >= 60)
			grade = 'D';
		else
			grade = 'F';		// 0~59
		System.out.println(score+"점은 "+grade+"등급");
	}
}
