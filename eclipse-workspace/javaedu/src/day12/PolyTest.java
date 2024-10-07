package day12;

public class PolyTest {

	public static void main(String[] args) {
		printObjectInfo(new Object());
		printObjectInfo("abc");
		printObjectInfo("가나다");
		printObjectInfo(new java.io.File(""));
		printObjectInfo(new java.util.Date());
		printObjectInfo(new int[10]);
		printObjectInfo(new double[] {1.1, 2.2});
		printObjectInfo(new exercise.Human());
		printObjectInfo(Integer.valueOf(100));
		printObjectInfo(100); //auto boxing 구문에 의해서 객체로 전달됨(java.lang.Integer)

	}
	static void printObjectInfo(Object o) {
		if(o instanceof String) {
			System.out.println("문자열이 전달됨: "+ o.toString()+"("+((String)o).length()+")");
		} else {
			System.out.println("o 변수에 전달된 객체의 클래스명: "+ o.getClass().getName());			
		}
	}
}
