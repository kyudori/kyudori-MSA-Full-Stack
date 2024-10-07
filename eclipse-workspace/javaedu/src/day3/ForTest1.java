package day3;

public class ForTest1 {
	public static void main(String[] args) {
		 for(int num=1; num <= 10; num++) { // 1 2 3 4..... 10
		        System.out.println(num);
		 }
		 System.out.println();
		 for(int num=1; num <= 10; num+=2)  // 1 3 5 7 9
		        System.out.println(num);
		 System.out.println();
		 for(int num=1; num <= 30; num+=2)  // 1 3 5 7 9 11 13 15 17 19 21 23 25 27 29
		        System.out.println(num);
		 //System.out.println(num);
	}
}
