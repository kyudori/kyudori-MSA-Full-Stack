package day8;

public class MethodLab7 {

    public static void main(String[] args) {
    	printArray(createArray(10));
    	printArray(createArray(5));
    	int[] result = createArray(3);
    	printArray(result);
    }
    
    public static int[] createArray(int n) {
    	int[] ary = new int[n];
    	for (int i = 0; i < n; i++)
    		ary[i] = i + 1;
    	return ary;
    }
    
    public static void printArray(int[] ary) {
    	for (int i = 0; i < ary.length; i++)
    		if (i == (ary.length - 1))
    			System.out.print(ary[i]+"\n");
    		else 
    			System.out.print(ary[i]+", ");
    }
}
