package day8;

public class MethodTest7 {

	public static void main(String[] args) {
		m1();
		int r = m2(10);
		System.out.println(r * 100);
		System.out.println(r / 10);
		System.out.println(m3(10,20));
		System.out.println("큰 값" + m3(200, 100));		
		boolean r2 = m4('A');
		System.out.println(r2);
		r2 = m4('a');
	}
	static void m1() {
		System.out.println(new java.util.Date());
	}
	static int m2(int p) {
		int sumV = 0;
		for (int n = 1; n <= p; n++)
			sumV += n;
		return sumV;
	}
	static int m3(int p1, int p2) {
		if(p1 > p2)
			return p1;
		else
			return p2;
	}
	static boolean m4(char p) {
		boolean result = false;
		if(p >= 'A' && p <= 'Z')
			result = true;
		return result;
	}
}
