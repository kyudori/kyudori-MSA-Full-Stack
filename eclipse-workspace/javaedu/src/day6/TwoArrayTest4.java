package day6;
public class TwoArrayTest4 {
	public static void main(String[] args) {
		int nums[][] = {
				         { 10, 20, 30},
				         { 11, 21, 31, 41},
				         { 12, 22}						
		               };
		int sum = 0;
		for(int i=0; i < nums.length; i++) 
			for(int j=0; j < nums[i].length; j++)
				sum += nums[i][j];
		System.out.println("전체 데이터의 합 : "+sum);
		
		int sumRow=0, sumCol=0;
		// 마지막 행의 데이터만 합산하여 sumRow에 저장
		for(int col=0; col < nums[2].length; col++)
			sumRow += nums[2][col];
		// 두번째 열의 데이터만 합산하여 sumCol에 저장
		for(int row=0; row < nums.length; row++)
			sumCol += nums[row][1];
		
		System.out.println("마지막 행 데이터의 합 : "+sumRow);
		System.out.println("두번째 열 데이터의 합 : "+sumCol);
	}
}
