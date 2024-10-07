package day3;

public class ForTest3 {

	public static void main(String[] args) {
		for(int n=1; n < 20; n++)
			System.out.print(n+ " "); // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19
		System.out.println();
		
		for(int n=10; n > 0; n--)
			System.out.print(n+ " "); // 10 9 8 7 6 5 4 3 2 1
		System.out.println();
		
		for(int n=1; n < 20; n += 3)
			System.out.print(n+ " "); // 1 4 7 10 13 16 19
		System.out.println();
		
		// 1월~12월 까지 하나의 행에 출력해 보자. 
		int month=1;
		for(; month <= 12; month++)
			System.out.print(month+ "월 ");
		System.out.println();
		System.out.println(month);
	}

}
