package lambdastream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample2 {
	public static void main(String[] args) {
		// Set 컬렉션 생성
		Set<String> set = new HashSet<>();
		set.add("둘리");
		set.add("또치");
		set.add("도우너");
		set.add("또치");

		// Stream을 이용한 요소 반복 처리
		Stream<String> stream = set.stream();
		stream.forEach(name -> System.out.println("*"+name+"*"));
		System.out.println("-".repeat(40));
		
		stream = set.stream();
		stream.forEach(System.out :: println);
		System.out.println("-".repeat(40));
		
		String[] strArray = { "둘리", "또치", "도우너" };
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item -> System.out.println(item  + " 회원님~~ "));
		System.out.println("-".repeat(40));
		
		int[] intArray = { 1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(item -> System.out.println(item*item));
		System.out.println("-".repeat(40));
		
		double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		DoubleStream doubleStream = Arrays.stream(doubleArray);
		doubleStream.forEach(System.out::println);
	}
}