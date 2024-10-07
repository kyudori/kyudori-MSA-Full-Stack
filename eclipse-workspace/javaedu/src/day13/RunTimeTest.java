package day13;

public class RunTimeTest {
	public static void main(String[] args) throws Exception{
		Runtime r = Runtime.getRuntime();
		
		//r.exec("c:/windows/notepad.exe");
		System.out.println("Runtime 객체의 exec() 메서드로 메모장 프로그램 기동시킴");
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		Runtime r3 = Runtime.getRuntime();
		System.out.println(r);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}
}
