package jdbcexam.exam2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectData1 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
				Statement stmt = conn.createStatement()){
			ResultSet rs = stmt.executeQuery("select name, score from student");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"학생은 "+rs.getInt(2)+"점 입니다.");
			}	
			rs.close();
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
