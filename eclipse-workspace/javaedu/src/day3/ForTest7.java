package day3;

public class ForTest7 {      

	public static void main(String[] args) {
		int dan = (int)(Math.random()*9)+1;
		for(int num=1; num <= 9; num++)
			System.out.print(dan + "x" + num + "=" + dan*num + "\t");		
	}
}
