package day13;
import java.util.Random;

public class ExceptionTest3_1 {
	public static void main(String[] args) throws TestException {
		System.out.println("main()수행시작");
		a();
		System.out.println("main()수행종료");
	}
	static void a() throws TestException {
		System.out.println("a()수행시작");
		b();		
		System.out.println("a()수행종료");
	}
	static void b() throws TestException {
		System.out.println("b()수행시작");
		c();
		System.out.println("b()수행종료");
	}
	static void c() throws TestException {
		System.out.println("c()수행시작");
		boolean flag = new Random().nextBoolean();
		if(flag){
			throw new TestException("<<:::::테스트로 예외발생시킴:::::>>");
		}else {
			System.out.println("ㅋㅋㅋㅋ");
		}	
		System.out.println("c()수행종료");
	}	
}








