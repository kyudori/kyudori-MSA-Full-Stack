package day3;

public class ForLab6 {
    public static void main(String[] args) {
        int firstRandom = (int)(Math.random() * 8) + 3;
        int secondRandom = (int)(Math.random() * 3) + 1;
        
        char symbol = ' ';
        if (secondRandom == 1) {
            symbol = '*';
        } else if (secondRandom == 2) {
            symbol = '$';
        } else if (secondRandom == 3) {
            symbol = '#';
        }
        
        for (int i = 0; i < firstRandom; i++) {
            System.out.print(symbol);
        }
        System.out.println();
    }
}

