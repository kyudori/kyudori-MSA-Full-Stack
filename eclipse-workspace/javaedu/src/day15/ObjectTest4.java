package day15;

import java.util.HashSet;
import java.util.Objects;

class Member4 {
	private int id;
	private String name;
	private String password;

	Member4(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}

	public String toString() {
		return "(" + id + ":" + name + ":" + password + ")";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member4 other = (Member4) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(password, other.password);
	}
	
}

public class ObjectTest4 {
	public static void main(String args[]) {
		Member4 obj1 = new Member4(10, "자바", "duke");
		Member4 obj2 = new Member4(10, "자바", "duke");
		Member4 obj3 = new Member4(20, "자바", "duke");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		HashSet<Member4> set = new HashSet<>();
		System.out.println(set.add(obj1));
		System.out.println(set.add(obj2));
		System.out.println(set.add(obj3));
		System.out.println("저장된 데이터의 갯수 : " + set.size());
		System.out.println(set);
	}
}
