package jdbcexam.exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectGroupEmp {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT ifnull(deptno,'미정') deptno, concat(count(*),'명') su FROM emp GROUP BY deptno");
		System.out.printf("%8s%12s\n", "부서명", "근무하는 인원");
		System.out.println("  -------------------------------");
		while (rs.next()) {
			System.out.printf("%10s%12s\n", rs.getString("deptno"), rs.getString("su"));
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
