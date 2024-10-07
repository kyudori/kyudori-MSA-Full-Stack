package day4;

public class WhileTest2 {

	public static void main(String[] args) {
		int lottoNum;		
		while(true) {
			lottoNum = (int)(Math.random()*6)+1;
			if(lottoNum == 3) {
				System.out.println("당첨!! ㅋㅋㅋ : "+lottoNum);
				break;
			} else {
				System.out.println("재시도!! ㅠㅠㅠ : "+lottoNum);
			}			
		}
		System.out.println("수행종료...");
	}
}
