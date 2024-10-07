package day4;

import java.util.Scanner;

public class BreakContinueTest2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int factNum;

		while (true) {
			System.out.print("양의 숫자를 입력하숑 : ");
			num = input.nextInt();
			if (num == 0) {
				break;			
			} else if (num < 0){
				System.out.println("양수를 입력하지 않아서 다시 입력!!");
				continue;
			} else {
				System.out.println("입력된 숫자 --> "+num);
			}
			factNum = 1;
			for (int i = 1; i <= num; i++)
				factNum *= i;
			System.out.println(num + "! --> " + factNum);
		}
		input.close();
		System.out.println("수행 끝!!");
	}
}
