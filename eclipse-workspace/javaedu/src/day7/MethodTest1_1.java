package day7;
public class MethodTest1_1 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		printMyName();
		System.out.println(1);
		printMyName();
		System.out.println(2);
		printMyName();
		System.out.println(3);
		System.out.println("main() 수행종료");
	}
	static void printMyName() {  
		System.out.println("유니코");
		return;
	}
}
