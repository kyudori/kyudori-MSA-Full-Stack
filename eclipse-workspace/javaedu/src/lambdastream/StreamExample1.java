package lambdastream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("A", "B", "C", "D");

		// 스트림 사용(X)
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String name = iter.next();
			System.out.println(name);
		}
		System.out.println("-".repeat(40));
		// 스트림 사용(O)
		Stream<String> stream1 = list.stream();
		stream1.forEach(name -> System.out.println(name));
		System.out.println("-".repeat(40));
		Stream<String> stream2 = list.stream();
		stream2.forEach(System.out::println);
	}

}
