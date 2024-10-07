package day5;

public class ArrayTest6 {
	public static void main(String[] args) {
		char letters[] = {'A', 'B', 'z', 't', 'M', 'm'};

		for (char ch : letters) {
			if (ch >= 'A' && ch <= 'Z')
				System.out.println(ch+ "는 대문자입니다.");
			else
				System.out.println(ch+ "는 소문자입니다.");
		}
	}
}
