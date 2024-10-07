package day5;

public class ArrayTest2 {

	public static void main(String[] args) {
		int score[] = new int[5];		
		System.out.println(score);
		
		for (int i=0; i < score.length; i++)
			System.out.println(score[i]);
	
		int[] score1 = new int[]{100, 200, 300, 400};		
		System.out.println(score1);
		
		for (int i=0; i < score1.length; i++)
			System.out.println(score1[i]);
		
		int[] score2 = {1000, 2000};	// 배열변수 선언을 함께 하는 경우에만 가능	
		System.out.println(score2);
		for (int i=0; i < score2.length; i++)
			System.out.println(score2[i]);
		
		score2 = new int[]{11, 22, 33, 44, 55};
		System.out.println(score2);
		for (int i=0; i < score2.length; i++)
			System.out.println(score2[i]);		
	}
}
