package day8;

public class MethodLab3 {

    public static void main(String[] args) {
        printTriangle('@', 3);
        printTriangle('#', 4);
        printTriangle('A', 5);
    }
    
    public static void printTriangle(char ch, int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
