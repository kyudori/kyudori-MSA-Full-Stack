package day3;
public class IfTest7_1 {
	public static void main(String[] args) {
		int score = (int)(Math.random() * 101); // 0~100		
		// if 문을 사용하여
		// 90~100 - "XX점은 A등급"
		// 80~89 - "XX점은 B등급"
		// 70~79 - "XX점은 C등급"
		// 60~69 - "XX점은 D등급"
		// 0~59 - "XX점은 F등급"
		if(score >= 90 && score<=100)
			System.out.println(score+"점은 A등급");
		else if(score >= 80 && score<=89)
			System.out.println(score+"점은 B등급");
		else if(score >= 70 && score<=79)
			System.out.println(score+"점은 C등급");
		else if(score >= 60 && score<=69)
			System.out.println(score+"점은 D등급");
		else
			System.out.println(score+"점은 F등급");		// 0~59
	}
}
