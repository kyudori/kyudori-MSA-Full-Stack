package day2;

public class OperTest9 {
	public static void main(String[] args) {
		int num = 100;
		num++;
		System.out.println(num); // 101
		++num;
		System.out.println(num);	// 102
		--num;
		System.out.println(num);	// 101
		num--;
		System.out.println(num);	// 100
		System.out.println("---------------------");
		int result = num;
		System.out.println(result + " : " + num);	// 100 : 100
		result = num + 1;
		System.out.println(result + " : " + num);	// 101 : 100
		result = ++num;
		System.out.println(result + " : " + num);	// 101 : 101
		result = num++;	
		System.out.println	(result + " : " + num);	// 101 : 102
	}
}
