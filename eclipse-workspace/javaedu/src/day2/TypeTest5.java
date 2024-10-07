package day2;

public class TypeTest5 {
	public static void main(String[] args) {
		// 정밀도 확인
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.printf("%.3f\n", var1); // Java 5
		System.out.printf("%.6f\n", var1);

		// 10의 거듭제곱 리터럴
		double var3 = 3e6; // 3000000
		float var4 = 3e6F;
		double var5 = 2e-3;
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
	}
}