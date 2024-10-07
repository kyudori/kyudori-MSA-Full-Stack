package day16;

import java.io.File;
import java.util.Scanner;

public class FileTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점검하려는 파일명을 작성하세요 : ");
		String fileName = scan.nextLine();
		File fObj = new File(fileName);
		if (fObj.isFile()) {
			System.out.println(fileName + "명의 파일이 존재합니다.");
			System.out.println("절대패스 : " + fObj.getAbsolutePath());
			System.out.println("파일명 : " + fObj.getName());
			System.out.println("부모 폴더 : " + fObj.getParent());
			System.out.println("크기 : " + fObj.length());
			System.out.println("URI 기반의 패스 : " + fObj.toURI());
		} else {
			System.out.println(fileName + " : 파일이 아닙니다!");
		}
		scan.close();
	}
}
