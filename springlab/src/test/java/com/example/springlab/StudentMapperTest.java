package com.example.springlab;

import com.example.springlab.domain.StudentDTO;
import mybatis.dao.StudentMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class StudentMapperTest{
    @Autowired
    StudentMapper dao;

    @BeforeEach
    void printLine() {
        System.out.println("=".repeat(80));
    }
    @Test
    void test1() {
        dao.listAll().stream().forEach(System.out :: println);
    }
    @Test
    void test2() {
        dao.listOrderByScoreDesc().stream().forEach(System.out :: println);
    }
    @Test
    void test3() {
        dao.listByScoreGreaterEqualThan70().stream().forEach(System.out :: println);
    }
    @Test
    void test4() {
        dao.listByContainName().stream().forEach(System.out :: println);
    }
    @Test
    void test5() {
        System.out.println(dao.getScore("둘리"));
    }
    @Test
    void test6() {
        System.out.println(dao.getScoreAvg());
    }
    @Test
    @Transactional
    void test7() {
        StudentDTO dto = new StudentDTO();
        dto.setName("캐로로");
        dto.setScore(100);
        System.out.println(dao.insert(dto));
        dao.listAll().stream().forEach(System.out :: println);
    }
    @Test
    @Transactional
    void test8() {
        System.out.println(dao.delete("둘리"));
        dao.listAll().stream().forEach(System.out :: println);
    }
}
