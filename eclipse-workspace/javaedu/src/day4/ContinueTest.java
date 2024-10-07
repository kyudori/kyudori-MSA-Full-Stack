package day4;

public class ContinueTest {

	public static void main(String[] args) {
		int num;
		while(true) {
			num = (int)(Math.random()*31); // 0~30
			if (num == 0) {
				System.out.println("\n종료");
				break;
			}
			if (num > 26) {
				System.out.println('@');
				continue; // 계속해서 다음 반복 처리로 넘어가라!
			}
			System.out.printf("%d(%c)", num, 96+num);				
		}
	}
}
