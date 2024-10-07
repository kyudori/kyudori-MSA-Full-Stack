package day6;

public class TwoArrayTest3 {
	public static void main(String[] args) {
		int[][] twoA = { {1,2,3}, 
				         {4,5,6}, 
				         {7,8,9}, 
				         {0,0,0} };		
		System.out.println(twoA); // 
		System.out.println(twoA[0]); // 
		System.out.println(twoA[0][0]); // 
		
		for(int row=0; row < twoA.length; row++) {
			for(int col=0; col < twoA[row].length; col++) {
				System.out.print(twoA[row][col]+"\t");
			}
			System.out.println();
		}		
	}
}



