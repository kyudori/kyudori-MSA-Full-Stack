package day7;

//1. TwoArrayLab4 라는 클래스를 만든다.

public class TwoArrayLab4 {
    public static void main(String[] args) {
    	//2. 다음 사양의 int 타입 2차원 배열을 생성한다.
        int[][] array = {
            {10, 20, 30, 40, 50},
            {5, 10, 15},
            {11, 22, 33, 44},
            {9, 8, 7, 6, 5, 4, 3, 2, 1}
        };

        //3. 행단위 합을 구하여 다음과 같이 출력한다.
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.printf("%d행의 합은 %d 입니다.\n", i + 1, sum);
        }
    }
}
