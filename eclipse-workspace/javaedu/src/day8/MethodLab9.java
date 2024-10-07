package day8;

public class MethodLab9 {

    public static void main(String[] args) {
    	System.out.println(isRightTriangle(3, 4, 5));
    	System.out.println(isRightTriangle(1, 2, 3));
    }
    
    public static boolean isRightTriangle(int width, int height, int hypo) {
        return hypo * hypo == width * width + height * height;
    }
}
