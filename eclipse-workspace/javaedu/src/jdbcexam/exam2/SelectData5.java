package jdbcexam.exam2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SelectData5 {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				PreparedStatement pstmt = conn.prepareStatement("select name, score from student where score>=  ? order by score desc");
				Scanner scan = new Scanner(System.in);){
		    System.out.print("점수를 입력하세요 : ");
		   int score = Integer.parseInt(scan.nextLine());
		    pstmt.setInt(1, score);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("[ 점수가 " + score + " 이상인 학생 이름(점수가 높은 순) ]");
				do {
					System.out.println(rs.getString("name") + " : " + rs.getInt("score"));
				} while(rs.next());
			} else 			
				 System.out.println("점수가 " + score + " 이상인 학생은 존재하지 않습니다.");
			 System.out.println("수행 종료...");
			 rs.close();
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
