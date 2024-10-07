package day3;

public class ForTest5 {      

	public static void main(String[] args) {
		char letter = 'A';
		for(int n=0; n < 10; n++)
			System.out.print(letter);
		System.out.println("\n----------------");
		for(int n=0; n < 10; n++)
			System.out.print(letter++);
		System.out.println("\n----------------");
		for(int n=0; n < 10; n++)
			System.out.print(letter++);
		System.out.println("\n----------------");
		letter = '가';
		for(int n=0; n < 200; n++)
			System.out.print(letter++);
		System.out.println("\n----------------");
		for(char m='A';m <= 'Z'; m++)
            System.out.print(m);
	}
}
