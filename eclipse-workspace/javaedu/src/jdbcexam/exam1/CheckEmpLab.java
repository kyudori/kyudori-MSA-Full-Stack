package jdbcexam.exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CheckEmpLab {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
        String user = "jdbctest";
        String passwd = "jdbctest";
        
        Connection conn = DriverManager.getConnection(url, user, passwd);
        Statement stmt = conn.createStatement();
        Scanner scan = new Scanner(System.in);

        boolean keepGoing = true;

        while (keepGoing) {
            System.out.print("검색하려는 직원의 이름을 입력하세요: ");
            String searchName = scan.nextLine();

            ResultSet rs = stmt.executeQuery("SELECT ename, hiredate, deptno FROM emp WHERE LOWER(ename) = LOWER('" + searchName + "')");

            if (rs.next()) {
                String name = rs.getString("ename");
                String hireDate = rs.getDate("hiredate").toString();
                int deptno = rs.getInt("deptno");
                System.out.printf("%s 직원은 근무중입니다.%n", name);
                System.out.printf("%s에 입사했고 현재 %d 번 부서에서 근무하고 있습니다.%n", hireDate, deptno);
            } else {
                System.out.printf("%s 직원은 근무하지 않습니다.%n", searchName);
            }

            rs.close();

            System.out.print("계속 검색하시겠습니까? (Y/N): ");
            String response = scan.nextLine();
            if (!response.equalsIgnoreCase("Y")) {
                keepGoing = false;
            }
        }

        stmt.close();
        conn.close();
        scan.close();
    }
}
