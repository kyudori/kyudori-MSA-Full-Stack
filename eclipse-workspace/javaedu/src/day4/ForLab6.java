package day4;

public class ForLab6 {
    public static void main(String[] args) {
        final char andLogo = '&';

        int randomNum = (int)(Math.random() * 6) + 5;

        for (int i = 1; i <= randomNum; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(andLogo);
            }
            System.out.println();
        }
    }
}
