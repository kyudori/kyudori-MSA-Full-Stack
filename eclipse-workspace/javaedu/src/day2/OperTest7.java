package day2;

public class OperTest7 {

	public static void main(String[] args) {
		int su1=10;
		
		System.out.println(su1);  	// 10
		int su2 = ++su1;
		System.out.println(su1);  	// 11
		System.out.println(su2); 		// 11
		int su3 = su1++;
		System.out.println(su1);  	// 12
		System.out.println(su3); 		// 11
		System.out.println(su2); 		// 11
		
		System.out.println(++su2);	// 12
		System.out.println(++su2);	// 13
		System.out.println(++su2);	// 14 
		System.out.println(su2++);	// 14
		System.out.println(su2++);	// 15
		
		su2++;
		++su2;
		System.out.println(su2);  	// 18			
	}
}
