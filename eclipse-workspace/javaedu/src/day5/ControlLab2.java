
package day5;
import java.util.*;

public class ControlLab2 {
    public static void main(String[] args) {
        int count = 0;
        
        while(true) {
            Random random = new Random();
            int rdInt = random.nextInt(11) + 10;
            System.out.println("추출된 숫자: " + rdInt);
            
            if(rdInt % 3 == 0 || rdInt % 5 == 0) { 
                int sum = 0;
                for(int i = 1; i <= rdInt; i++) {
                    sum += i;
                }
                count++;
                System.out.printf("%d까지의 합: %d\n", rdInt, sum);
            } 
            else if (rdInt == 11 || rdInt == 17 || rdInt == 19) {
                System.out.printf("%d회 반복함\n", count);
                break;
            } 
            else {
                System.out.println("재수행");
            }
        }
    }
}

