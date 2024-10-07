package jdbcexam.exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectEmpLab {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
        String user = "jdbctest";
        String passwd = "jdbctest";
        
        Connection conn = DriverManager.getConnection(url, user, passwd);
        
        Statement stmt = conn.createStatement();
        
        ResultSet rs = stmt.executeQuery("SELECT ename, job, FORMAT(sal, 0) sal, deptno FROM emp");
        
        System.out.printf("%10s%10s%10s%10s\n", "성명", "직무", "급여", "부서");
        System.out.println("  -----------------------------------------");
        
        while (rs.next()) {
            System.out.printf("%10s%10s%10s원%10d\n", 
                    rs.getString("ename"), rs.getString("job"), 
                    rs.getString("sal"), rs.getInt("deptno"));
        }
        
        rs.close();
        stmt.close();
        conn.close();
    }
}
