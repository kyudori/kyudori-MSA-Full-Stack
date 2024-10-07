package day4;

public class ForLab9 {
    public static void main(String[] args) {
        int randomNum = (int)(Math.random() * 2) + 1;

        if (randomNum == 1) {
            for (int i = 1; i <= 9; i += 2) {
                for (int j = 1; j <= 9; j++) {
                    System.out.print(i + "x" + j + "=" + (i * j) + "\t");
                }
                System.out.println();
            }
        } else if (randomNum == 2) {
            for (int i = 2; i <= 8; i += 2) {
                for (int j = 1; j <= 9; j++) {
                    System.out.print(i + "x" + j + "=" + (i * j) + "\t");
                }
                System.out.println();
            }
        }
    }
}
