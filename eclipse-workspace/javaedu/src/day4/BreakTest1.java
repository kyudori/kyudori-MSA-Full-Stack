package day4;

public class BreakTest1 {      

	public static void main(String[] args) {
		int result;
		for(int dan = 1; dan <= 9; dan++) {
			for(int num=1; num <= 9; num++) {
				result = dan*num;
				if (result >= 30)
					break;
				System.out.print(dan + "x" + num + "=" + result + "\t");
			}
			System.out.println();
		}		
	}
}
