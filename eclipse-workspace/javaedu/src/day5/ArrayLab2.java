package day5;

// 1. ArrayLab2 라는 클래스를 하나 만든다.
public class ArrayLab2 {
	public static void main(String[] args) {
	// 2. 10개의 숫자(정수)를 저장할 수 있는 배열을 하나 만든다.
	int ary[] = new int[10];	
	// 3. 각각의 element로  4부터 20사이의 난수를 추출하여 저장한다.
	for(int i = 0; i < ary.length; i++) {
		ary[i] = (int)(Math.random()*21)+4;	
	}
	// 4. 모든 원소의 합을 구한다.
	int sum = 0;
	for(int e : ary) sum += e;
	//	5. 다음과 같은 형식으로 출력한다.
	//
	//    모든 원소의 값 : x,x,x,x,x,x,x,x,x,x
	//    모든 원소의 합 : xxx
	System.out.printf("모든 원소의 값 : ");
	for(int j = 0; j < ary.length; j++) {
		if(j == (ary.length - 1)) System.out.printf("%d", ary[j]);
		else System.out.printf("%d,", ary[j]);
	}
	System.out.printf("\n모든 원소의 합 : %d", sum);
	}
}
