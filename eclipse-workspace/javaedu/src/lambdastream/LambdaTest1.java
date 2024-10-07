package lambdastream;

interface Sample {
	int calc(int n);
}

class MyTest {
	static void pr(Sample p) {
		System.out.println(p.calc(10));
	}
}

public class LambdaTest1 {
	public static void main(String[] args) {
		class SampleImpl implements Sample {
			public int calc(int n) {
				return n + 1;
			}
		}
		Sample obj = new SampleImpl();
		MyTest.pr(obj);

		MyTest.pr(new Sample() {
			public int calc(int n) {
				return n + 10;
			}
		});

		MyTest.pr((int n) -> {
			return n + 20;
		});
		MyTest.pr((n) -> {
			return n + 30;
		});
		MyTest.pr(n -> {
			return n + 40;
		});
		MyTest.pr(n -> n + 50);
	}
}
