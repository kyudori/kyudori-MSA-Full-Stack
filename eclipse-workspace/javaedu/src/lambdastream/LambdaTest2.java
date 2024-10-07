package lambdastream;

interface Calculation {
	public int add(int a, int b);
}

public class LambdaTest2 {
	public static void exec(Calculation com) {
		int k = 10;
		int m = 20;
		int value = com.add(k, m);
		System.out.println("덧셈 결과 : " + value);
	}

	public static void main(String[] args) {
		exec(new Calculation() {
			public int add(int a, int b) {
				return a + b;
			}
		});

		exec((int a, int b) -> {
			return a + b;
		});
		
		exec((a, b) -> a*a + b*b);
	}
}
