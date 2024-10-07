package day6;
public class TwoArrayTest5 {
	public static void main(String[] args) {
		 int[][] emp = new int[5][];
	     emp[0] = new int[10];
	     emp[1] = new int[20];
	     emp[2] = new int[50];
	     emp[3] = new int[10];
	     emp[4] = new int[30];
	     
	     for(int row=0; row < emp.length; row++) {
	    	 for(int col=0; col < emp[row].length; col++)
	    		 System.out.print(emp[row][col] + " ");
	    	 System.out.println();
	     }
	}
}
