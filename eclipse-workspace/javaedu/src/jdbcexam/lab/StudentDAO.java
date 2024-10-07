package jdbcexam.lab;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import jdbcexam.exam3.MySQLConnUtil;

public class StudentDAO {
    public boolean insertStudent(StudentDTO dto) {
		Connection conn = MySQLConnUtil.connect();
        String sql = "INSERT INTO student (name, score) VALUES (?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, dto.getName());
            pstmt.setInt(2, dto.getScore());
            pstmt.executeUpdate();
            boolean result = true;
            return result; 
        } catch (SQLException se) {
			System.out.println(se.getMessage());
        }
		MySQLConnUtil.close(conn);
        return false;
    }

    public List<StudentDTO> getAllStudent() {
        List<StudentDTO> studentList = new ArrayList<>();
		Connection conn = MySQLConnUtil.connect();
        String sql = "SELECT name, score FROM student";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                String name = rs.getString("name");
                int score = rs.getInt("score");
                studentList.add(new StudentDTO(name, score));
            }
        } catch (SQLException se) {
			System.out.println(se.getMessage());
        }
		MySQLConnUtil.close(conn);
        return studentList;
    }

    public StudentDTO getScore(StudentDTO dto) {
		Connection conn = MySQLConnUtil.connect();
        String sql = "SELECT score FROM student WHERE name = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, dto.getName());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                int score = rs.getInt("score");
                return new StudentDTO(dto.getName(), score);
            }
        } catch (SQLException se) {
			System.out.println(se.getMessage());
        }
		MySQLConnUtil.close(conn);
        return null;
    }
}
