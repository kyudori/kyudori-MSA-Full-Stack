package day3;

public class ForTest4_1 {

	public static void main(String[] args) {
		// 1부터 10까지의 곱을 출력
		int powerV = 1;

		for (int n = 1; n <= 10; n++) {
			powerV *= n; // powerV = powerV + n;
		}
		System.out.println(powerV);		
	}
}
