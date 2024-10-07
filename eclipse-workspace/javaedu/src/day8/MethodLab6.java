package day8;

public class MethodLab6 {

    public static void main(String[] args) {
        for (int i = 0; i <5; i++) {
        	if (i<4)
        		System.out.print(getRandom(10) + ", ");
        	else
        		System.out.println(getRandom(10));
        }
        for (int i = 0; i <5; i++) {
        	if (i<4)
        		System.out.print(getRandom(10, 20) + ", ");
        	else
        		System.out.println(getRandom(10, 20));
        }
    }
    
    public static int getRandom(int n) {
    	return (int) (Math.random() * n) + 1;
    }
    
    public static int getRandom(int n1, int n2) {
    	return (int) (Math.random() * (n2 - n1 + 1)) + n1;
    }
}
