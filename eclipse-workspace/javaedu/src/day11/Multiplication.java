package day11;
class Multiplication {
	private int dan;
	private int number;
	Multiplication() {}
	Multiplication(int dan) {
		this.dan = dan;
	}
	Multiplication(int dan, int number){
		this.dan = dan;
		this.number = number;
	}
	void printPart() {
		if (number == 0) {	       
			for(int n=1; n <= 9; n++)
				System.out.print(dan + "*" + n+ "="+dan*n+"\t");
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}
