package lambdastream;

@FunctionalInterface
interface MyFunctionalInterface2 {
	public void method2(int x);
}

public class LambdaTest6 {
	public static void main(String[] args) {
		MyFunctionalInterface2 fi = (x) -> {
			System.out.println(x);
		};
		fi.method2(2);

		fi = x -> System.out.println(x);
		fi.method2(2);

		fi = System.out::println;
		fi.method2(2);
	}
}
