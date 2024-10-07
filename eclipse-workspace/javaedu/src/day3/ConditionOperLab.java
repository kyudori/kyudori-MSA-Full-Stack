package day3;

public class ConditionOperLab {
    public static void main(String[] args) {
    	
    	int randomValue = (int)(Math.random() * 5) + 1;
        int result = 0;
        
        switch (randomValue) {
        case 1:
            result = 300 + 50;
            break;
        case 2:
            result = 300 - 50;
            break;
        case 3:
            result = 300 * 50;
            break;
        case 4:
            result = 300 / 50;
            break;
        case 5:
            result = 300 % 50;
            break;
        default:
            System.out.println("잘못된 값입니다.");
            return;
    }
    
    System.out.println("결과값 : " + result);
    }
}
