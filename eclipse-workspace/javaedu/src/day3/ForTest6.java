package day3;

public class ForTest6 {      

	public static void main(String[] args) {
		final char DECO = '*';  // 상수
		int count = (int)(Math.random()*20);
		for(int n=0; n < count; n++)
			System.out.print(DECO);	
	}
}
