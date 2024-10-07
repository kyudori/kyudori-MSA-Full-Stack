package day15;

import java.io.InputStreamReader;

public class StandardInputChar {

	public static void main(String[] args) throws Exception{
		System.out.print("입력: ");
		int input = new InputStreamReader(System.in).read();
		System.out.print("출력: "+(char)input);

	}

}
