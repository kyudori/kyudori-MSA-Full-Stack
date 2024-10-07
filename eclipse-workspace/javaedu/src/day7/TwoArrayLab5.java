package day7;

//1. TwoArrayLab5 라는 클래스를 만든다.

public class TwoArrayLab5 {
    public static void main(String[] args) {
    	//2. 5개의 행과 3개의 열을 갖는 int 타입의 2차원 배열을 생성하여 다음과 같이 출력한다.
        int[][] arrayNum = new int[5][3];

        for(int row = 0; row < arrayNum.length; row++) {
        	for(int col = 0; col < arrayNum[0].length; col++) {
        		System.out.printf("%d   ", arrayNum[row][col]);
        	}
        	System.out.println();
        }
        
    	System.out.println();
        
        // 3. 2번에서 만든 2차원 배열에 다음과 같이 구성되도록 데이터를 대입한다.
    	int addNum = 1;
    	int addRow = 0;
        for (int col = 0; col < arrayNum[0].length; col++) {
        	for(int row = (0 + addRow); row < (arrayNum.length - addRow); row++) {
        		arrayNum[row][col] += addNum;
        		addNum++;
        	}
    		addRow++;
        }

        for(int row = 0; row < arrayNum.length; row++) {
        	for(int col = 0; col < arrayNum[0].length; col++) {
        		System.out.printf("%d   ", arrayNum[row][col]);
        	}
        	System.out.println();
        }
    }
}
