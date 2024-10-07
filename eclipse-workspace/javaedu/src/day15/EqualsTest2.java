package day15;
public class EqualsTest2 {
	public static void main(String[] args) {
		if(args.length == 1) {
			System.out.println("전달된 프로그램 아규먼트 : " + args[0]);
			if(args[0].equals("자바"))
				System.out.println("자바의 마스코트는 듀크입니다.");
			else if(args[0].equals("리눅스"))
				System.out.println("리눅스의 마스코트는 턱시입니다.");
			else
				System.out.println("몰라용!!");
		} else {
			System.out.println("프로그램 아규먼트를 한 개만 전달하세요!!");
		}
	}
}
