package day3;

public class SwitchTest2 {

	public static void main(String[] args) {
		/*
		1~12 사이의 정수 난수를 추출하여 month 변수에 저장
		12, 1, 2 중 하나이면 "x월은 겨울"을 출력 
		3, 4, 5 중 하나이면 "x월은 봄"을 출력
		6, 7, 8 중 하나이면 "x월은 여름"을 출력
		9, 10, 11 중 하나이면 "x월은 가을"을 출력
		*/ 
		int month = (int)(Math.random()*12)+1;			
		switch(month) {
			case 12: 
			case 1: 
			case 2 :
				System.out.println(month + "월은 겨울");
				break;
			case 3:
			case 4:
			case 5 :
				System.out.println(month + "월은 봄");
				break;
			case 6:
			case 7:
			case 8 :
				System.out.println(month + "월은 여름");
				break;
			default:
				System.out.println(month + "월은 가을");
		} 
	}
}
