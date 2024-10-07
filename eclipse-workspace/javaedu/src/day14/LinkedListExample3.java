package day14;

import java.util.Iterator;
import java.util.LinkedList;

class LinkedListExample3 {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("망고");
		list.add("파인애플");
		list.add("바나나");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
	}
}
