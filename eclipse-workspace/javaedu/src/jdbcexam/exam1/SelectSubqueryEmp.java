package jdbcexam.exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class SelectSubqueryEmp {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		Connection conn = DriverManager.getConnection(url, user, passwd);
		Statement stmt = conn.createStatement();
		Scanner scan = new Scanner(System.in);
		System.out.print("부서명을 입력하세요 : ");
		String departmentname = scan.nextLine();
		ResultSet rs = stmt.executeQuery("SELECT ename, job, sal, deptno  FROM emp "
				+ "WHERE deptno = (SELECT deptno FROM dept WHERE dname = '" + departmentname + "')");

		if (rs.next()) {
			System.out.printf("%8s%8s%8s%4s\n", "성명", "직무", "급여", "부서");
			System.out.println("  -----------------------------------");
			do {
				System.out.printf("%10s%12s%8d%4d\n", rs.getString("ename"), rs.getString("job"), 
						rs.getInt("sal"), rs.getInt("deptno"));
			} while (rs.next());
		} else {
			System.out.println("\n추출되는 직원 정보가 없습니다.");
		}
		scan.close();
		rs.close();
		stmt.close();
		conn.close();
	}
}
