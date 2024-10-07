package day4;

public class WhileLab2 {
    public static void main(String[] args) {
        while (true) { 
            int pairNum1 = (int)(Math.random() * 6) + 1;
            int pairNum2 = (int)(Math.random() * 6) + 1;
            
            if (pairNum1 == pairNum2) {
                System.out.println("게임 끝");
                break;  
            } else {
                if (pairNum1 > pairNum2) {
                    System.out.println("pairNum1이 pairNum2 보다 크다.");
                } else {
                    System.out.println("pairNum1이 pairNum2 보다 작다.");
                }
            }
        }
    }
}

