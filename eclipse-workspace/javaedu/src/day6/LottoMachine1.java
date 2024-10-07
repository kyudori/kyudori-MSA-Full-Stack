package day6;

//1. LottoMachine1 이라는 클래스를 하나 만든다.
public class LottoMachine1 {
    public static void main(String[] args) {
        int arraySize = 6;
        int numberRange = 45;

        int[] intArray = new int[numberRange];

        intArray[0] = (int) (Math.random() * numberRange) + 1;

        for (int i = 1; i < arraySize; i++) {
            int lottoNumber = (int) (Math.random() * numberRange) + 1;

            int j = 0;
            while (j < i) {
                if (intArray[j] == lottoNumber) {
                    lottoNumber = (int) (Math.random() * numberRange) + 1;
                    j = 0;
                } else {
                    j++;
                }
            }

            intArray[i] = lottoNumber;
        }

        System.out.print("오늘의 로또 번호 - ");
        for (int i = 0; i < arraySize; i++) {
            if (i != arraySize - 1)
                System.out.print(intArray[i] + ",");
            else
                System.out.print(intArray[i]);
        }
        System.out.println();
    }
}
