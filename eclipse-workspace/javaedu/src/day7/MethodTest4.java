package day7;
public class MethodTest4 {
	public static void main(String[] args) {
		System.out.println("main() 수행시작");
		printMyName(3, '*');
		printMyNameStr("듀크", '$');
		printMyNameStr("듀크", '$');
		printMyNameStr("듀크", '$');
		printMyNameStr("턱시", '!');
		System.out.println("main() 수행종료");
	}	
	static void printMyName(int num, char deco) {
		for(int i=1; i <= num; i++)
			System.out.println(deco+"유니코"+deco);
	}
	static void printMyNameStr(String name, char deco) {
		System.out.println(deco+name+deco);
	}
}
