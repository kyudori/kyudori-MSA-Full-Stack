package day5;

// 1. ArrayLab3 라는 클래스를 하나 만든다.
public class ArrayLab3 {
	public static void main(String[] args) {
		// 2. 'J', 'a', 'v', 'a' 라는 element 로 구성되는 char 타입의 배열을 만든다.
		char letters[] = {'J', 'a', 'v', 'a'};
		
		// 3. 각 원소들의 값에서 대문자는 소문자로 소문자는 대문자로 변환하여 저장한다.
		for (int i = 0; i < letters.length; i++) {
			if (letters[i]>=97 && letters[i]<=122) {
				letters[i] = (char) ((int)letters[i] - 32);
			} else {
				letters[i] = (char) ((int)letters[i] + 32);
			}
		}
		// 4. 배열의 element 들을 다음과 같이 출력한다.
		for (char c : letters) {
			System.out.print(c + "\n");
		}
	}
}
