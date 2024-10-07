package lambdastream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample8 {

	public static void main(String[] args) {
		String[] fruits = new String[] { "apple", "oranges", "banana", "pineapple", "oranges", "apple", "mango" };
		Stream<String> fruitsStream = Arrays.stream(fruits);

		List<String> newList1 = fruitsStream.filter(x -> x.endsWith("e")).collect(Collectors.toList());
		List<String> newList2 = Arrays.stream(fruits).map(x -> x.toUpperCase()).collect(Collectors.toList());

		System.out.println(newList1);
		System.out.println("-------------");
		for (String e : newList2)
			System.out.println(e);

	}
}
