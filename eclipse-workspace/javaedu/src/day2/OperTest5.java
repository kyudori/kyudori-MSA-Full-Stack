package day2;
public class OperTest5 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) + 1; // 1~10
		char result = num % 2 == 1 ? '홀' : '짝';
		System.out.println(num+"은 "+result+"수입니다.");
		System.out.printf("%d은 %c수입니다.\n", num, result);
		
		System.out.println(num+"은 "+(num % 2 == 1 ? '홀' : '짝')+"수입니다.");
	}
}
