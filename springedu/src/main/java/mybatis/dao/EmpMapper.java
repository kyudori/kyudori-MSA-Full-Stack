package mybatis.dao;

import com.example.springedu.domain.EmpDTO;
import com.example.springedu.domain.PageDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface EmpMapper {
    @Select("select count(*) from emp")
    public int getAllDataNum();

    @Select("select empno, ename, job, date_format(hiredate, '%Y년 %m월 %d일') hiredate, sal  from emp")
    public List<EmpDTO> listAll();

    @Select("select empno, ename, job, date_format(hiredate, '%Y년 %m월 %d일') hiredate, sal  from emp where empno = #{no}")
    public EmpDTO findEmp1(int no);

    @Select("select empno, ename, job, date_format(hiredate, '%Y년 %m월 %d일') hiredate, sal  from emp where ename = #{name}")
    public EmpDTO findEmp2(String name);

    @Select("select empno, ename, job, date_format(hiredate, '%Y년 %m월 %d일') hiredate, sal  from emp where empno = #{no} and job = #{job}")
    public EmpDTO findEmp3(int no, String job);

    @Select("select empno, ename, job, date_format(hiredate, '%Y년 %m월 %d일') hiredate, sal from emp order by sal limit #{startNum}, #{countNum}")
    public List<EmpDTO> listPart(PageDTO vo);
}