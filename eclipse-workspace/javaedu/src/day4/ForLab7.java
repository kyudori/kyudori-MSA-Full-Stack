package day4;

public class ForLab7 {
    public static void main(String[] args) {
        final char starLogo = '*';

        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(starLogo);
            }
            System.out.println();
        }
    }
}

