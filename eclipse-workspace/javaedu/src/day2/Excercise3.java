package day2;

public class Excercise3 {
	public static void main(String[] args) {
		char name1;
		char name2;
		char name3;
		name1 = '한';
		name2 = '규';
		name3 = '현';
		
		System.out.printf("%c%c%c",name1, name2, name3);
		
		int number = 100;
		int result;
		
		result = number + 10;
		System.out.printf("출력형식 : 덧셈 연산의 결과 : %d\n", result);

		result = number - 10;
		System.out.printf("출력형식 : 뺄셈 연산의 결과 : %d\n", result);	

		result = number * 10;
		System.out.printf("출력형식 : 곱셈 연산의 결과 : %d\n", result);	

		result = number / 10;
		System.out.printf("출력형식 : 나눗셈 연산의 결과 : %d\n", result);	
	}
}
