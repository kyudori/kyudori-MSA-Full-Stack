package lambdastream;

import java.util.stream.IntStream;

public class StreamExample4 {
	public static int sum;

	public static void main(String[] args) {
		IntStream stream = IntStream.rangeClosed(1, 5);
		stream.forEach(a -> sum += a);
		System.out.println("총합: " + sum);
		System.out.println("-".repeat(10));
		
		stream = IntStream.rangeClosed(1, 5);
		stream.forEach(System.out::println);
		System.out.println("-".repeat(10));
		
		stream = IntStream.range(1, 5);
		stream.forEach(System.out::println);
	}
}