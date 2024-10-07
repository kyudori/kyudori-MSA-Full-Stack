package jdbcexam.exam2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class SelectData4 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				PreparedStatement pstmt = conn.prepareStatement("select name from student where score >= ?");
				Scanner scan = new Scanner(System.in);){
		    System.out.print("학생의 점수를 입력하세요 : ");
		    int score = scan.nextInt();
		    pstmt.setInt(1, score);
			ResultSet rs = pstmt.executeQuery();			
			if(rs.next()) {
				ArrayList<String> students = new ArrayList<>();
				do {
					students.add(rs.getString("name"));
				} while (rs.next());
				System.out.print("점수가 " + score + "이상인 학생은 ");
				System.out.print(students);
				System.out.println(" 입니다");
			} else 			
				 System.out.println("점수가 " + score + " 이상인 학생은 없습니다.");
			 System.out.println("수행 종료...");
			 rs.close();
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
