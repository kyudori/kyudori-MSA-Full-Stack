package day2;

public class VariableTest4 {
	public static void main(String[] args) {
		System.out.println(100); 					// 100
		int num;  
		num = 1000;
		System.out.println("연산 전 : "+num);	
		num = 10+20;
		System.out.println("연산 후 : "+num);	
		
		char munja = 'A';  
		System.out.print(munja); 					
		munja++; 
		System.out.print(munja); 					
		munja += 1; 											
		System.out.print(munja); 					
		munja = (char)(munja+1); 
		System.out.println(munja); 				
	}
}
