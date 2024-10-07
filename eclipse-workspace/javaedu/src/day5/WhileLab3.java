package day5;
import java.util.*;

public class WhileLab3 {
    public static void main(String[] args) {
        int count = 0;
        char rdChar;
        System.out.println("[ 수행시작 ]");

        while(true) {
            Random random = new Random();
            int rdInt = random.nextInt(31);

            if (rdInt == 0 || rdInt >= 27) {
                break;
            }

            rdChar = (char) ('A' + rdInt - 1);
            count += 1;
            System.out.printf("%d-%c, %d, 0x%X%n", rdInt, rdChar, (int)rdChar, (int)rdChar);
        }

        System.out.printf("[ 수행 종료 ]- 출력횟수는 %d 번%n", count);
    }
}
