package day7;
public class MethodTest3 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		printMyName(1, '#');
		System.out.println("--------------");
		printMyName(3, '*');
		System.out.println("--------------");
		int num1 = 2;
		printMyName(num1, '@');
		System.out.println("--------------");
		double num2 = 3.14;
		printMyName((int)num2, '%');
		System.out.println("main() 수행종료");
	}
	static void printMyName(int num, char deco) {
		for(int i=1; i <= num; i++)
			System.out.println(deco+"유니코"+deco);
	}
}
