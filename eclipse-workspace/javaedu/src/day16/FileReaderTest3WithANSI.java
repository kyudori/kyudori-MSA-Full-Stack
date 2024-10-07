package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest3WithANSI {
	public static void main(String args[]) {
		try (FileInputStream fis = new FileInputStream("src/day16/output_ansi.txt");
				InputStreamReader isr = new InputStreamReader(fis, "EUC-KR")) {
			int data;
			System.out.println(isr.getEncoding());
			while (true) {
				data = isr.read();
				if (data == -1)
					break;
				System.out.print((char) data);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}
}
