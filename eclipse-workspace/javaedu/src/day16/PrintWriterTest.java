package day16;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
	public static void main(String args[]) {
		try (PrintWriter pw = new PrintWriter("c:/iotest/output3.txt");) {
			char arr[] = { '객', '체', '지', '향', '언', '어', ' ',  'J', 'a', 'v', 'a' };
			for (int cnt = 0; cnt < arr.length; cnt++)
				pw.print(arr[cnt]);
			pw.println();
			pw.println(arr);
			pw.println("OCJP 시험 대비!!");
			pw.println(100);
			pw.println(3.14);
			pw.println(true);
			pw.printf("%,d원\n", 1000000);
			pw.printf("%.2f\n", 123.5678);
			System.out.println("파일에 출력 완료!!");
		} catch (IOException ioe) {
			System.out.println("파일로 출력할 수 없습니다.");
		}
	}
}
