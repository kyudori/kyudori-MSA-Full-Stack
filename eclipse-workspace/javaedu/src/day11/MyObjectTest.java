package day11;

class MyObject{
	
}
class MyObject2{
	public String toString() {
		return "MyObject2 클래스의 객체임!!";
		}
}
class MyObject3{
	@Override
	public String toString() {
		return super.toString() + "MyObject3클래스의 객체임!!";
	}
}

public class MyObjectTest {
	public static void main(String[] args) {
		MyObject obj = new MyObject();
		System.out.println(obj.toString());
		java.util.Date d = new java.util.Date();
		System.out.println(d.toString());
		
		MyObject2 obj2 = new MyObject2();
		System.out.println(obj2.toString());
		System.out.println("-".repeat(30));
		System.out.println(obj);
		System.out.println(d);
		System.out.println(obj2);
		
		System.out.println("-".repeat(30));
		System.out.println("결과1" + obj);
		System.out.println("결과2" + d);
		System.out.println("결과3" + obj2);
		
		System.out.println("-".repeat(30));
		System.out.println("결과:" + new MyObject3());
	}
}
