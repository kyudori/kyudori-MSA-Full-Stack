package sampleanno2;

public class Emp {
	private String name;
	private int age;
	private double score;
	
	public Emp() {
		super();
		System.out.println("Emp 객체 생성-no args");
	}
	public Emp(String name, int age, double score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		System.out.println("Emp 객체 생성-args");
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Emp 객체의 이름 설정-"+name);
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("Emp 객체의 나이 설정-"+age);
	}
	public void setScore(double score) {
		this.score = score;
		System.out.println("Emp 객체의 점수 설정-"+score);
	}
	@Override
	public String toString() {
		return name+ " is "+age+" years old and has an entry score of "+score;
	}
}









