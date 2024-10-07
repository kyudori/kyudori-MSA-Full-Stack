package day5;
public class ArrayTest1 {
	public static void main(String[] args) {
		int[] score = new int[5];		
		System.out.println(score.length);
		System.out.println(score);
		System.out.println(score[0]);
		System.out.println(score[4]);
		//System.out.println(score[5]);
		
		score[0] = 15;
		System.out.println(score[0]);
		score[3] = score[0] * 2;
		for(int i=0;i < score.length;i++)
			System.out.print(score[i] + " ");
		System.out.println();
		
		for(int i=score.length-1;i >= 0;i--)
			System.out.print(score[i] + " ");
		System.out.println();
		
		for(int elem : score)
			System.out.print(elem + " ");
		System.out.println();

		for(int i=0;i < score.length;i++)
			score[i] = (i+1) * 10;
		for(int elem : score)
			System.out.print(elem + " ");
		System.out.println();
		
		score = new int[] { 11, 12, 13, 14 };
		System.out.println(score.length);
		System.out.println(score);
		for(int elem : score)
			System.out.print(elem + " ");
		System.out.println();		
	}
}






