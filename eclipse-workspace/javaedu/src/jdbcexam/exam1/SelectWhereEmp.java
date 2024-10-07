package jdbcexam.exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectWhereEmp {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT ename, sal, comm FROM emp WHERE comm is not null");
		System.out.printf("%8s%8s%8s\n", "성명", "급여", "커미션");
		System.out.println("  -----------------------------------");
		while (rs.next()) {
			System.out.printf("%10s%10d%10d\n", rs.getString("ename"), rs.getInt("sal"), rs.getInt("comm"));
		}
		rs.close();
		stmt.close();
		conn.close();
	}
}
