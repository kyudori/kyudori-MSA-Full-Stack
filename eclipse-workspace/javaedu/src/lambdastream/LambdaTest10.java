package lambdastream;

@FunctionalInterface
interface MyFunctionalInterface6 {
	public int method6(String str);
}

public class LambdaTest10 {
	public static void main(String[] args) {
		MyFunctionalInterface6 fi = (String str) -> {
			return str.length();
		};
		System.out.println(fi.method6("HTML"));

		fi = str -> {
			return str.length();
		};
		System.out.println(fi.method6("JAVASCRIPT"));

		fi = str -> str.length();
		System.out.println(fi.method6("CSS"));

		fi =  String::length;
		System.out.println(fi.method6("AJAX"));		
	}
}
