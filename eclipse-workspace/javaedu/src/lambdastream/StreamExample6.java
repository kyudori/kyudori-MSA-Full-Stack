package lambdastream;

import java.util.stream.Stream;

public class StreamExample6 {

	public static void main(String[] args) {
		Stream.of("3", "1", "4", "2", "5", "5")
        .map(x -> {
            System.out.println("map : " + x);
            return Integer.parseInt(x);
        })
        .filter(x -> {
            System.out.println("filter : " + x);
            return x > 1;
        })
        .forEach(x -> {
            System.out.println("forEach : " + x);
        });
	}
}
