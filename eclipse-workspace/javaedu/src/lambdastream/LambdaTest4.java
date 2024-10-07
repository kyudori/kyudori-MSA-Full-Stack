package lambdastream;

//@FunctionalInterface 
interface Test {
	void run();

	void print();
}

public class LambdaTest4 {
	public static void main(String[] args) {
		Test test = new Test() {
			@Override
			public void run() {
				System.out.println("run");
			}

			@Override
			public void print() {
				System.out.println("print");
			}
		};
		test.run();
		test.print();
	}
}
