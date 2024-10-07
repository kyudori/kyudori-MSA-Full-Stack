package day4;

public class ForLab8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 10; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
