package day6;

//1. TwoArrayLab1 라는 클래스를 만든다.
public class TwoArrayLab1 {
    public static void main(String[] args) {
        // 2. 4개의 행과 4개의 열을 갖는 int 타입의 2차원 배열을 생성
        int[][] array = new int[4][4];

        // 3. 배열에 데이터를 대입
        int value = 10;
        for (int i = 0; i < array.length; i++) { //행의 길이
            for (int j = 0; j < array[i].length; j++) { //열의 길이
                array[i][j] = value;
                value += 2;
            }
        }

        // 4. 출력 형식
        System.out.println("1행 1열의 데이터 : " + array[0][0]);
        System.out.println("3행 4열의 데이터 : " + array[2][3]);

        System.out.println("행의 갯수 : " + array.length);
        System.out.println("열의 갯수 : " + array[0].length);

        System.out.print("3행의 데이터들 : ");
        for (int j = 0; j < array[2].length; j++) {
            System.out.print(array[2][j] + " ");
        }
        System.out.println();

        System.out.print("2열의 데이터들 : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][1] + " ");
        }
        System.out.println();

        System.out.print("왼쪽 대각선 데이터들 : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
        }
        System.out.println();

        System.out.print("오른쪽 대각선 데이터들 : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][array.length - i - 1] + " ");
        }
        System.out.println();
    }
}
