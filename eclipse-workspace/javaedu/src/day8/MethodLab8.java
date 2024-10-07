package day8;

public class MethodLab8 {

    public static void main(String[] args) {
    	System.out.println("호출 1: "+ addEven(10, 2, 5, 13, 7));
    	System.out.println("호출 2: "+ addEven(11, 22, 33, 44, 55, 66));
    	System.out.println("호출 3: "+ addEven());
    	System.out.println("호출 4: "+ addEven(100, 101, 103));
    }
    
    public static int addEven(int... n) {
        if (n.length == 0) {
            return -1;
        }
        
    	int evenSum = 0;
    	for (int even : n)
    		if (even % 2 == 0)
    			evenSum += even;
    	return evenSum;
    }
}
