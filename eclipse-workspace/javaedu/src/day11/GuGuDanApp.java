package day11;

class GuGuDanExpr extends Multiplication {
    GuGuDanExpr() {}
    GuGuDanExpr(int dan) {
    	super(dan);
    }
    GuGuDanExpr(int dan, int number) {
    	super(dan, number);
    }
    public static void printAll() {
        for (int dan = 1; dan <= 9; dan++) {
            for (int n = 1; n <= 9; n++) {
                System.out.print(dan + "*" + n + "=" + (dan * n) + "  ");
            }
            System.out.println();
        }
    }
}

public class GuGuDanApp {
    public static void main(String[] args) {

        int dan = day8.MethodLab6.getRandom(20);
        int number = day8.MethodLab6.getRandom(20);

        if (dan >= 1 && dan <= 9 && number >= 1 && number <= 9) {
            GuGuDanExpr expr = new GuGuDanExpr(dan, number);
            System.out.print(dan + " * " + number + " = ");
            expr.printPart();
        } 
        else if (dan >= 1 && dan <= 9 && number >= 10) {
        	System.out.print(dan + "단: ");
            GuGuDanExpr expr = new GuGuDanExpr(dan);
            expr.printPart();
        }
        else if (dan >= 10) {
            GuGuDanExpr.printAll();
        }
    }
}
