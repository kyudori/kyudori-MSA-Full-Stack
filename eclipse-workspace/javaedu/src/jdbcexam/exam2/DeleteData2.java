package jdbcexam.exam2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class DeleteData2 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				PreparedStatement pstmt = conn.prepareStatement("delete from student where score between ? and ?");
				Scanner scan = new Scanner(System.in);){
			System.out.print("삭제하려는 최저 점수 입력 : ");
			int minScore = Integer.parseInt(scan.nextLine());
			System.out.print("삭제하려는 최고 점수 입력 : ");
			int maxScore = Integer.parseInt(scan.nextLine());
			pstmt.setInt(1, minScore);
			pstmt.setInt(2, maxScore);
			int delNum = pstmt.executeUpdate();
			System.out.println("student 테이블에서 " + delNum + "행 삭제 완료");									
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} 
	}
}
