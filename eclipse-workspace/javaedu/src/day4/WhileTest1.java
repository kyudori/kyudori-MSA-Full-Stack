package day4;

public class WhileTest1 {

	public static void main(String[] args) {
		int sumV=0;
		int num;
		
		while(sumV < 100) {
			num = (int)(Math.random()*50)+1; // 1~50
			sumV += num; // sumV = sumV + num
			System.out.println("num : "+num+", sumV : "+sumV);			
		}
		System.out.println("main() 메서드 수행 종료");
	}
}
