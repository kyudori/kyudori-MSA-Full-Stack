package day12;

class Circle1 {
	String color;

	void setColor(String color) {
		this.color = color;
	}

	void draw() {
		System.out.println(color + " 원을 그리는 기능");
	}
}

class Rectangle1 {
	String color;

	void setColor(String color) {
		this.color = color;
	}

	void draw() {
		System.out.println(color + " 사각형을 그리는 기능");
	}
}

class Triangle1 {
	String color;

	void setColor(String color) {
		this.color = color;
	}

	void draw() {
		System.out.println(color + " 삼각형을 그리는 기능");
	}
}

public class AbstractTest1 {
	public static void main(String args[]) {
		Circle1 c = new Circle1();
		c.setColor("파란색");
		printInfo(c);
		Rectangle1 r = new Rectangle1();
		r.setColor("분홍색");
		printInfo(r);
		Triangle1 t = new Triangle1();
		t.setColor("연두색");
		printInfo(t);
	}
	static void printInfo(Circle1 obj) {
		obj.draw();
	}
	static void printInfo(Rectangle1 obj) {
		obj.draw();
	}
	static void printInfo(Triangle1 obj) {
		obj.draw();
	}
}