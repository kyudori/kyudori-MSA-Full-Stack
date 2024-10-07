package day7;
public class MethodTest1 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		printMyName();		
		printMyName();
		printMyName();
		printMyName();
		printMyName();
		System.out.println("main() 수행종료");
	}
	static void printMyName() {  
		System.out.println("유니코");
	}
}
