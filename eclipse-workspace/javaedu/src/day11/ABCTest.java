package day11;

class A{
	A(){
		System.out.println("A 클래스의 객체 생성~~");
	}
}

class B extends A{
	B(int n){
		super();
		System.out.println("B 클래스의 객체 생성~~");
	}
}

class C extends B{
	C(){
		super(10);
		System.out.println("C 클래스의 객체 생성~~");
	}
}

public class ABCTest {
	public static void main(String[] args) {
		new C();
	}
}
