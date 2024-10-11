package mybatis.dao;

import com.example.springedu.domain.VisitorDTO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface VisitorMapper {
	@Select("select id, name, date_format(writedate, '%Y년 %m월 %d일') writedate, memo from visitor")
	public List<VisitorDTO> list();
	@Select("select id, name, date_format(writedate, '%Y년 %m월 %d일') writedate, memo from visitor where id = #{id}")
	public VisitorDTO one(int id);
	@Select("select id, name, date_format(writedate, '%Y년 %m월 %d일') writedate, memo from visitor where memo like concat('%', #{key},'%')")
	public List<VisitorDTO> search(String keyword);
	@Insert("insert into visitor (name, writedate, memo) values (#{name}, now(), #{memo})")
	public boolean insert(VisitorDTO visitor);
	@Delete("delete from visitor where id = #{id}")
	public boolean delete(String id);
	@Update("update visitor set name = #{name}, memo = #{memo} where id = #{id}")
	public boolean update(VisitorDTO visitor);
}
