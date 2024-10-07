package day17;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Person2 implements Comparable<Person2> {
	public String name;
	private int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person2 o) {
		if(age<o.age) return -1;  // 음의 값
		else if(age == o.age) return 0;
		else return 1;
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

public class CollectionSort2 {
	public static void main(String[] args) {
		List<Person2> list = new LinkedList<>();
		Random rand = new Random();
		for(int i=1; i <= 10; i++) {
			list.add(new Person2("duke"+i, rand.nextInt(30)));
		}

		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("\nlist의 데이터들을 오름차순으로 소팅한 결과 : " + list);	
		Collections.reverse(list);
		System.out.println("\nlist의 데이터들을 내림차순으로 소팅한 결과 : " + list);				
	}
}




