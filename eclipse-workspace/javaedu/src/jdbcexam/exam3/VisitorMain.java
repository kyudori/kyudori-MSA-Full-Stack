package jdbcexam.exam3;

import java.util.List;
import java.util.Scanner;

public class VisitorMain {
	public static void main(String[] args) {
		VisitorDAO crud = new VisitorDAO();
		Scanner scan = new Scanner(System.in);
		loop: while (true) {
			System.out.println("[ DB 연동 메뉴 선택 ]");
			System.out.println("1. 방명록 작성"); //C
			System.out.println("2. 방명록 읽기"); //R
			System.out.println("3. 방명록 수정"); //U
			System.out.println("4. 방명록 삭제"); //D
			System.out.println("5. 방명록 종료");
			System.out.print("입력 : ");
			String aws = "";
			aws = scan.nextLine();
			List<VisitorDTO> vlist = null;
			int id = 0;
			switch (aws) {
			case "1":
				while (true) {
					System.out.print("작성자 이름을 입력하세요 : ");
					String name = scan.nextLine();
					System.out.print("글의 내용을 입력하세요 : ");
					String memo = scan.nextLine();
					VisitorDTO dto = new VisitorDTO();
					dto.setName(name);
					dto.setMemo(memo);
					if(crud.c(dto))
						System.out.println("visitor 테이블에 데이터 삽입 완료~~");
					System.out.print("계속 입력하겠습니까?(y/n) ");
					if (!scan.nextLine().equalsIgnoreCase("y")) 
						break;		
				}
				break;
			case "2":
				vlist = crud.r();
				System.out.println("=".repeat(70));
				for (VisitorDTO dto : vlist)
					System.out.println(dto);
				System.out.println("=".repeat(70));
				break;
			case "3":
				vlist = crud.r();
				for (VisitorDTO dto : vlist)
					System.out.println(dto);				
				System.out.print("수정하려는 글의 번호를 입력하세요 : ");
				VisitorDTO newdto = new VisitorDTO();
				newdto.setId(Integer.parseInt(scan.nextLine()));
				System.out.print("수정할 작성자 이름을 입력하세요 : ");
				newdto.setName(scan.nextLine());
				System.out.print("수정할 글의 내용을 입력하세요 : ");
				newdto.setMemo(scan.nextLine());
				if(crud.u(newdto))				
					System.out.println("visitor 테이블의 데이터 수정 작업 완료~~");
				break;
			case "4":
				vlist = crud.r();
				for (VisitorDTO dto : vlist)
					System.out.println(dto);
				System.out.print("삭제하려는 글의 번호를 입력하세요 : ");
				id = Integer.parseInt(scan.nextLine());
				if(crud.d(id))
					System.out.println("visitor 테이블의 데이터 삭제 작업 완료~~");
				break;
			case "5":
				break loop;
			}
		}
		System.out.println("방명록 애플리케이션을 종료합니다.");
		scan.close();
	}
}
