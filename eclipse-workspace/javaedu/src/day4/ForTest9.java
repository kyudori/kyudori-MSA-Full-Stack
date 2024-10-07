package day4;

public class ForTest9 {      

	public static void main(String[] args) {		
		for(int dan = 1; dan <= 9; dan++) {
			for(int num=1; num <= 9; num++) {
				System.out.print(dan + "x" + num + "=" + dan*num + "\t");  //  	81번			
			}
			System.out.println(); //  9번, 개행처리
		}		
	}
}
