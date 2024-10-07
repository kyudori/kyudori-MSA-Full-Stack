package day3;

public class SwitchLab2 {
    public static void main(String[] args) {
    	
    	int randomValue = (int)(Math.random() * 5) + 1;
        int result = 0;
        
        if (randomValue == 1) {
            result = 300 + 50;
        } else if (randomValue == 2) {
            result = 300 - 50;
        } else if (randomValue == 3) {
            result = 300 * 50;
        } else if (randomValue == 4) {
            result = 300 / 50;
        } else if (randomValue == 5) {
            result = 300 % 50;
        }
        
        System.out.println("결과값 : " + result);
    }
}
