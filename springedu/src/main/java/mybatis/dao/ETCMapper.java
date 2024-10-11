package mybatis.dao;

import com.example.springedu.domain.EmpDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.jdbc.SQL;

import java.util.List;

@Mapper
public interface ETCMapper {
    @Select("select empno, ename, job, date_format(hiredate, '%Y년 %m월 %d일') hiredate, sal  from ${t} order by ${c}")
    public List<EmpDTO> list1(@Param("t") String t, @Param("c") String c );

    @Select("select empno, ename, job, date_format(hiredate, '%Y년 %m월 %d일') hiredate, sal  from emp where  ${colname} like  concat('%',#{key},'%')")
    public List<EmpDTO> list2(@Param("colname") String cn, @Param("key") String key );

    @Select("select empno, ename, job, date_format(hiredate, '%Y년 %m월 %d일') "+
            "hiredate, sal  from emp where  empno in (${datalist})")
    public List<EmpDTO> list3(String datalist );

    @Select("<script> select empno, ename, job, date_format(hiredate, '%Y년 %m월 %d일') hiredate, sal  from emp " +
            "<where> " +
            "<if test='ename != null'> ename  like  concat('%',#{ename},'%')</if>" +
            "<if test='sal gt 0'> and  sal > #{sal}</if>" +
            "</where></script>")
    public List<EmpDTO> list4(EmpDTO vo );

    @SelectProvider(type = EmpSqlBuilder.class, method = "buildGetEmpsByName")
    List<EmpDTO> list5(String name);

    class EmpSqlBuilder {
        public static String buildGetEmpsByName(final String name) {
            return new SQL(){{
                SELECT("empno, ename, job, hiredate, sal");
                FROM("emp");
                if (name != null) {
                    WHERE("ename like concat(#{name}, '%')");
                }
                ORDER_BY("sal");
            }}.toString();
        }
    }
}

