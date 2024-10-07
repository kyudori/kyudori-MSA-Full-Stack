package day3;

public class ForLab3 {
	public static void main(String [] args) {
        int firstRandom = (int)(Math.random() * 10) + 1;
        int secondRandom = (int)(Math.random() * 11) + 30;
        
        int sum = 0;
        for (int i = firstRandom; i <= secondRandom; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        
        System.out.println(firstRandom + "부터 " + secondRandom + "까지의 짝수의 합: " + sum);
    }
}
