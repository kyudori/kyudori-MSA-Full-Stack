package day3;
public class IfTest6 {
	public static void main(String[] args) {
		int month = (int)(Math.random() * 12) + 1; // 1~12
		if(month == 12 || month == 1 || month == 2)		
			System.out.println(month + " : 겨울");
		else if(month == 3 || month == 4 || month == 5)		
			System.out.println(month + " : 봄");
		else if(month == 6 || month == 7 || month == 8)		
			System.out.println(month + " : 여름");
		else	
			System.out.println(month + " : 가을");
	}
}
