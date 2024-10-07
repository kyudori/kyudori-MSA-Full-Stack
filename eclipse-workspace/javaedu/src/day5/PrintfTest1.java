package day5;
public class PrintfTest1 {
	public static void main(String[] args) {
		System.out.printf("테스트입니당%n");	// %n, \n 동일
		System.out.printf("테스트%d입니당\n",10);		
		System.out.printf("%d %x %o %c\n", 100, 100, 100, 100);
		System.out.printf("%d %1$x %1$o %1$c\n", 100);
		System.out.printf("%c %c %c %c\n", '가', 'A', '!', '3');
		System.out.printf("%b\n", true);
		System.out.printf("%f %e\n", 100.0, 100.0);
		System.out.printf("%.2f\n", 123.5678);		
		System.out.printf("%,d원\n", 1000000);			
		System.out.printf("%d %d %d %d %d", 10, 20, 30, 40, 50);
	}
}








