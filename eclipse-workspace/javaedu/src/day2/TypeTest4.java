package day2;

public class TypeTest4 {
	public static void main(String[] args) {
		char c1 = 'A'; // 문자 저장
		char c2 = 65; // 유니코드 직접 저장
		char c3 = '\u0041'; // 유니코드 직접 저장
		char c4 = 0x41;

		char c5 = '가'; // 문자 저장
		char c6 = 44032; // 유니코드 직접 저장
		char c7 = '\uAC00'; // 유니코드 직접 저장
		char c8 = 0xAC00;

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		
		int c9 = 'A';
		System.out.println(c9);
	}
}
