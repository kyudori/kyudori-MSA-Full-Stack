package jdbcexam.exam2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class UpdateData {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				PreparedStatement pstmt = conn.prepareStatement("update student set score = ? where name = ?");
				Scanner scan = new Scanner(System.in);){
			System.out.print("학생 이름을 입력하세요 : ");
		    String name = scan.nextLine();
			System.out.print("학생 점수를 입력하세요 : ");
			int score = Integer.parseInt(scan.nextLine());
			pstmt.setInt(1,  score);
		    pstmt.setString(2, name);
			int updateNum = pstmt.executeUpdate();
			if (updateNum > 0)
				System.out.println("student 테이블에서 " +updateNum + "행 변경 완료");
			else 
				System.out.println("변경 실패!!");
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} 
	}
}
