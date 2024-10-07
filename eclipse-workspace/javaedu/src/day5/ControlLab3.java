package day5;
import java.util.*;

public class ControlLab3 {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            Random random = new Random();
            int rdInt = random.nextInt(51);
            
            if(rdInt >= 40 && rdInt <= 50) {
                System.out.printf("%d번은 듀크반\n", rdInt);
            } else if(rdInt >= 30 && rdInt <= 39) {
                System.out.printf("%d번은 턱시반\n", rdInt);
            } else if(rdInt >= 20 && rdInt <= 29) {
                System.out.printf("%d번은 둘리반\n", rdInt);
            } else if(rdInt >= 10 && rdInt <= 19) {
                System.out.printf("%d번은 올라프반\n", rdInt);
            } else {
                System.out.printf("%d번은 엘사반\n", rdInt);
            }
        }
    }
}
