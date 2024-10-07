package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class ScannerFromFile {
	public static void main(String args[]) {
		File f = new File("c:/iotest/output.txt");
		try (Scanner scan = new Scanner(f);) {
			if(new Random().nextBoolean()) { 
				System.out.println("[ 행 단위 ]");
				while(scan.hasNext()) 
					System.out.println(scan.nextLine());			
			} else {
				System.out.println("[ 워드 단위 ]");
				while(scan.hasNext()) 
					System.out.println(scan.next());		
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지 않네요...ㅜ");
		}					
	}
}
