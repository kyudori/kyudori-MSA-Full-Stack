package lambdastream;

enum Season {
	SPRING, SUMMER, FALL, WINTER
}
public class EnumTest {
	public static void main(String args[]) {
		System.out.println(Season.SPRING);
		System.out.println(Season.SUMMER);
		System.out.println(Season.FALL);
		System.out.println(Season.WINTER);
		Season enum_v = Season.FALL;
		if (enum_v == Season.FALL)
			System.out.println("당신이 좋아하는 계절은 가을!!");
		printFruit(enum_v);
		
		//enum_v = "SPRING"; 
		enum_v = Season.SPRING;	
		if (enum_v == Season.SPRING)
			System.out.println("당신이 좋아하는 계절은 봄!!");
		printFruit(enum_v);
	}
	static void printFruit(Season p) {
		switch (p) {
		case SPRING:
			System.out.println("대저토마토");
			break;
		case SUMMER:
			System.out.println("복숭아");
			break;
		case FALL:
			System.out.println("홍로");
			break;
		case WINTER:
			System.out.println("레드향");
		}		
	}
}
