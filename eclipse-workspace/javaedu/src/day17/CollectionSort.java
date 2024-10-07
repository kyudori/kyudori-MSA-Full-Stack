package day17;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {		
		return name+"("+age+")";
	}	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}

public class CollectionSort {
	public static void main(String[] args) {
		List<Person> list = new LinkedList<>();
		Random rand = new Random();
		for(int i=1; i <= 10; i++) {
			list.add(new Person("duke"+i, rand.nextInt(30)));
		}

		System.out.println(list);
		
//		Collections.sort(list);
		System.out.println("\nlist의 데이터들을 오름차순으로 소팅한 결과 : " + list);	
		Collections.reverse(list);
		System.out.println("\nlist의 데이터들을 내림차순으로 소팅한 결과 : " + list);				
	}
}




