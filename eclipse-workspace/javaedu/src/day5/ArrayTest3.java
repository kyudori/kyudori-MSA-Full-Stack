package day5;

public class ArrayTest3 {
	public static void main(String[] args) {
		boolean a1[] = new boolean[10];
		int a2[] = new int[5];
		float a3[] = new float[20];
		double a4[] = new double[3];
		
		System.out.println(a1);
		System.out.println(a1.length);
		
		System.out.println(a2);
		System.out.println(a2.length);
		
		System.out.println(a3);
		System.out.println(a3.length);
		
		System.out.println(a4);
		System.out.println(a4.length);
		
		a2 = new int[100];
		System.out.println(a2);
		System.out.println(a2.length);
		
	}
}
