package day3;

public class IfTest2 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 10) + 1; // 1~10
		System.out.println("추출된 num 값 : " + num);
		System.out.println(1);
		if (num % 2 == 1)
			System.out.println(2);
		System.out.println(3);
		if (num % 2 == 0)
			System.out.println(4);
		System.out.println(5);
	}
}
