package mybatis.dao;

import com.example.springlab.domain.StudentDTO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select name, score from student")
    public List<StudentDTO> listAll();

    @Select("select name, score from student order by score desc")
    public List<StudentDTO> listOrderByScoreDesc();

    @Select("select name, score from student where score >= 70")
    public List<StudentDTO> listByScoreGreaterEqualThan70();

    @Select("select name, score from student where name like concat('%', '짱', '%')")
    public List<StudentDTO> listByContainName();

    @Select("select score from student where name = #{name}")
    public int getScore(String name);

    @Select("select avg(score) from student")
    public int getScoreAvg();

    @Insert("insert into student (name, score) values (#{name}, #{score})")
    public boolean insertBook(StudentDTO dto);

    @Delete("delete from student where name = #{name}")
    public boolean delete(String name);
}
