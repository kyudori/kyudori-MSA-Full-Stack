package day7;

//1. TwoArrayLab2라는 클래스를 만든다.
public class TwoArrayLab2 {

	public static void main(String[] args) {
		//2. 다음의 내용대로 char 타입의 2차원 배열을 생성한다.
		char [][] charArray= { {'B', 'C', 'A', 'A'}, {'C','C','B','B'}, {'D','A','A','D'}};
		//3. 4개의 원소를 갖는 int 타입의 배열을 생성한다.
		int [] charCount = new int[4];
		
		for (int row = 0; row < charArray.length; row++) {
			for (int col = 0; col < charArray[0].length; col++) {
				switch (charArray[row][col]) {
				case 'A':
					charCount[0] += 1;
					break;
				case 'B':
					charCount[1] += 1;
					break;
				case 'C':
					charCount[2] += 1;
					break;
				case 'D':
					charCount[3] += 1;
					break;
				}
			}
		}
		int idx = 0;
		for (int cnt : charCount) {
			System.out.printf("%c는 %d개 입니다.\n", idx+'A', cnt);
			idx++;
			}
	}
}