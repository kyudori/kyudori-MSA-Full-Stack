package day8;

public class MethodLab5 {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int x = (int)(Math.random() * 30) + 1;
            int y = (int)(Math.random() * 30) + 1;

            System.out.println(x + " 와 " + y + " 의 차는 " + difference(x, y) + " 입니다.");
        }
    }
    
    public static int difference(int num1, int num2) {
        if (num1 > num2)
        	return num1 - num2;
        else
        	return num2 - num1;
    }
}
