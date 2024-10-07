package day11;

class Parent {  
	int x = 1, y = 2;
}
class Child extends Parent {
	int x = 10;
	void printInfo() {
		int x = 100;
		System.out.println(x);			// 	100
		System.out.println(this.x);		//  10
		System.out.println(super.x);	// 	1
		System.out.println(y);			//  2	
		System.out.println(this.y);		// 	2
		System.out.println(super.y);	//  2 	
		//System.out.println(z);
	}
	public String toString() {
		return "Child 클래스의 객체임~~~";
	}
}
public class ParentChildTest {
	public static void main(String[] args) {		
		new Child().printInfo();
		Child obj = new Child();
		obj.printInfo();
		System.out.println(obj.toString());
		System.out.println(obj);
		System.out.println("객체정보 : " + obj);		
		System.out.println("현재시간1 : " + new java.util.Date().toString());
		System.out.println("현재시간2 : " + new java.util.Date());
	}
}



