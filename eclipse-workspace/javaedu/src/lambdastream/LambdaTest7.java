package lambdastream;

@FunctionalInterface
interface MyFunctionalInterface3 {
	public int method3(int x, int y);
}

public class LambdaTest7 {
	public static void main(String[] args) {
		MyFunctionalInterface3 fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method3(1, 1));

		fi = (x, y) -> {
			return x + y;
		};
		System.out.println(fi.method3(2, 1));

		fi = (x, y) -> x + y;
		System.out.println(fi.method3(3, 1));

		fi = (x, y) -> Math.addExact(x, y);
		System.out.println(fi.method3(4, 1));

		fi = Math::addExact;
		System.out.println(fi.method3(5, 1));

		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method3(6, 1));

		fi = LambdaTest7::sum;
		System.out.println(fi.method3(7, 1));
	}

	public static int sum(int x, int y) {
		return (x + y);
	}
}
