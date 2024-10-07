package day3;

public class ForTest4 {

	public static void main(String[] args) {
		// 1부터 10까지의 합을 출력
		int sumV = 0;

		for (int n = 1; n <= 10; n++) {
			sumV += n; // sumV = sumV + n;
		}
		System.out.println(sumV);
		sumV = 0;
		for (int n = 1; n <= 10; n++) {
			sumV += n*n;
		}
		System.out.println(sumV);
		
	}
}
