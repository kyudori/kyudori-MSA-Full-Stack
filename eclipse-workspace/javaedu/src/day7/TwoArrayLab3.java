package day7;

//1. TwoArrayLab3 라는 클래스를 만든다.
public class TwoArrayLab3 {

	public static void main(String[] args) {
		//2. 2. 다음의 내용대로 int 타입의 2차원 배열을 생성한다. 데이터는 4주간의 요일별 게임 시간이다.
		char [][] gameTime= { {5,2,1,0,2,3,6}, {4,3,2,1,1,0,5}, {3,1,2,1,3,1,3}, {4,3,1,0,4,2,7}};
		//3. 4개의 원소를 갖는 int 타입의 배열을 생성한다.
		int [] dailyCountTime = new int[7];
		int [] weekCountTime = new int[4];
		char [] dailyName = {'일','월','화','수','목','금','토'};
		
		// 계산
		for (int row = 0; row < gameTime.length; row++) {
			for (int col = 0; col < gameTime[0].length; col++) {
				dailyCountTime[col] += gameTime[row][col];
				weekCountTime[row] += gameTime[row][col];
			}
		}
		
		// 출력
		int idx = 0;
		for (int play : dailyCountTime) {
			System.out.printf("%c", dailyName[idx]);
			System.out.printf("요일:%d시간\n", play);
			idx++;
		}
		
		System.out.println();
		idx = 0;
		
		for (int play : weekCountTime) {
			System.out.printf("%d주차:%d시간\n", idx + 1, play);
			idx++;
		}
	}
}