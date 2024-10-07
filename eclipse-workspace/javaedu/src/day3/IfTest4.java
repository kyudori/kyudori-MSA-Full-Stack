package day3;
public class IfTest4 {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) + 1; // 1~10
		char result;
		if(num % 2 == 1) 
			result = '홀';			
		else 
		    result = '짝';
				
		System.out.println(num+"은 "+result+"수입니다.");
	}
}
