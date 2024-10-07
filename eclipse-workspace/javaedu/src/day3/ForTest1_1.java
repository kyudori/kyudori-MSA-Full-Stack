package day3;

public class ForTest1_1 {
	public static void main(String[] args) {
		int num;
		for(num=1; num <= 10; num++)
		   System.out.println(num);
		System.out.println();
		for(num=1; num <= 10; num+=2)
		   System.out.println(num);
		System.out.println(num);  // 11
	}
}
