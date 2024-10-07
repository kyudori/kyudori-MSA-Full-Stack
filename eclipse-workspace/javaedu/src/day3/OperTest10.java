package day3;

public class OperTest10 {
	public static void main(String[] args) {
		int charCode = 'A'; // 65
		//int charCode = 'a'; // 97
		//int charCode = '5'; // 53

		if( 65<=charCode & charCode<=90 ) { // 비트별 and, 정수형 & 정수형, 논리형 & 논리형
			System.out.println("대문자이군요.");
		}
			
		if( 97<=charCode && charCode<=122 ) {
			System.out.println("소문자이군요.");
		}

		if( 48<=charCode && charCode<=57 ) {
			System.out.println("0~9 숫자이군요.");
		}
		
		if( 0x30<=charCode && charCode<=0x39 ) {
			System.out.println("0~9 숫자이군요.");
		}
		
		//----------------------------------------------------------

		int value = 6;
		//int value = 7;
			
		if( value%2==0 | value%3==0 ) { // 비트별 or, 정수형 | 정수형, 논리형 | 논리형
			System.out.println("2 또는 3의 배수이군요.");
		}

		boolean result = value % 2 == 0 || value % 3 == 0;
		if( !result ) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
	}
}
