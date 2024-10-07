package day4;

public class ForTest10 {
	public static void main(String[] args) {
		final char DECO = '*';
		//DECO = '@';
		// 밖에 for 문이 몇번 반복될까? 10번
		// 안에 for 문이 몇번 반복될까? 
		for (int row = 1; row <= 10; row++) {
			for (int count = 1; count <= row; count++)
				System.out.print(DECO);  // 5번, 55번
			System.out.println();
		}

		System.out.println();
		for (int count = 1; count <= 1; count++)
			System.out.print('@');
		System.out.println();
		for (int count = 1; count <= 2; count++)
			System.out.print('@');
		System.out.println();
		for (int count = 1; count <= 3; count++)
			System.out.print('@');
		System.out.println();
		for (int count = 1; count <= 4; count++)
			System.out.print('@');
		System.out.println();
		for (int count = 1; count <= 5; count++)
			System.out.print('@');
	}
}
