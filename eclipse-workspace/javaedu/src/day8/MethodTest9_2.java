package day8;

public class MethodTest9_2 {

	public static void main(String[] args) {
		int v1, v2, v3;
		v1 = 10;
		v2 = 20;
		v3 = 30;
		System.out.println(add(v1, v2));
		System.out.println(add(v3, 100));
		System.out.println(add(v1, v2, v3));
		System.out.println(add(v1, v2, v3, 100));
		System.out.println(add(1, 2, 3, 4, 5, 6,7 ,8 ,9 ,10));
		System.out.println(add());
	}
	
	static int add(int... p) {
//		System.out.println(p.length);
		int result = 0;
		for (int elem: p)
			result += elem;
		return result;
	}
}
