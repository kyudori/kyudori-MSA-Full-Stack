package day3;

public class ForLab4 {
	public static void main(String [] args) {
		for (int i = 9; i > 3; i--) {
			if(i%2==1) System.out.printf("%d : 홀수\n", i);
			else System.out.printf("%d : 짝수\n", i);
		}
	}
}
