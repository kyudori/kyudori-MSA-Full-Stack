package day6;

// 1. ArrayLab4 이라는 클래스를 하나 만든다.
public class ArrayLab4 {
    public static void main(String[] args) {
        
        // 2. 5부터 10사이의 난수 추출
        int arraySize = (int) (Math.random()*6) + 5;
        
        // 3. 추출된 난수값을 크기로 갖는 int 타입의 배열 생성 및 초기화
        int[] intArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            intArray[i] = (int) (Math.random()*26) + 1;
        }
        
        // 4. 동일한 크기의 char 타입 배열 생성
        char[] charArray = new char[arraySize];
        
        // 5. int 타입 배열의 원소값을 이용하여 char 타입 배열에 소문자 알파벳 저장
        for (int i = 0; i < arraySize; i++) {
            charArray[i] = (char) ('a' + intArray[i] - 1);
        }
        
        // 6. 두 배열의 원소값 출력
        for (int i = 0; i < arraySize; i++) {
        	if (i != arraySize -1)
        		System.out.print(intArray[i] + ",");
        	else
        		System.out.print(intArray[i]);
        }
        System.out.println();
        
        for (int i = 0; i < arraySize; i++) {
        	if (i != arraySize -1)
        		System.out.print(charArray[i] + ",");
        	else
        		System.out.print(charArray[i]);
        }
        System.out.println();
    }
}
