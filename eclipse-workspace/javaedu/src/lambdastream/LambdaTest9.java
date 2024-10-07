package lambdastream;

@FunctionalInterface
interface MyFunctionalInterface5 {
	public int[] method5(int size);
}

public class LambdaTest9 {
	public static void main(String[] args) {
		MyFunctionalInterface5 fi = (int size) -> {
			return new int[size];
		};
		System.out.println(fi.method5(10).length);

		fi = size -> {
			return new int[size];
		};
		System.out.println(fi.method5(5).length);

		fi = size -> new int[size];
		System.out.println(fi.method5(8).length);

		fi =  int[]::new;
		System.out.println(fi.method5(20).length);		
	}
}
