package day14;

import java.util.HashSet;

public class HashSetLab1 {
    public static void main(String[] args) {
        HashSet<Integer> lottoNumbers = new HashSet<>();

        while (lottoNumbers.size() < 10) {
            int number = day8.MethodLab6.getRandom(10, 30);
            lottoNumbers.add(number);
        }

        System.out.print("오늘의 로또 번호: ");
        for (int number : lottoNumbers) {
            System.out.print(number + " ");
        }
    }
}
