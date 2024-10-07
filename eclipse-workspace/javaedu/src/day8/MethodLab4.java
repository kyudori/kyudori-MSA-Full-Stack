package day8;

public class MethodLab4 {

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 13;

        System.out.println(num1 + "은 " + (isEven(num1) ? "짝수" : "홀수") + " 입니다.");
        System.out.println(num2 + "은 " + (isEven(num2) ? "짝수" : "홀수") + " 입니다.");
    }
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
