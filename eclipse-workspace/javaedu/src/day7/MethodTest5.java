package day7;

public class MethodTest5 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		System.out.println(getMyName());
		System.out.println("main() 수행종료");
	}
	
	static String getMyName() {
		return "유니코";
	}
}
