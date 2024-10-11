package mybatis.dao;

import com.example.springedu.domain.MeetingDTO;
import com.example.springedu.domain.ReplyVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MeetingMapper {
	@Select("select id, name, title, date_format(meetingdate, '%Y/%m/%d %H:%i') meetingdate from Meeting")
	public List<MeetingDTO> listM();
	@Select("select id, name, title, date_format(meetingdate, '%Y/%m/%d %H:%i') meetingDate from meeting where title like  concat('%',#{key},'%')")
	public List<MeetingDTO> searchM1(String keyword);
	@Select("select id, name, title, date_format(meetingdate, '%Y/%m/%d %H:%i') meetingDate from meeting where name = #{name}")
	public List<MeetingDTO> searchM2(String name);
	@Insert("insert into meeting (name, title, meetingdate) values (#{name}, #{title}, date_format(#{meetingDate}, '%Y/%m/%d %H:%i'))")
	public boolean insertM(MeetingDTO vo);
	@Delete("delete from meeting where id = #{id}")
	public boolean deleteM(int id) ;
	@Update("update meeting set name = #{name}, title = #{title}, meetingdate = date_format(#{meetingDate}, '%Y/%m/%d %H:%i')  where id = #{id}")
	public boolean updateM(MeetingDTO vo);
	@Select("select id, name, content from reply where refid = #{refid}")
	public List<ReplyVO> listReply(int refid);
	@Insert("insert into reply (name, content, refid) values (#{name}, #{content}, #{refid})")
	public boolean insertReply(ReplyVO vo);
}
