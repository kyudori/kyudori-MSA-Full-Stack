package day2;

public class OperTest2 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 3;
		System.out.println("-----int와 int-----");
		System.out.println(num1 + num2);				//
		System.out.println(num1 - num2);				//
		System.out.println(num1 * num2);				//
		System.out.println(num1 / num2);				//
		System.out.println((double)num1 / num2);	//
		System.out.println(num1 % num2);			//
		double num3 = 5.0;
		double num4 = 3.0;
		System.out.println("-----double과 double-----");
		System.out.println(num3 + num4);				//
		System.out.println(num3 - num4);				//
		System.out.println(num3 * num4);				//
		System.out.println(num3 / num4);				//
		System.out.println(num3 % num4);			//
		System.out.println("-----double과 int-----");
		System.out.println(num3 + num2);				//
		System.out.println(num3 - num2);				//
		System.out.println(num3 * num2);				//
		System.out.println(num3 / num2);				//
		System.out.println(num3 % num2);			//
	}
}
