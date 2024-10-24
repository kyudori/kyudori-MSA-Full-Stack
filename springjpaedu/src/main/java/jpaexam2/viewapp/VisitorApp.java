package jpaexam2.viewapp;

import jpaexam2.controller.VisitorController;
import java.util.Scanner;

public class VisitorApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		VisitorController vc = new VisitorController();
		while (true) {
			System.out.println("******************************************************");
			System.out.println("처리하고자 하는 작업에 대한 넘버를 입력하세요(^^)");
			System.out.println("1. 방명록 리스트 보기");
			System.out.println("2. 방명록 검색");
			System.out.println("3. 방명록 글 저장");
			System.out.println("4. 방명록 글 수정");
			System.out.println("5. 방명록 글 삭제");
			System.out.println("6. 종료");
			System.out.print("입력 : ");
			int num = scan.nextInt();
			scan.nextLine();
			if (num == 1)
				vc.listVisitor();
			else if (num == 2) {
				System.out.print("검색어를 입력하세요 : ");
				String keyword = scan.nextLine();
				vc.searchVisitor(keyword);
			} else if (num == 3) {
				System.out.println("방명록 글을 작성합니다.");
				System.out.print("작성자 명 : ");
				String name = scan.nextLine();
				System.out.print("방명록 글 : ");
				String memo = scan.nextLine();				
				vc.insertVisitor(name, memo);
			} else if (num == 4) {
				System.out.print("수정하려는 글의 번호를 입력하세요 : ");
				int id = scan.nextInt();
				scan.nextLine();
				if (vc.oneVisitor(id, false)) {
					System.out.println(id + "번 글이 존재합니다.");
					System.out.println("수정하려는 방명록 글의 작성자명과 글 내용을 입력하세요...");
					System.out.print("작성자 명 : ");
					String name = scan.nextLine();
					System.out.print("방명록 글 : ");
					String memo = scan.nextLine();
					vc.updateVisitor(id, name, memo);
				} else {
					System.out.println(id + "번 글이 존재하지 않아요ㅜㅜ");
				}
			} else if (num == 5) {
				System.out.print("삭제하려는 글의 번호를 입력하세요 : ");
				int id = scan.nextInt();
				vc.deleteVisitor(id);
			} else {
				vc.close();
				System.out.println("***************************");
				System.out.println("* 종료합니다요~~~~~빠이~~ *");
				System.out.println("***************************");
				break;
			}
		}
		scan.close();
	}
}
