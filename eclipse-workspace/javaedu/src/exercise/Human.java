package exercise;

public class Human {
	private String name;
	private int age;
	private int height;
	private int weight;
	
	public Human(){}
	
	public Human(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	String printInformation() {
		return name + " " + age + " " + height + " "  + weight;
	}
}
